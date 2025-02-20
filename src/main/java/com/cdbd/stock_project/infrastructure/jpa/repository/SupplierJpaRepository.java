package com.cdbd.stock_project.infrastructure.jpa.repository;

import com.cdbd.stock_project.infrastructure.jpa.entity.SupplierJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierJpaRepository extends JpaRepository<SupplierJpaEntity, String> {}
