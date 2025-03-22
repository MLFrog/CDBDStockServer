package com.cdbd.stock_project.infrastructure.jpa.repository;

import com.cdbd.stock_project.infrastructure.jpa.entity.OutboundJpaEntity;
import com.cdbd.stock_project.infrastructure.jpa.entity.StockJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OutboundJpaRepository extends JpaRepository<OutboundJpaEntity, String> {}
