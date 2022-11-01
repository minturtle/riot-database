package com.riot.db.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Table(name="match")
@Getter
public class MatchEntity {

    @Id
    @GeneratedValue
    private Long idx;
    @OneToOne
    private MetaDataEntity metadata;
    @OneToOne
    private InfoEntity info;
}
