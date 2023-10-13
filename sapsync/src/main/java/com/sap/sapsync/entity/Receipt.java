package com.sap.sapsync.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "receipt")
public class Receipt {

    @Id
    @Column(name = "receipt_id")
    private Long receiptId;

    @Column(name = "order_id")
    private Long orderId;

    @Column(name = "vendor_id")
    private Long vendorId;

    @Column(name = "creation_date")
    private LocalDate creationDate;

    @Column(name = "truck_id")
    private String truckId;

    @Column(name = "quantity")
    private float quantity;

    @Column(name = "material_code")
    private String materialCode;

    @Column(name = "material_desc")
    private String materialDescription;

    @Column(name = "payment_term")
    private String paymentTerm;

    @Column(name = "payment_term_desc")
    private String paymentTermDescription;

    @Column(name = "cgst")
    private float cgst;

    @Column(name = "igst")
    private float igst;

    @Column(name = "sgst")
    private float sgst;

    @Column(name = "ugst")
    private float ugst;

    @Column(name = "sync_flag")
    private String syncFlag;

}
