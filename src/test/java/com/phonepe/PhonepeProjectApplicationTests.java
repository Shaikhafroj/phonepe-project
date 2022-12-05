package com.phonepe;

import com.phonepe.dao.UserRepository;
import com.phonepe.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class PhonepeProjectApplicationTests {

    @Autowired
    UserRepository userRepository;

    @Test
    void contextLoads() {


       List<User> users = userRepository.findAll();
        for(User user:users ){
            System.out.println(user);
        }



    }

}
