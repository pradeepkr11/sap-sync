package com.sap.sapsync.service;

import com.sap.sapsync.entity.Receipt;

import java.time.LocalDate;
import java.util.List;

public interface ReceiptService {
    List<Receipt> getReceipts(LocalDate date);

}
