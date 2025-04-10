package com.cdbd.stock_project.presentation.api.shipment.obj;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.Instant;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ShipInfoObject {
    private String orderId;
    private String supplier;
    private String items;
    //입고 상태
    private String Mngstatus;
    //승인 상태
    private String approveStatus;
}
