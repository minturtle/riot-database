package com.riot.db.entity;

import com.entity.match.Info;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "match_info")
@NoArgsConstructor
@Getter
public class InfoEntity {

    public InfoEntity(Info info) {
        gameCreation = info.getGameCreation();
        gameDuration = info.getGameDuration();
        gameEndTimestamp = info.getGameEndTimestamp();
        gameId = info.getGameId();
        gameMode = info.getGameMode();
        gameName = info.getGameName();
        gameStartTimestamp = info.getGameStartTimestamp();
        gameType = info.getGameType();
        gameVersion = info.getGameVersion();
        mapId = info.getMapId();
        platfromId = info.getPlatfromId();
        queueId = info.getQueueId();
        tournamentCode = info.getTournamentCode();
    }

    @Id @GeneratedValue
    private Long id;

    private Long gameCreation;
    private Long gameDuration;
    private Long gameEndTimestamp;
    private Long gameId;
    private String gameMode;
    private String gameName;
    private Long gameStartTimestamp;
    private String gameType;
    private String gameVersion;
    private Integer mapId;

    @OneToMany(mappedBy = "info", cascade = CascadeType.ALL)
    private List<ParticipantEntity> participants;
    private String platfromId;
    private Integer queueId;
    @OneToMany(mappedBy = "info", cascade = CascadeType.ALL)
    private List<TeamEntity> teams;
    private String tournamentCode;
}
