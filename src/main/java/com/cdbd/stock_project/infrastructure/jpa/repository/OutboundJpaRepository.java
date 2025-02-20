package com.cdbd.stock_project.infrastructure.jpa.repository;

import com.cdbd.stock_project.infrastructure.jpa.entity.OutboundJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OutboundJpaRepository extends JpaRepository<OutboundJpaEntity, String> {}
