package com.riot.db.entity;

import com.entity.match.MetaData;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@Entity
@Table(name="match_meta")
@Getter
public class MetaDataEntity {

    public MetaDataEntity(MetaData metaData) {
        this.dataVersion = metaData.getDataVersion();
        this.matchId = metaData.getMatchId();
        this.participants = metaData.getParticipants();
    }

    @Id
    @GeneratedValue
    private Long idx;
    private String dataVersion;
    private String matchId;
    @ElementCollection
    private List<String> participants;
}
