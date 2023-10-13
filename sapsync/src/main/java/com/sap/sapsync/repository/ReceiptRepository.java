package com.sap.sapsync.repository;

import com.sap.sapsync.entity.Receipt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ReceiptRepository extends JpaRepository<Receipt, Long> {
    List<Receipt> findByCreationDateAndSyncFlagIsNull(LocalDate date);
}
