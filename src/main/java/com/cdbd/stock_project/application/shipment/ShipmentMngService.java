package com.cdbd.stock_project.application.shipment;


import com.cdbd.stock_project.domain.inventory.Inventory;
import com.cdbd.stock_project.domain.shipping.Shipment;
import com.cdbd.stock_project.infrastructure.jpa.entity.ShipInfoJpaEntity;
import com.cdbd.stock_project.presentation.api.shipment.obj.ShipInfoObject;
import org.apache.coyote.Response;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ShipmentMngService {

	//배송정보 입력된 항목전체 조회
	public List<ShipInfoJpaEntity> getAllShipments();

	//입고 예정 물품 정보 입력
	public void addShipSchedule(ShipInfoObject object);

	//관리자 승인 상태 수정
	public void updateApproveStatus(String orderId, String approveStatus);

	//입고 상태 수정
	public void updateMngStatus(Shipment shipment);
}
