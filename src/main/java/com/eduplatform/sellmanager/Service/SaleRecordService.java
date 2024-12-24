package com.eduplatform.sellmanager.Service;

import com.eduplatform.sellmanager.Entity.SaleRecord;
import com.eduplatform.sellmanager.Entity.User;
import com.eduplatform.sellmanager.Repository.SaleRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleRecordService {
    @Autowired
    private SaleRecordRepository saleRecordRepository;
    public List<SaleRecord> getAllSaleRecords() {
        return saleRecordRepository.findAll();
    }
    public SaleRecord getSaleRecord(Integer id) {
        return saleRecordRepository.findById(id).get();
    }

    public void deleteSaleRecordById(Integer id) {
        saleRecordRepository.deleteById(id);
    }
    public void saveSaleRecord(SaleRecord saleRecord) {
        saleRecordRepository.save(saleRecord);
    }
}
