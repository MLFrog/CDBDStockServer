package com.cdbd.stock_project.infrastructure.jpa;
import static org.assertj.core.api.Assertions.assertThat;

import com.cdbd.stock_project.infrastructure.jpa.entity.InventoryJpaEntity;
import com.cdbd.stock_project.infrastructure.jpa.repository.InventoryJpaRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.sql.Timestamp;

@DataJpaTest
public class StockJpaRepositoryTest {

    private static final Logger logger = LoggerFactory.getLogger(StockJpaRepositoryTest.class);

    @Autowired
    private InventoryJpaRepository inventoryJpaRepository;

    private InventoryJpaEntity inventoryJpaEntity;

    @BeforeEach
    public void 객체생성() {
        // given
        inventoryJpaEntity = new InventoryJpaEntity();
        inventoryJpaEntity.setId(001);
        inventoryJpaEntity.setStockSupplierId("002");
        inventoryJpaEntity.setStockInventoryId("002");
        inventoryJpaEntity.setStockQuantity(010);
        inventoryJpaEntity.setCreatedAt(new Timestamp(System.currentTimeMillis()));
        inventoryJpaEntity.setUpdatedAt(new Timestamp(System.currentTimeMillis()));

        logger.info("객체생성확인: {}", inventoryJpaEntity);
    }

    @Test
    public void 현재고데이터생성() {
        // when: 데이터를 저장하고 반환된 엔티티를 확인
        InventoryJpaEntity savedEntity = inventoryJpaRepository.save(inventoryJpaEntity);

        // then: 저장된 엔티티의 필드 값이 정확한지 검증
        assertThat(savedEntity.getId()).isEqualTo(001);
        assertThat(savedEntity.getStockSupplierId()).isEqualTo(002);
        assertThat(savedEntity.getStockInventoryId()).isEqualTo(002);
        assertThat(savedEntity.getStockQuantity()).isEqualTo(010);
        assertThat(savedEntity.getCreatedAt()).isNotNull();
        assertThat(savedEntity.getUpdatedAt()).isNotNull();

        logger.info("현재고 데이터 생성: {}", savedEntity);
    }


}
