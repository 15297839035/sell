package com.eduplatform.sellmaneger.Service;

import com.eduplatform.sellmaneger.Entity.User;
import com.eduplatform.sellmaneger.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
    public User getUser(Integer id) {
        return userRepository.findById(id).get();
    }
    public void deleteUserById(Integer id) {
        userRepository.deleteById(id);
    }
    public void saveUser(User user) {
        userRepository.save(user);
    }
}
