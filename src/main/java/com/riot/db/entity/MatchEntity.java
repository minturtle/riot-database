package com.riot.db.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="match")
@Getter @Setter
@NoArgsConstructor
public class MatchEntity {

    @Id
    @GeneratedValue
    private long idx;



    @Column(name="game_mode")
    private String gameMode;  // Game Constants(https://static.developer.riotgames.com/docs/lol/gameModes.json)

    @Column(name="map_id")
    private int mapId; // Game Constants(https://static.developer.riotgames.com/docs/lol/maps.json)
    @Column(name="game_name")
    private String gameName;

    @Column(name="queue_id")
    private int queueId; // Game Constants(https://static.developer.riotgames.com/docs/lol/queues.json)

    @Column(name="data_version")
    private String dataVersion; //Match data version.

    @Column(name="game_creation")
    private long gameCreation; // Unix timestamp for when the game is created on the game server (i.e., the loading screen).

    @Column(name="game_duration")
    private long gameDuration;
}
