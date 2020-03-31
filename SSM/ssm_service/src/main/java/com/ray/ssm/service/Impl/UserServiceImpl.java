package com.ray.ssm.service.Impl;

import com.ray.ssm.dao.UserDao;
import com.ray.ssm.entity.User;
import com.ray.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userServiceImpl")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    public User login(String username, String password) {
       User user= userDao.selectByName(username);
       if (user!=null&&user.getPassword().equals("123456"))   return user;

        return null;
    }
}
