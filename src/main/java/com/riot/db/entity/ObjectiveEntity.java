package com.riot.db.entity;

import com.entity.match.Objective;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="match_objective")
@NoArgsConstructor
@Getter
public class ObjectiveEntity {

    public ObjectiveEntity(Objective objective) {
        this.first = objective.isFirst();
        this.kills = objective.getKills();
    }

    @Id @GeneratedValue
    private Long idx;
    private boolean first;
    private Integer kills;
}
