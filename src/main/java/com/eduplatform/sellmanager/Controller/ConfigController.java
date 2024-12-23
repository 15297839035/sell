package com.eduplatform.sellmanager.Controller;

import com.eduplatform.sellmanager.Entity.Config;
import com.eduplatform.sellmanager.Entity.ConfigDTO;
import com.eduplatform.sellmanager.Entity.User;
import com.eduplatform.sellmanager.Service.ConfigService;
import com.eduplatform.sellmanager.Service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/config")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ConfigController {
    @Autowired
    private ConfigService configService;
    @Autowired
    private UserService userService;
    @GetMapping
    public List<Config> getAllConfig(){
        return configService.getAllConfigs();
    }
    @GetMapping("/{id}")
    public Config getConfig(@PathVariable Integer id){
        return configService.getConfig(id);
    }
    @PostMapping
    public void addConfig(@RequestBody ConfigDTO configDTO){
        Config config = new Config();
        BeanUtils.copyProperties(configDTO, config);
        User user = userService.getUser(configDTO.getUser_id());
        config.setUser(user);
        configService.saveConfig(config);
    }
    @DeleteMapping("/{id}")
    public void deleteConfig(@PathVariable Integer id){
        configService.deleteConfigById(id);
    }
}

