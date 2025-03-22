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
@Table(name = "Inventory")
@Comment("품목")
public class InventoryJpaEntity {

    @Id
    @Column(name = "id")
    @Comment("고유ID")
    private String id;

    @Column(name = "inventory_info")
    @Comment("품목정보")
    private String inventoryInfo;

    @Column(name = "category_id")
    @Comment("품목카테고리ID")
    private String categoryId;

    @Column(name = "created_at", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    @Comment("생성일시")
    private Timestamp createdAt;

    @Column(name = "updated_at", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    @Comment("수정일시")
    private Timestamp updatedAt;
}