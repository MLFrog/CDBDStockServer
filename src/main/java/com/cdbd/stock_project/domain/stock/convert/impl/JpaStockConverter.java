package com.cdbd.stock_project.domain.stock.convert.impl;

import com.cdbd.stock_project.domain.stock.Stock;
import com.cdbd.stock_project.domain.stock.StockFactory;
import com.cdbd.stock_project.domain.stock.convert.StockConverter;
import com.cdbd.stock_project.infrastructure.jpa.entity.StockJpaEntity;

public class JpaStockConverter implements StockConverter<StockJpaEntity> {

    private final StockFactory factory = new StockFactory();
    @Override
    public Stock convert(StockJpaEntity stockJpaEntity) {
        Stock stock = this.factory.getInstance();
        stock.setStockId(stockJpaEntity.getStockId());


        return stock;
    }
}
