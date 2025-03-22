package com.cdbd.stock_project.infrastructure.jpa.repository;

import com.cdbd.stock_project.infrastructure.jpa.entity.ShipInfoJpaEntity;
import com.cdbd.stock_project.infrastructure.jpa.entity.SupplierJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShipInfoJpaRepository extends JpaRepository<ShipInfoJpaEntity, String> {
    ShipInfoJpaEntity findByShipmentId(String shipmentId);
}
