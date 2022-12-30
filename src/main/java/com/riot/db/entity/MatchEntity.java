package com.riot.db.entity;

import com.entity.match.Info;
import com.entity.match.Match;
import com.entity.match.MetaData;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Entity
@Table(name="_match")
@Getter @Setter
@NoArgsConstructor
public class MatchEntity {

    @Id
    @GeneratedValue
    private long idx;

    public MatchEntity(Match match) {
        MetaData metaData = match.getMetadata();
        Info info = match.getInfo();

        this.dataVersion = metaData.getDataVersion();
        this.matchId = metaData.getMatchId();
        this.gameMode = info.getGameMode();
        this.mapId = info.getMapId();
        this.gameName = info.getGameName();
        this.queueId = info.getQueueId();
        this.gameCreation = info.getGameCreation();
        this.gameDuration = info.getGameDuration();

        if(info.getTeams() != null){
            this.team = info.getTeams().stream().map(team->new TeamEntity(team, this, info.getParticipants())).collect(Collectors.toList());
        }
    }

    @Column(name="data_version")
    private String dataVersion; //Match data version.

    @Column(name="match_id", unique = true)
    private String matchId;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MatchEntity that = (MatchEntity) o;
        return Objects.equals(matchId, that.matchId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matchId);
    }
}
