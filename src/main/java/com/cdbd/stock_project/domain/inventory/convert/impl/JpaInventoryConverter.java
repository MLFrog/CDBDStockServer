package com.cdbd.stock_project.domain.inventory.convert.impl;

import com.cdbd.stock_project.domain.inventory.Inventory;
import com.cdbd.stock_project.domain.inventory.InventoryFactory;
import com.cdbd.stock_project.domain.inventory.convert.InventoryConverter;
import com.cdbd.stock_project.infrastructure.jpa.entity.InventoryJpaEntity;

public class JpaInventoryConverter implements InventoryConverter<InventoryJpaEntity> {

    private final InventoryFactory factory = new InventoryFactory();


    @Override
    public Inventory convert(InventoryJpaEntity inventoryJpaEntity) {
        Inventory inventory = this.factory.getInstance();
        inventory.setId(inventoryJpaEntity.getId());
        return null;
    }
}
