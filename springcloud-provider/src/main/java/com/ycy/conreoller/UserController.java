package com.ycy.conreoller;

import com.ycy.model.User;
import com.ycy.service.UserService;
import com.ycy.service.UserServiceF;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

@RestController
public class UserController implements UserServiceF {

    @Resource
    private UserService userService;

    @GetMapping("/findUserList")
    @Override
    public Map findUserList(@RequestParam("page") Integer page, @RequestParam("rows")Integer rows) {
        return userService.findUserList(page,rows);
    }

    @PostMapping("saveUser")
    @Override
    public void saveUser(User user) {
        userService.saveUser(user);
    }

}
