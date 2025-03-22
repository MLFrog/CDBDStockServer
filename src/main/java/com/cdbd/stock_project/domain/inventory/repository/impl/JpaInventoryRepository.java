package com.cdbd.stock_project.domain.inventory.repository.impl;


import com.cdbd.stock_project.domain.inventory.Inventory;
import com.cdbd.stock_project.domain.inventory.InventoryRepository;
import com.cdbd.stock_project.infrastructure.jpa.entity.InventoryJpaEntity;
import com.cdbd.stock_project.infrastructure.jpa.repository.InventoryJpaRepository;

import java.util.Optional;

public class JpaInventoryRepository implements InventoryRepository {

	private final InventoryJpaRepository jpaRepository;

    public JpaInventoryRepository(InventoryJpaRepository repository) {
        this.jpaRepository = repository;
    }

    private InventoryJpaEntity convert(Inventory data) {
		InventoryJpaEntity obj = new InventoryJpaEntity();

		obj.setId(Optional.ofNullable(data.getId()).orElse(null));
		obj.setInventoryInfo(Optional.ofNullable(data.getInventoryInfo().toString()).orElse(null));
		obj.setCategoryId(Optional.ofNullable(data.getCategoryId()).orElse(null));
		return obj;
	}

}
