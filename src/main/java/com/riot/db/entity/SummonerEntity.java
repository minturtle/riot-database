package com.riot.db.entity;

import com.entity.Summoner;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name = "Summoner")
@Entity
@NoArgsConstructor
@Getter
public class SummonerEntity {

    public SummonerEntity(Summoner summoner) {
        this.profileIconId = summoner.getProfileIconId();
        this.revisionDate = summoner.getRevisionDate();
        this.name = summoner.getName();
        this.id = summoner.getId();
        this.puuid = summoner.getPuuid();
        this.summonerLevel = summoner.getSummonerLevel();
    }

    @Id
    @GeneratedValue
    private Long idx;

    private Integer profileIconId;
    private Long revisionDate;
    private String name;
    private String id;
    private String puuid;
    private Long summonerLevel;
}
