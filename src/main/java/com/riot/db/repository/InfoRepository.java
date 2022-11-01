package com.riot.db.repository;

import com.riot.db.entity.InfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InfoRepository extends JpaRepository<InfoEntity, Long> {
}
