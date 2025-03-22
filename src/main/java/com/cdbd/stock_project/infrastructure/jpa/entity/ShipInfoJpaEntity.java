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
@Table(name = "ship_info")
@Comment("배송정보")
public class ShipInfoJpaEntity {

    @Id
    @Column(name = "id")
    @Comment("고유ID")
    private Integer id;

    @Column(name = "order_id")
    @Comment("주문번호")
    private String orderId;

    @Column(name = "supplier")
    @Comment("업체")
    private String supplier;

    @Column(name = "items")
    @Comment("품목")
    private String items;

    @Column(name = "status")
    @Comment("상태")
    private String status;

    @Column(name = "created_at", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    @Comment("생성일시")
    private Timestamp createdAt;

    @Column(name = "updated_at", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    @Comment("수정일시")
    private Timestamp updatedAt;
}