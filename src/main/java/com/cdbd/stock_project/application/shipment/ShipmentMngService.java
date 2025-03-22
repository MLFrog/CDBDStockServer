package com.cdbd.stock_project.application.shipment;


import com.cdbd.stock_project.domain.inventory.Inventory;
import com.cdbd.stock_project.domain.shipping.Shipment;
import org.apache.coyote.Response;

public interface ShipmentMngService {

	//입고 예정 물품 정보 입력
	public Shipment addShipSchedule(Shipment shipment);

	//관리자 승인 상태 수정
	public void updateApproveStatus(String shipment);

	//입고 상태 수정
	public void updateMngStatus(Shipment shipment);
}
