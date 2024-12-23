package com.eduplatform.sellmanager.Controller;

import com.eduplatform.sellmanager.Entity.RewardRule;
import com.eduplatform.sellmanager.Service.RewardRuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rewardrule")
public class RewardRuleController {
    @Autowired
    private RewardRuleService rewardRuleService;
    @GetMapping
    public List<RewardRule> getRewardRule() {
        return rewardRuleService.getAllRewardRules();
    }
    @GetMapping("/{id}")
    public RewardRule getRewardRuleById(@PathVariable Integer id) {
        return rewardRuleService.getRewardRuleById(id);
    }
    @PostMapping
    public void addRewardRule(@RequestBody RewardRule rewardRule) {
        rewardRuleService.saveRewardRule(rewardRule);

    }
    @DeleteMapping("/{id}")
    public void deleteRewardRuleById(@PathVariable Integer id) {
        rewardRuleService.deleteRewardRuleById(id);
    }
}
