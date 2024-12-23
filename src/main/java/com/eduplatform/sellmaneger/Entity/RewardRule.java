package com.eduplatform.sellmaneger.Entity;

import jakarta.persistence.*;

@Entity
@Table
public class RewardRule {
    @Id
    private Integer id = 1;
    private boolean if_reward;
    private Integer reward_amount;
    private Integer reward_count;
    private boolean if_sum;
    private Integer sum;
    private boolean if_count;
    private Integer count;
    private boolean if_amount;
    private Integer amount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public boolean isIf_reward() {
        return if_reward;
    }

    public void setIf_reward(boolean if_reward) {
        this.if_reward = if_reward;
    }

    public Integer getReward_amount() {
        return reward_amount;
    }

    public void setReward_amount(Integer reward_amount) {
        this.reward_amount = reward_amount;
    }

    public Integer getReward_count() {
        return reward_count;
    }

    public void setReward_count(Integer reward_count) {
        this.reward_count = reward_count;
    }

    public boolean isIf_sum() {
        return if_sum;
    }

    public void setIf_sum(boolean if_sum) {
        this.if_sum = if_sum;
    }

    public Integer getSum() {
        return sum;
    }

    public void setSum(Integer sum) {
        this.sum = sum;
    }

    public boolean isIf_count() {
        return if_count;
    }

    public void setIf_count(boolean if_count) {
        this.if_count = if_count;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public boolean isIf_amount() {
        return if_amount;
    }

    public void setIf_amount(boolean if_amount) {
        this.if_amount = if_amount;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}
