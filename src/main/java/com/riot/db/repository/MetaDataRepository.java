package com.riot.db.repository;

import com.riot.db.entity.MetaDataEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MetaDataRepository extends JpaRepository<MetaDataEntity, Long> {
}
