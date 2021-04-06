package service.impl;


import domain.User;
import org.springframework.stereotype.Service;
import service.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    public User queryUser(Long userId){
        System.out.println("UserServiceImpl start 20880");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        User user = new User();
        user.setId(userId.intValue());
        user.setName("张三");
        return user;
    }
}
