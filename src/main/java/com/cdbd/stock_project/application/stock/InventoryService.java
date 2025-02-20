package com.cdbd.stock_project.application.stock;


import com.cdbd.stock_project.domain.inventory.Inventory;

public interface InventoryService {

	public Inventory addStock(Inventory stock);


	//입고상태 수정
	public void updateInboundStatus(String inboundTp);
}
