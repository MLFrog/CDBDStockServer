package com.cdbd.stock_project.domain.inventory;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class InventoryFactory {
	public Inventory getInstance() { return new Inventory(); }
}
