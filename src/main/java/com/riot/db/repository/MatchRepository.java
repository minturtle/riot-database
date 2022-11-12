package com.riot.db.repository;


import com.riot.db.entity.MatchEntity;
import org.springframework.data.jpa.repository.JpaRepository;
public interface MatchRepository extends JpaRepository<MatchEntity, Long> {
    MatchEntity findByIdx(Long idx);

}
