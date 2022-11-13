package com.riot.db.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Table(name="team")
@Entity
@NoArgsConstructor
@Getter @Setter
public class TeamEntity {

    @Id @GeneratedValue
    private long idx;

    private boolean win;

    @Embedded
    private ObjectiveField baron;

    @Embedded
    private ObjectiveField champion;

    @Embedded
    private ObjectiveField dragon;

    @Embedded
    private ObjectiveField inhibitor;

    @Embedded
    private ObjectiveField tower;

    @Embedded
    private ObjectiveField riftHerald; //정글 몬스터


    @ManyToOne
    private MatchEntity match;

    @OneToMany(mappedBy = "team", cascade = CascadeType.ALL)
    private List<BanEntity> banEntity;


    @OneToMany(mappedBy = "team", cascade = CascadeType.ALL)
    private List<ParticipantEntity> participants;

    public int getTeamGold(){
        return participants.stream().mapToInt(ParticipantEntity::getGoldEarned).sum();
    }


    @Embeddable
    @Getter
    @AllArgsConstructor
    @NoArgsConstructor
    static class ObjectiveField {
        private boolean first;
        private int kills;

    }
}

