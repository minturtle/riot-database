package com.riot.db.entity;


import com.entity.Summoner;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="summoner")
@Getter @Setter
@NoArgsConstructor
public class SummonerEntity {

    public SummonerEntity(Summoner summoner) {
        this.profileIconId = summoner.getProfileIconId();
        this.revisionDate = summoner.getRevisionDate();
        this.name = summoner.getName();
        this.eid = summoner.getId();
        this.puuid = summoner.getPuuid();
        this.level = summoner.getSummonerLevel();
    }


    @Id
    @GeneratedValue
    private long idx;

    @Column(name="account_id")
    private String accountId;

    @Column(name="icon_id")
    private int profileIconId;

    @Column(name="revision_date")
    private long revisionDate;

    @Column(name="name")
    private String name;

    private String eid; //encrypted summoner ID

    @Column(unique = true)
    private String puuid; // encrypted puuid

    private long level;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SummonerEntity that = (SummonerEntity) o;
        return idx == that.idx && Objects.equals(puuid, that.puuid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, puuid);
    }
}
