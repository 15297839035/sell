package com.eduplatform.sellmanager.Repository;

import com.eduplatform.sellmanager.Entity.SaleRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaleRecordRepository extends JpaRepository<SaleRecord, Integer> {
}
