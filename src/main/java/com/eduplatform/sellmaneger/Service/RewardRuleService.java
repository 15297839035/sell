package com.eduplatform.sellmaneger.Service;

import com.eduplatform.sellmaneger.Entity.RewardRule;
import com.eduplatform.sellmaneger.Repository.RewardRuleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RewardRuleService {
    @Autowired
    private RewardRuleRepository rewardRuleRepository;
    public List<RewardRule> getAllRewardRules() {
        return rewardRuleRepository.findAll();
    }
    public RewardRule getRewardRuleById(Integer id) {
        return rewardRuleRepository.findById(id).get();
    }
    public void deleteRewardRuleById(Integer id) {
        rewardRuleRepository.deleteById(id);
    }
    public void saveRewardRule(RewardRule rewardRule) {
        rewardRuleRepository.save(rewardRule);}
}