package com.eduplatform.sellmanager.Controller;

import com.eduplatform.sellmanager.Entity.User;
import com.eduplatform.sellmanager.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping
    public List<User> getUser() {
        System.out.println(11111111);
        return userService.getAllUsers();
    }
    @GetMapping("/{id}")
    public User getUser(@PathVariable Integer id) {
        return userService.getUser(id);
    }
    @GetMapping("/name/{name}")
    public User getUserByName(@PathVariable String name) {return userService.findUserByName(name);}
    @PostMapping
    public void createUser(@RequestBody User user) {
        userService.saveUser(user);
    }
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Integer id) {
        userService.deleteUserById(id);
    }
}
