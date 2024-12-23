package com.eduplatform.sellmanager.Repository;

import com.eduplatform.sellmanager.Entity.RewardRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RewardRecordRepository extends JpaRepository<RewardRecord, Integer> {
}
