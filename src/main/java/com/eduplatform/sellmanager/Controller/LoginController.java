package com.eduplatform.sellmanager.Controller;

import com.eduplatform.sellmanager.Entity.LoginDTO;
import com.eduplatform.sellmanager.Entity.User;
import com.eduplatform.sellmanager.Service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@RestController
@RequestMapping("/login")
@CrossOrigin(origins = "http://localhost:5173", allowedHeaders = "*")
public class LoginController {
    @Autowired
    UserService userService;
    @PostMapping("/login")
    public String login(@RequestBody LoginDTO loginDTO) {
        User user = userService.findUserByName(loginDTO.getName());
        if (user != null) {
            if (Objects.equals(user.getPassword(), loginDTO.getPassword())) {
                return "success";
            } else {
                return "fail";
            }
        } else {
            return "wrong";
        }
    }
    @PostMapping("/signup")
    public String register(@RequestBody LoginDTO loginDTO) {
        User user = userService.findUserByName(loginDTO.getName());
        if (user != null) {
            return "fail";
        } else {
            User newUser = new User();
            BeanUtils.copyProperties(loginDTO, newUser);
            userService.saveUser(newUser);
            return "success";
        }
    }
}
