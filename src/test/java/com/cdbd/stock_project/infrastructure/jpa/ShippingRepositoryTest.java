package com.cdbd.stock_project.infrastructure.jpa;

import java.sql.Timestamp;

import com.cdbd.stock_project.infrastructure.jpa.entity.ShipInfoJpaEntity;
import com.cdbd.stock_project.infrastructure.jpa.repository.ShipInfoJpaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.util.Assert;

@SpringBootTest
@ActiveProfiles("test")
class ShippingRepositoryTest extends JpaRepositoryTest {

    private static final Logger logger = LoggerFactory.getLogger(ShippingRepositoryTest.class);

    @Autowired
    private ShipInfoJpaRepository repository;

    private ShipInfoJpaEntity entity;

    @BeforeEach
    void 객체생성() {
        // given
        entity = new ShipInfoJpaEntity();
        entity.setOrderId("001");
        entity.setSupplier("물류좋아");
        entity.setItems("통나무");
        entity.setStatus("N");
        entity.setApproveStatus("N");
        entity.setCreatedAt(new Timestamp(System.currentTimeMillis()));
        entity.setUpdatedAt(new Timestamp(System.currentTimeMillis()));

        logger.info("객체생성확인: {}", entity);
    }

    @Test
    void 배송_정보_추가() {
        repository.save(entity);
        logger.info("배송 정보 저장 완료: {}", entity);
    }

    @Test
    void 주문_번호로_조회() {
        repository.findByOrderId(entity.getOrderId());
        logger.info("주문 번호로 조회 완료: {}", entity);
    }

}