package com.riot.db.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="summoner")
@Getter @Setter
@NoArgsConstructor
public class SummonerEntity {


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
    private String puuid; // encrypted puuid

    private long level;
}
