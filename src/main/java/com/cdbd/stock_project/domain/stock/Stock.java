package com.cdbd.stock_project.domain.stock;

import com.cdbd.stock_project.domain.common.DomainEntity;
import lombok.Data;

import java.time.Instant;
@Data
@DomainEntity
public class Stock {
    private String stockId;
    private String stockSupplierId;
    private String stockInventoryId;
    private String stockQuantity;
}
