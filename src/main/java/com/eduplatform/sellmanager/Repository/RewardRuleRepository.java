package com.eduplatform.sellmanager.Repository;

import com.eduplatform.sellmanager.Entity.RewardRule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RewardRuleRepository extends JpaRepository<RewardRule, Integer> {
}
