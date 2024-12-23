package com.eduplatform.sellmaneger.Service;

import com.eduplatform.sellmaneger.Entity.SaleRecord;
import com.eduplatform.sellmaneger.Repository.SaleRecordRepository;
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
