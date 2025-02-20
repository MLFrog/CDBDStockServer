package com.cdbd.stock_project.infrastructure.jpa.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.Comment;

import java.sql.Timestamp;

@Data
@Entity
@Table(name = "Inventory") //이름 바꾸기
@Comment("현재고")
public class InventoryJpaEntity {

    @Id
    @Column(name = "id")
    @Comment("고유ID")
    @GeneratedValue //++1
    private Integer id;

    @Column(name = "stock_supplier_id")
    @Comment("업체ID")
    private String stockSupplierId;

    @Column(name = "stock_inventory_id")
    @Comment("품목ID")
    private String stockInventoryId;

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