package com.riot.db.repository;

import com.riot.db.entity.ParticipantEntity;
import com.riot.db.entity.SummonerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

public interface ParticipantRepository extends JpaRepository<ParticipantEntity, Long> {

    @Transactional(readOnly = true)
    ParticipantEntity findAllBySummoner(SummonerEntity summoner);

}
