package com.sap.sapsync.service;

import com.sap.sapsync.entity.Receipt;
import com.sap.sapsync.repository.ReceiptRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ReceiptServiceImpl implements ReceiptService {

    private final ReceiptRepository receiptRepository;

    public ReceiptServiceImpl(ReceiptRepository receiptRepository){
        this.receiptRepository = receiptRepository;
    }
    @Override
    public List<Receipt> getReceipts(LocalDate date) {
        List<Receipt> list = receiptRepository.findByCreationDateAndSyncFlagIsNull(date);

        for(Receipt receipt:list){
            receipt.setSyncFlag("X");
        }

        receiptRepository.saveAll(list);

        return list;

    }
}
