package com.riot.db.entity;

import com.entity.match.Team;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
import java.util.stream.Collectors;

@Entity
@Table(name="match_team")
@NoArgsConstructor
public class TeamEntity{

    public TeamEntity(Team team, InfoEntity infoEntity) {
        bans = team.getBans().stream().map((ban)->new BanEntity(ban)).collect(Collectors.toList());
        info = infoEntity;
    }

    @Id @GeneratedValue
    private Long idx;

    @OneToMany(mappedBy = "team")
    private List<BanEntity> bans;

    @ManyToOne(fetch = FetchType.LAZY)
    private InfoEntity info;

    @OneToOne
    private ObjectivesEntity objectives;
    private Boolean win;

}
