package com.riot.db.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="team_ban")
@Getter @Setter
@NoArgsConstructor
public class BanEntity {

    public BanEntity(int pickTurn, int championId, TeamEntity team) {
        this.pickTurn = pickTurn;
        this.championId = championId;
        this.team = team;
    }

    @Id @GeneratedValue
    private long idx;

    private int pickTurn;

    private int championId; // 나중에 champion 객체로 바꿔야함.

    @ManyToOne
    private TeamEntity team;
}
