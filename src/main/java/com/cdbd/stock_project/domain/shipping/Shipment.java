package com.cdbd.stock_project.domain.shipping;

import com.cdbd.stock_project.domain.common.DomainEntity;
import lombok.Data;
import org.springframework.util.Assert;

import java.time.Instant;

@Data
@DomainEntity
public class Shipment {
    private Integer id;
    private String orderId;
    private String supplier;
    private String items;
    //입고 상태
    private String Mngstatus;
    //승인 상태
    private String approveStatus;
    private Instant createdAt;
    private Instant updatedAt;
    //commit test
    //배송 예정 물품 추가
    public void addShipInfo(ShipmentRepository repository){
        Assert.notNull(this.id, "배송 ID 값은 null일 수 없습니다.");
        repository.save(this);
    }


    public void addItems(ShipmentRepository repository){
        this.items = items;
    }
}
