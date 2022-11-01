package com.riot.db.entity;

import com.entity.match.Objective;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="match_objectives")
@NoArgsConstructor
@Getter
public class ObjectivesEntity {

    @Id
    @GeneratedValue
    private Long idx;
    @OneToOne
    private ObjectiveEntity baron;
    @OneToOne
    private ObjectiveEntity champion;
    @OneToOne
    private ObjectiveEntity dragon;
    @OneToOne
    private ObjectiveEntity inhibitor;
    @OneToOne
    private ObjectiveEntity riftHerald;
    @OneToOne
    private ObjectiveEntity tower;

}
