package com.ycy.service;

import com.ycy.mapper.UserMapper;
import com.ycy.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService{

    @Resource
    private UserMapper userMapper;

    @Override
    public Map findUserList(Integer page, Integer rows) {
        Long count=userMapper.findUserCount();
        List<User> list=userMapper.findUserList((page-1)*rows,rows);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("total",count);
        map.put("rows",list);
        return  map;
    }

    @Override
    public void saveUser(User user) {
        userMapper.saveUser(user);
    }

}
