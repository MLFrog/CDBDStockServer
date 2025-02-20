package com.cdbd.stock_project.domain.inventory;

import com.cdbd.stock_project.domain.common.DomainEntity;
import lombok.Data;

import java.time.Instant;
@Data
@DomainEntity
public class Inventory {
    private Integer Id;
    private String stockSupplierId;
    private String stockInventoryId;
    private Integer stockQuantity;
    private Instant createdAt;
    private Instant updatedAt;
}
