package com.riot.db.repository;

import com.riot.db.entity.SummonerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

public interface SummonerRepository extends JpaRepository<SummonerEntity, Long> {

    @Transactional(readOnly = true)
    SummonerEntity findByName(String name);

    @Transactional(readOnly = true)
    SummonerEntity findByPuuid(String puuid);
}
