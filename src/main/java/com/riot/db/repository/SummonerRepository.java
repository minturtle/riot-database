package com.riot.db.repository;

import com.riot.db.entity.SummonerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SummonerRepository extends JpaRepository<SummonerEntity, Long> {
}
