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
@Table(name = "Log")
@Comment("로그")
public class LogJpaEntity {

    @Id
    @Column(name = "log_id")
    @Comment("고유ID")
    private Integer logId;

    @Column(name = "log_type")
    @Comment("로그 타입")
    private String logType;

    @Column(name = "type_id")
    @Comment("로그 타입ID")
    private Integer typeId;

    @Column(name = "action")
    @Comment("로그 분류")
    private String action;

    @Column(name = "log_data")
    @Comment("로그 데이터")
    private String logData;

    @Column(name = "created_at", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    @Comment("생성일시")
    private Timestamp createdAt;

    @Column(name = "updated_at", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    @Comment("수정일시")
    private Timestamp updatedAt;
}