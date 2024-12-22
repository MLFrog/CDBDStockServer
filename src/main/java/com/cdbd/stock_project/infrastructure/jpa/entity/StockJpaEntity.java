package com.cdbd.stock_project.infrastructure.jpa.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import org.hibernate.annotations.Comment;

import java.sql.Timestamp;

@Data
@Entity
@Table(name = "Stock")
@Comment("현재고")
public class StockJpaEntity {

    @Id
    @Column(name = "stock_id")
    @Comment("고유ID")
    private Integer stockId;

    @Column(name = "stock_supplier_id")
    @Comment("업체ID")
    private Integer stockSupplierId;

    @Column(name = "stock_inventory_id")
    @Comment("품목ID")
    private Integer stockInventoryId;

    @Column(name = "stock_quantity")
    @Comment("수량")
    private Integer stockQuantity;

    @Column(name = "created_at", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    @Comment("생성일시")
    private Timestamp createdAt;

    @Column(name = "updated_at", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    @Comment("수정일시")
    private Timestamp updatedAt;
}