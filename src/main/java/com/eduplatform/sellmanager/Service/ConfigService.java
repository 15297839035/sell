package com.eduplatform.sellmanager.Service;

import com.eduplatform.sellmanager.Entity.Config;
import com.eduplatform.sellmanager.Repository.ConfigRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConfigService {
    @Autowired
    private ConfigRepository configRepository;
    public List<Config> getAllConfigs() {
        return configRepository.findAll();
    }
    public Config getConfig(Integer id) {return configRepository.findById(id).get();    }
    public void deleteConfigById(Integer id) {        configRepository.deleteById(id);
    }
    public void saveConfig(Config config) {configRepository.save(config);    }
}
