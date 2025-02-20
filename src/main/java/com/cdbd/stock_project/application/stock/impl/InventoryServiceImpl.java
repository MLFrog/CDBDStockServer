package com.cdbd.stock_project.application.stock.impl;

import com.cdbd.stock_project.application.stock.InventoryService;
import com.cdbd.stock_project.domain.inventory.Inventory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class InventoryServiceImpl implements InventoryService {

    //재고 추가
    @Override
    public Inventory addStock(Inventory stock) {
        return null;
    }

    @Override
    public void updateInboundStatus(String inboundTp) {

    }
}
