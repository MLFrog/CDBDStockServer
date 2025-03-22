package com.cdbd.stock_project.application.inventory;


import com.cdbd.stock_project.domain.inventory.Inventory;

public interface InventoryMngService {

	public Inventory addStock(Inventory stock);


	//입고상태 수정
	public void updateInboundStatus(String inboundTp);
}
