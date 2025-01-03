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
@Table(name = "Inbound")
@Comment("입고")
public class InboundJpaEntity {

    @Id
    @Column(name = "inbound_id")
    @Comment("고유ID")
    private Integer stockId;

    @Column(name = "supplier_id")
    @Comment("업체Id")
    private Integer supplierId;

    @Column(name = "inventory_id")
    @Comment("품목Id")
    private Integer inventoryId;

    @Column(name = "inbound_quantity")
    @Comment("입고 수량")
    private Integer inboundQuantity;

    @Column(name = "inbound_tp")
    @Comment("입고 상태")
    private String inboundTp;

    @Column(name = "created_at", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    @Comment("생성일시")
    private Timestamp createdAt;

    @Column(name = "updated_at", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    @Comment("수정일시")
    private Timestamp updatedAt;
}