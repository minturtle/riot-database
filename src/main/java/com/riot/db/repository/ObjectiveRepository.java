package com.riot.db.repository;

import com.riot.db.entity.ObjectiveEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ObjectiveRepository extends JpaRepository<ObjectiveEntity, Long> {
}
