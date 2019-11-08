package com.ycy.service;

import com.ycy.model.User;

import java.util.Map;

public interface UserService {
    Map findUserList(Integer page, Integer rows);

    void saveUser(User user);
}
