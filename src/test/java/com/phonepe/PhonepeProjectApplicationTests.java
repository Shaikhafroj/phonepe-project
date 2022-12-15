package com.phonepe;

import com.phonepe.dao.UserRepository;
import com.phonepe.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

@SpringBootTest
class PhonepeProjectApplicationTests {

    @Autowired
    UserRepository userRepository;

    @Test
    void contextLoads() {


//       List<User> users = userRepository.findAll();
//        for(User user:users ){
//            System.out.println(user);
//        }

//        Optional<User> optional= userRepository.findById(3);
//          User user = optional.get();
//          user.setName("Md Kamran");
//          userRepository.save(user);
//        System.out.println(user);

//        List<User> users = userRepository.findAll();
//        for (User user : users) {
//            System.out.println(user);
//        }

        userRepository.deleteById(3);

    }

}
