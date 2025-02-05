package com.cdbd.stock_project.domain.stock;

import com.cdbd.stock_project.domain.common.DomainEntity;
import lombok.Data;

import java.time.Instant;
@Data
@DomainEntity
public class Stock {
    private Integer stockId;
    private Integer stockSupplierId;
    private Integer stockInventoryId;
    private Integer stockQuantity;
    private Instant createdAt;
    private Instant updatedAt;
}
