package com.cdbd.stock_project.application.stock;


import com.cdbd.stock_project.domain.stock.Stock;

public interface StockService {

	public Stock addStock(Stock stock);


	//입고상태 수정
	public void updateInboundStatus(String inboundTp);
}
