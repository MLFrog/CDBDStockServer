package com.cdbd.stock_project.application.stock.impl;

import com.cdbd.stock_project.application.stock.StockService;
import com.cdbd.stock_project.domain.stock.Stock;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
@RequiredArgsConstructor
public class StockServiceImpl implements StockService {

    //재고 추가
    @Override
    public Stock addStock(Stock stock) {
        return null;
    }

    @Override
    public void updateInboundStatus(String inboundTp) {

    }
}
