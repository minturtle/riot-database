package com.riot.db.entity;

import com.entity.match.Ban;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name ="match_ban")
@NoArgsConstructor
@Getter
public class BanEntity {

    public BanEntity(Ban ban) {
        this.championId = ban.getChampionId();
        this.pickTurn = ban.getPickTurn();
    }

    @Id @GeneratedValue
    private Long idx;
    private Integer championId;
    private Integer pickTurn;

    @ManyToOne(fetch = FetchType.LAZY)
    private TeamEntity team;
}
