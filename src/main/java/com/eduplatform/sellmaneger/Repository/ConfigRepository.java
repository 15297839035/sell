package com.eduplatform.sellmaneger.Repository;

import com.eduplatform.sellmaneger.Entity.Config;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConfigRepository extends JpaRepository<Config, Integer> {
}
