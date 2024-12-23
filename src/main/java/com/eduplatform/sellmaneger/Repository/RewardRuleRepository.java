package com.eduplatform.sellmaneger.Repository;

import com.eduplatform.sellmaneger.Entity.RewardRule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RewardRuleRepository extends JpaRepository<RewardRule, Integer> {
}
