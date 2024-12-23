package com.eduplatform.sellmanager.Controller;

import com.eduplatform.sellmanager.Entity.SaleRecord;
import com.eduplatform.sellmanager.Entity.SaleRecordDTO;
import com.eduplatform.sellmanager.Service.SaleRecordService;
import com.eduplatform.sellmanager.Service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/salerecord")
@CrossOrigin(origins = "http://localhost:5173", allowedHeaders = "*")
public class SaleRecordController {
    @Autowired
    SaleRecordService saleRecordService;
    @Autowired
    UserService userService;
    @GetMapping
    public List<SaleRecord> getAllSaleRecord() {
        return saleRecordService.getAllSaleRecords();

    }
    @GetMapping("/{id}")
    public SaleRecord getSaleRecordById(@PathVariable Integer id) {
        return saleRecordService.getSaleRecord(id);
    }
    @PostMapping
    public void addSaleRecord(@RequestBody SaleRecordDTO saleRecordDTO) {
        SaleRecord saleRecord = new SaleRecord();
        BeanUtils.copyProperties(saleRecordDTO, saleRecord);
        saleRecord.setUser(userService.getUser(saleRecordDTO.getUser_id()));
        saleRecordService.saveSaleRecord(saleRecord);

    }
    @DeleteMapping("/{id}")
    public void deleteSaleRecord(@PathVariable Integer id) {
        saleRecordService.deleteSaleRecordById(id);
    }

}
