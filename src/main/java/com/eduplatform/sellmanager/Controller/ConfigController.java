package com.eduplatform.sellmanager.Controller;

import com.eduplatform.sellmanager.Entity.Config;
import com.eduplatform.sellmanager.Entity.ConfigDTO;
import com.eduplatform.sellmanager.Entity.User;
import com.eduplatform.sellmanager.Service.ConfigService;
import com.eduplatform.sellmanager.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/config")
@CrossOrigin(origins = "http://localhost:5173", allowedHeaders = "*")
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
        config.setId(configDTO.getId());
        List<Integer> administor_ids = configDTO.getAdministor_ids();
        List<User> users = new ArrayList<User>();
        for (Integer administorId : administor_ids) {
            users.add(userService.getUser(administorId));
        }
        config.setAdministors(users);
        configService.saveConfig(config);
    }
    @DeleteMapping("/{id}")
    public void deleteConfig(@PathVariable Integer id){
        configService.deleteConfigById(id);
    }
}

