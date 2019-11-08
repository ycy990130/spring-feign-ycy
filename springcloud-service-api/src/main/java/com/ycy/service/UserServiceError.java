package com.ycy.service;

import com.ycy.model.User;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class UserServiceError implements UserServiceF{
    public Map findUserList(Integer page, Integer rows) {
        System.out.println("查新失败");
        return null;
    }

    public void saveUser(User user) {
        System.out.println("新增失败");
    }
}
