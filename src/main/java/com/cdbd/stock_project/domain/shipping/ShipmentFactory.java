package com.cdbd.stock_project.domain.shipping;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ShipmentFactory {
	public Shipment getInstance() { return new Shipment(); }
}
