package com.eduplatform.sellmanager.Repository;

import com.eduplatform.sellmanager.Entity.Config;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConfigRepository extends JpaRepository<Config, Integer> {
}
