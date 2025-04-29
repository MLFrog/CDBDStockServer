package com.cdbd.stock_project.applicaion;

import com.cdbd.stock_project.application.shipment.ShipmentMngService;
import com.cdbd.stock_project.domain.shipping.ShipmentRepository;
import com.cdbd.stock_project.infrastructure.jpa.entity.ShipInfoJpaEntity;
import com.cdbd.stock_project.infrastructure.jpa.repository.ShipInfoJpaRepository;
import com.cdbd.stock_project.presentation.api.shipment.obj.ShipInfoObject;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;


@SpringBootTest
@ExtendWith(SpringExtension.class)
@RequiredArgsConstructor
@Slf4j
public class ShipmentMngTest {

    private static final Logger logger = LoggerFactory.getLogger(ShipmentMngTest.class);

    @Autowired
    private ShipmentMngService shipmentMngService;

    @Mock
    ShipInfoJpaRepository jpaRepository;


    @Test
    public void 배송_정보_입력() {
        ShipInfoObject obj = new ShipInfoObject();
        obj.setOrderId("001");
        obj.setSupplier("물류좋아");
        obj.setItems("통나무");
        obj.setMngstatus("N");
        obj.setApproveStatus("N");

        this.shipmentMngService.addShipSchedule(obj);
        logger.info("배송 정보 입력 완료: {}", obj);
    }

    @Test
    public void 승인상태_변경() {
        //given

        ShipInfoObject obj = new ShipInfoObject();
        obj.setOrderId("001");
        obj.setSupplier("물류좋아");
        obj.setItems("통나무");
        obj.setMngstatus("N");
        obj.setApproveStatus("N");

        this.shipmentMngService.addShipSchedule(obj);
        logger.info("배송 정보 입력 완료: {}", obj);

        String orderId = "001";
         String approveStatus = "Y";

        //when
        this.shipmentMngService.updateApproveStatus(orderId, approveStatus);
//        ShipInfoJpaEntity entity = jpaRepository.findByOrderId(orderId);
        logger.info("승인 상태 수정 완료: {}","ㅇ");

        //then
    }

    @Test
    public void 배송_정보_입() {
        ShipInfoObject obj = new ShipInfoObject();
        obj.setOrderId("001");
        obj.setSupplier("물류좋아");
        obj.setItems("통나무");
        obj.setMngstatus("N");
        obj.setApproveStatus("N");

        this.shipmentMngService.addShipSchedule(obj);
        logger.info("배송 정보 입력 완료: {}", obj);
    }
}
