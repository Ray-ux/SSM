package com.ray.ssm.dao;

import com.ray.ssm.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
    User selectByName(String username);
}
