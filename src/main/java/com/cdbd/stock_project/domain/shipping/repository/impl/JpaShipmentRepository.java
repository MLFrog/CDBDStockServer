package com.cdbd.stock_project.domain.shipping.repository.impl;


import com.cdbd.stock_project.domain.shipping.Shipment;
import com.cdbd.stock_project.domain.shipping.ShipmentRepository;
import com.cdbd.stock_project.infrastructure.jpa.entity.ShipInfoJpaEntity;
import com.cdbd.stock_project.infrastructure.jpa.repository.ShipInfoJpaRepository;
import org.springframework.util.Assert;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.Optional;

public class JpaShipmentRepository implements ShipmentRepository {

	private final ShipInfoJpaRepository jpaRepository;

    public JpaShipmentRepository(ShipInfoJpaRepository repository) {
        this.jpaRepository = repository;
    }

    private ShipInfoJpaEntity convert(Shipment data) {
		ShipInfoJpaEntity obj = new ShipInfoJpaEntity();

		obj.setId(Optional.ofNullable(data.getId()).orElse(null));
		obj.setOrderId(Optional.ofNullable(data.getOrderId().toString()).orElse(null));
		obj.setSupplier(Optional.ofNullable(data.getSupplier()).orElse(null));
		obj.setItems(Optional.ofNullable(data.getItems()).orElse(null));
		obj.setStatus(Optional.ofNullable(data.getStatus()).orElse("N/A"));
		obj.setCreatedAt(Optional.ofNullable(Timestamp.from(data.getCreatedAt())).orElse(Timestamp.from(Instant.now())));
		obj.setUpdatedAt(Timestamp.from(Instant.now()));
		return obj;
	}

	@Override
	public void save(Shipment shipmentObj) {
		Assert.notNull(shipmentObj, "배송 엔티티는 Null일 수 없습니다.");

		this.jpaRepository.save(convert(shipmentObj));
	}
}
