package com.eduplatform.sellmanager.Controller;

import com.eduplatform.sellmanager.Entity.RewardRecord;
import com.eduplatform.sellmanager.Entity.RewardRecordDTO;
import com.eduplatform.sellmanager.Service.RewardRecordService;
import com.eduplatform.sellmanager.Service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rewardrecord")
@CrossOrigin(origins = "http://localhost:5173", allowedHeaders = "*")
public class RewardRecordController {
    @Autowired
    private RewardRecordService rewardRecordService;
    @Autowired
    private UserService userService;
    @GetMapping
    public List<RewardRecord> getRewardRecord() {
        return rewardRecordService.getAllRewardRecords();
    }
    @GetMapping("/{id}")
    public RewardRecord getRewardRecordById(@PathVariable Integer id) {
        return rewardRecordService.getRewardRecord(id);
    }
    @PostMapping
    public void addRewardRecord(@RequestBody RewardRecordDTO rewardRecordDTO) {
        RewardRecord rewardRecord = new RewardRecord();
        BeanUtils.copyProperties(rewardRecordDTO, rewardRecord);
        rewardRecord.setUser(userService.getUser(rewardRecordDTO.getUser_id()));
        rewardRecordService.saveRewardRecord(rewardRecord);
    }
    @DeleteMapping("/{id}")
    public void deleteRewardRecord(@PathVariable Integer id) {
        rewardRecordService.deleteRewardRecordById(id);
    }


}
