package com.sap.sapsync.controller;

import com.sap.sapsync.entity.Receipt;
import com.sap.sapsync.service.ReceiptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/sap")
public class ReceiptController {
    private final ReceiptService receiptService;

    @Autowired
    public ReceiptController(ReceiptService receiptService){
        this.receiptService = receiptService;
    }

    //Get API endpoint to get receipt data based on a given date
    @GetMapping("/receipt/{date}")
    public List<Receipt> getReceipt(@PathVariable @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date){
        return receiptService.getReceipts(date);
    }
}
