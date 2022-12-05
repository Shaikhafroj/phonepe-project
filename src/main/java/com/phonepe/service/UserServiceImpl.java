package com.phonepe.service;

import com.phonepe.dao.UserRepository;
import com.phonepe.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;

    @Override
    public void registerUser(User user) {
         userRepository.save(user);
    }
}
