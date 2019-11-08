package com.ycy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("toShowUser")
    public String toShowUser(){
        return "user/showUser";
    }
    @RequestMapping("toAddUser")
    public String toAddUser(){
        return "user/addUser";
    }

}
