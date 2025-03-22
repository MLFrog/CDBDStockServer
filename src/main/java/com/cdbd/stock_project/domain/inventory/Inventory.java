package com.cdbd.stock_project.domain.inventory;

import com.cdbd.stock_project.domain.common.DomainEntity;
import lombok.Data;

import java.time.Instant;

@Data
@DomainEntity
public class Inventory {
    private String id;
    private String inventoryInfo;
    private String categoryId;


//    재고 상태 확인: 현재 재고 상태를 모니터링하고, 입고 후 업데이트.
//    재고 수준 관리: 재고 수준이 기준 이하일 경우 재주문 고려.
}
