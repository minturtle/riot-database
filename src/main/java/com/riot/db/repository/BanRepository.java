package com.riot.db.repository;

import com.riot.db.entity.BanEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BanRepository extends JpaRepository<BanEntity, Long> {
}
