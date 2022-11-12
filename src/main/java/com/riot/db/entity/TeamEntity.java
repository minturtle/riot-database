package com.riot.db.entity;

import javax.persistence.*;
import java.util.List;

@Table(name="team")
@Entity
public class TeamEntity {

    @Id @GeneratedValue
    private long idx;

    private boolean win;

    @Embedded
    private ObjectiveField baron;

    @Embedded
    private ObjectiveField champion;

    @Embedded
    private ObjectiveField dragon;

    @Embedded
    private ObjectiveField inhibitor;

    @Embedded
    private ObjectiveField tower;

    @Embedded
    private ObjectiveField riftHerald; //정글 몬스터

    @OneToMany(mappedBy = "team", cascade = CascadeType.ALL)
    private List<BanEntity> banEntity;


    @OneToMany(mappedBy = "team", cascade = CascadeType.ALL)
    private List<ParticipantEntity> participants;
}
