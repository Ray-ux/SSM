package com.ray.ssm.service;

import com.ray.ssm.entity.User;

public interface UserService {
    User login(String username, String password);
}
