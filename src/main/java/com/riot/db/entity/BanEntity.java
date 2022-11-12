package com.riot.db.entity;


import javax.persistence.*;

@Entity
@Table(name="team_ban")
public class BanEntity {

    @Id @GeneratedValue
    private long idx;

    private int pickTurn;

    private int championId; // 나중에 champion 객체로 바꿔야함.

    @ManyToOne
    private TeamEntity team;
}
