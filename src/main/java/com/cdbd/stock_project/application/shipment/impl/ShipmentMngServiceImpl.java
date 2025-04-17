package com.cdbd.stock_project.application.shipment.impl;

import com.cdbd.stock_project.application.shipment.ShipmentMngService;
import com.cdbd.stock_project.domain.shipping.Shipment;
import com.cdbd.stock_project.domain.shipping.ShipmentFactory;
import com.cdbd.stock_project.domain.shipping.ShipmentRepository;
import com.cdbd.stock_project.domain.shipping.repository.impl.JpaShipmentRepository;
import com.cdbd.stock_project.infrastructure.jpa.entity.ShipInfoJpaEntity;
import com.cdbd.stock_project.infrastructure.jpa.repository.ShipInfoJpaRepository;
import com.cdbd.stock_project.presentation.api.shipment.obj.ShipInfoObject;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ShipmentMngServiceImpl implements ShipmentMngService {

    private ShipmentFactory factory;
    private ShipmentRepository repository;
    private final ShipInfoJpaRepository shipInfoJpaRepository;

    @PostConstruct
    public void init() {
        this.repository = new JpaShipmentRepository(shipInfoJpaRepository);
        this.factory = new ShipmentFactory();
    }

    @Override
    public List<ShipInfoJpaEntity> getAllShipments() {
        return shipInfoJpaRepository.findAll();
    }

    @Override
    public void addShipSchedule(ShipInfoObject shipInfoObject) {
        Shipment shipment = this.factory.getInstance();
        shipment.setOrderId(shipInfoObject.getOrderId());
        shipment.setSupplier(shipInfoObject.getSupplier());
        shipment.setItems(shipInfoObject.getItems());
        shipment.setMngstatus(shipInfoObject.getMngstatus());
        shipment.setApproveStatus(shipInfoObject.getApproveStatus());

        shipment.saveShipInfo(this.repository);
    }

    //승인상태 수정
    @Override
    public void updateApproveStatus(String orderId, String approveStatus) {
        ShipInfoJpaEntity shipInfoJpaEntity = this.shipInfoJpaRepository.findByOrderId(orderId);
        shipInfoJpaEntity.setApproveStatus(approveStatus);
        shipInfoJpaRepository.save(shipInfoJpaEntity);
    }

    //입고상태 수정
    @Override
    public void updateMngStatus(Shipment shipment) {
        ShipInfoJpaEntity shipInfoJpaEntity = this.shipInfoJpaRepository.findByOrderId(shipment.getOrderId());
        shipInfoJpaEntity.setStatus(shipment.getMngstatus());
        shipInfoJpaRepository.save(shipInfoJpaEntity);
    }
}
//    물품 발송 및 배송 정보 수신
//
//    업체가 물품을 발송합니다.
//        재고관리 시스템 관리자는 배송 정보를 수신합니다.
//        배송 정보 입력 및 승인 대기
//
//        관리자는 시스템에 배송 정보를 입력합니다.
//        상품 정보(품목, 수량, 업체명 등)를 입력한 후, 승인 대기 상태로 전환합니다.
//        물품 확인 및 승인
//
//        관리자는 실제 물품을 확인합니다.
//        입력한 정보와 실제 물품이 일치하는지 검토합니다.
//        일치할 경우, 관리자는 요청을 승인합니다.
//        입고 내역 등록
//
//        승인된 정보를 바탕으로 입고 내역 데이터에 품목 및 업체 데이터를 등록합니다.
//        동시에 재고(현재고) 데이터에 해당 품목의 수량을 업데이트합니다.
//        재고 관리 및 모니터링
//
//        재고 관리자는 현재 재고 상태를 지속적으로 모니터링합니다.
//        재고 수준이 설정된 기준 이하로 떨어질 경우, 재주문을 고려합니다.
//        출고 요청 처리
//
//        고객 또는 내부 부서에서 출고 요청이 들어오면, 관리자는 요청을 검토합니다.
//        재고에서 출고할 품목과 수량을 확인한 후, 출고를 승인합니다.
//        출고 내역 등록
//
//        출고가 승인되면, 출고 내역을 시스템에 등록합니다.
//        재고 데이터에서 해당 품목의 수량을 차감합니다.
//        보고서 및 분석
//
//        정기적으로 재고 현황 보고서를 생성하여 재고 회전율, 품목별 판매량 등을 분석합니다.
//        이를 통해 재고 관리의 효율성을 높이고, 향후 재고 계획에 반영합니다.