package com.eduplatform.sellmanager.Service;

import com.eduplatform.sellmanager.Entity.RewardRecord;
import com.eduplatform.sellmanager.Repository.RewardRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RewardRecordService {
    @Autowired
    private RewardRecordRepository rewardRecordRepository;
    public List<RewardRecord> getAllRewardRecords() {
        return rewardRecordRepository.findAll();    }
    public RewardRecord getRewardRecord(Integer id) {
        return rewardRecordRepository.findById(id).get();}
    public void deleteRewardRecordById(Integer id) {rewardRecordRepository.deleteById(id);}
    public void saveRewardRecord(RewardRecord rewardRecord) {        rewardRecordRepository.save(rewardRecord);
    }
}
