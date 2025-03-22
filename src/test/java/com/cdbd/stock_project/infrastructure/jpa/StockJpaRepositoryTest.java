package com.cdbd.stock_project.infrastructure.jpa;
import static org.assertj.core.api.Assertions.assertThat;
import com.cdbd.stock_project.infrastructure.jpa.entity.StockJpaEntity;
import com.cdbd.stock_project.infrastructure.jpa.repository.StockJpaRepository;
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
    private StockJpaRepository stockJpaRepository;

    private StockJpaEntity stockJpaEntity;

    @BeforeEach
    public void 객체생성() {
        // given
        stockJpaEntity = new StockJpaEntity();
        stockJpaEntity.setStockId(001);
        stockJpaEntity.setStockSupplierId(002);
        stockJpaEntity.setStockInventoryId(002);
        stockJpaEntity.setStockQuantity(010);
        stockJpaEntity.setCreatedAt(new Timestamp(System.currentTimeMillis()));
        stockJpaEntity.setUpdatedAt(new Timestamp(System.currentTimeMillis()));

        logger.info("객체생성확인: {}", stockJpaEntity);
    }

    @Test
    public void 현재고데이터생성() {
        // when: 데이터를 저장하고 반환된 엔티티를 확인
        StockJpaEntity savedEntity = stockJpaRepository.save(stockJpaEntity);

        // then: 저장된 엔티티의 필드 값이 정확한지 검증
        assertThat(savedEntity.getStockId()).isEqualTo(001);
        assertThat(savedEntity.getStockSupplierId()).isEqualTo(002);
        assertThat(savedEntity.getStockInventoryId()).isEqualTo(002);
        assertThat(savedEntity.getStockQuantity()).isEqualTo(010);
        assertThat(savedEntity.getCreatedAt()).isNotNull();
        assertThat(savedEntity.getUpdatedAt()).isNotNull();

        logger.info("현재고 데이터 생성: {}", savedEntity);
    }


}
