package com.cdbd.stock_project.domain.stock;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class StockFactory {
	public Stock getInstance() { return new Stock(); }
}
