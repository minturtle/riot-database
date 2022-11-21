package com.riot.db.repository;

import com.riot.db.entity.MatchEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MatchRepository extends JpaRepository<MatchEntity, Long> {

    @Query("SELECT m FROM ParticipantEntity p LEFT JOIN MatchEntity m ON p.team.match=m WHERE p.puuid= :puuid")
    List<MatchEntity> findMatchsByPuuid(String puuid);

    MatchEntity findByMatchId(String matchId);
}
