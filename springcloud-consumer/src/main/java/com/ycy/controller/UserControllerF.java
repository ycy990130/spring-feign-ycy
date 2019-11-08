package com.ycy.controller;

import com.ycy.model.User;
import com.ycy.service.UserServiceF;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@RestController
public class UserControllerF {

    @Resource
    private UserServiceF userServiceF;


    @RequestMapping("/findUserList")
    public Map findUserList(Integer page, Integer rows, HttpServletResponse response) throws IOException {
        // return userServiceF.findUserList(page,rows);
        Map map = new HashMap();
        map = userServiceF.findUserList(page,rows);
        if (map==null){
            /* 设置格式为text/json */
            response.setContentType("text/json");
            /* 设置字符集为'UTF-8' */
            response.setCharacterEncoding("UTF-8");
            PrintWriter printWriter = response.getWriter();
            printWriter.write("网络异常！请稍后重试");
            printWriter.flush();
            printWriter.close();
        }
        return map;
    }

    @RequestMapping("/saveUser")
    public Boolean saveUser(User user){

        try {
            userServiceF.saveUser(user);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

}
