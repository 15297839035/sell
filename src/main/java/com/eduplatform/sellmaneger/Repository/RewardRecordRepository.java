package com.eduplatform.sellmaneger.Repository;

import com.eduplatform.sellmaneger.Entity.RewardRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RewardRecordRepository extends JpaRepository<RewardRecord, Integer> {
}
