package com.riot.db.entity;

import com.entity.match.Info;
import com.entity.match.MetaData;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Entity
@Table(name="match")
@Getter @Setter
@NoArgsConstructor
public class MatchEntity {

    @Id
    @GeneratedValue
    private long idx;

    public MatchEntity(MetaData metaData, Info info) {
        this.metaData = metaData;
        this.gameMode = info.getGameMode();
        this.mapId = info.getMapId();
        this.gameName = info.getGameName();
        this.queueId = info.getQueueId();
        this.gameCreation = info.getGameCreation();
        this.gameDuration = info.getGameDuration();
        this.team = info.getTeams().stream().map(team->new TeamEntity(team, this, info.getParticipants())).collect(Collectors.toList());
    }

    @Embedded
    private MetaData metaData;

    @Column(name="game_mode")
    private String gameMode;  // Game Constants(https://static.developer.riotgames.com/docs/lol/gameModes.json)

    @Column(name="map_id")
    private int mapId; // Game Constants(https://static.developer.riotgames.com/docs/lol/maps.json)

    @Column(name="game_name")
    private String gameName;

    @Column(name="queue_id")
    private int queueId; // Game Constants(https://static.developer.riotgames.com/docs/lol/queues.json)

    @Column(name="game_creation")
    private long gameCreation; // Unix timestamp for when the game is created on the game server (i.e., the loading screen).

    @Column(name="game_duration")
    private long gameDuration;

    @OneToMany(mappedBy = "match", cascade = CascadeType.ALL)
    private List<TeamEntity> team;

    @Embeddable
    @NoArgsConstructor

    @Getter @Setter
    public static class MetaData{
        public MetaData(com.entity.match.MetaData metaData) {
            this.dataVersion = metaData.getDataVersion();
            this.matchId = metaData.getMatchId();
        }

        @Column(name="data_version")
        private String dataVersion; //Match data version.

        @Column(name="match_id", unique = true)
        private String matchId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MatchEntity that = (MatchEntity) o;
        return idx == that.idx;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx);
    }
}
