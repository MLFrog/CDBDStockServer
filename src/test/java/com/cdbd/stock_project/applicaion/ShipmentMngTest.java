package com.cdbd.stock_project.applicaion;

import com.cdbd.stock_project.application.shipment.ShipmentMngService;
import com.cdbd.stock_project.presentation.api.shipment.obj.ShipInfoObject;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;


@ExtendWith(SpringExtension.class)
@RequiredArgsConstructor
@Slf4j
public class ShipmentMngTest {

    private static final Logger logger = LoggerFactory.getLogger(ShipmentMngTest.class);

    private ShipmentMngService shipmentMngService;

    private ShipInfoObject obj;

    @BeforeEach
    void 객체생성() {
        obj = new ShipInfoObject();
        obj.setOrderId("001");
        obj.setSupplier("물류좋아");
        obj.setItems("통나무");
        obj.setMngstatus("N");
        obj.setApproveStatus("N");

        logger.info("ShipInfoObject 생성확인: {}", obj);
    }

    @Test
    public void 배송_정보_입력() {
        this.shipmentMngService.addShipSchedule(obj);
        logger.info("배송 정보 입력 완료: {}", obj);
    }
}
