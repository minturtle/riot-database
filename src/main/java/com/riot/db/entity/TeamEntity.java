package com.riot.db.entity;

import com.entity.match.Objective;
import com.entity.match.Participant;
import com.entity.match.Team;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.repository.query.parser.Part;

import javax.persistence.*;
import java.util.List;
import java.util.stream.Collectors;

@Table(name="team")
@Entity
@NoArgsConstructor
@Getter @Setter
public class TeamEntity {

    public TeamEntity(Team team, MatchEntity match, List<Participant> participants) {
        this.teamId = team.getTeamId();

        this.win = team.getWin();
        this.baron = new BaronField(team.getObjectives().getBaron());
        this.champion = new ChampionField(team.getObjectives().getChampion());
        this.dragon = new DragonField(team.getObjectives().getDragon());
        this.inhibitor = new InhibitorField(team.getObjectives().getInhibitor());
        this.tower = new TowerField(team.getObjectives().getTower());
        this.riftHerald = new RiftHeraldField(team.getObjectives().getRiftHerald());
        this.bans = team.getBans().stream().map(ban->new BanEntity(ban, this)).collect(Collectors.toList());
        this.match = match;
        this.participants = participants.stream().filter(participant -> participant.getTeamId().equals(this.teamId))
                .map(participant->new ParticipantEntity(participant, this)).collect(Collectors.toList());
    }

    @Id @GeneratedValue
    private long idx;

    private boolean win;

    @Column(name="team_id")
    private int teamId;


    @Embedded
    private BaronField baron;

    @Embedded
    private ChampionField champion;

    @Embedded
    private DragonField dragon;

    @Embedded
    private InhibitorField inhibitor;

    @Embedded
    private TowerField tower;

    @Embedded
    private RiftHeraldField riftHerald; //정글 몬스터


    @ManyToOne
    private MatchEntity match;

    @OneToMany(mappedBy = "team", cascade = CascadeType.ALL)
    private List<BanEntity> bans;


    @OneToMany(mappedBy = "team", cascade = CascadeType.ALL)
    private List<ParticipantEntity> participants;

    public int getTeamGold(){
        return participants.stream().mapToInt(ParticipantEntity::getGoldEarned).sum();
    }


    @Embeddable
    @Getter
    @NoArgsConstructor
    static class BaronField {
        public BaronField(Objective baron) {
            kills = baron.getKills();
            first = baron.isFirst();
        }

        @Column(name="baron_first")
        private boolean first;
        @Column(name="baron_kill_count")
        private int kills;
    }

    @Embeddable
    @Getter
    @NoArgsConstructor
    static class DragonField {
        public DragonField(Objective dragon) {
            kills = dragon.getKills();
            first = dragon.isFirst();
        }

        @Column(name="dragon_first")
        private boolean first;
        @Column(name="dragon_kill_count")
        private int kills;
    }

    @Embeddable
    @Getter
    @NoArgsConstructor
    static class ChampionField {
        public ChampionField(Objective championKillData) {
            kills = championKillData.getKills();
            first = championKillData.isFirst();
        }

        @Column(name="champion_first")
        private boolean first;
        @Column(name="champion_kill_count")
        private int kills;
    }

    @Embeddable
    @Getter
    @NoArgsConstructor
    static class InhibitorField {

        public InhibitorField(Objective inhibitor) {
            kills = inhibitor.getKills();
            first = inhibitor.isFirst();
        }

        @Column(name="inhibitor_first")
        private boolean first;
        @Column(name="inhibitor_kill_count")
        private int kills;
    }

    @Embeddable
    @Getter
    @NoArgsConstructor
    static class TowerField {

        public TowerField(Objective tower) {
            kills = tower.getKills();
            first = tower.isFirst();
        }

        @Column(name="tower_first")
        private boolean first;
        @Column(name="tower_kill_count")
        private int kills;
    }

    @Embeddable
    @Getter
    @NoArgsConstructor
    static class RiftHeraldField {

        public RiftHeraldField(Objective riftHerald) {
            kills = riftHerald.getKills();
            first = riftHerald.isFirst();
        }

        @Column(name="riftherald_first")
        private boolean first;
        @Column(name="riftherald_kill_count")
        private int kills;
    }
}

