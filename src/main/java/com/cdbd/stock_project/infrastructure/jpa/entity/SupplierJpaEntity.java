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
@Table(name = "Supplier")
@Comment("업체")
public class SupplierJpaEntity {

    @Id
    @Column(name = "supplier_id")
    @Comment("고유ID")
    private Integer supplierId;

    @Column(name = "supplier_name")
    @Comment("업체명")
    private String supplierName;

    @Column(name = "supplier_info")
    @Comment("업체정보")
    private String supplierInfo;

    @Column(name = "created_at", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    @Comment("생성일시")
    private Timestamp createdAt;

    @Column(name = "updated_at", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    @Comment("수정일시")
    private Timestamp updatedAt;
}