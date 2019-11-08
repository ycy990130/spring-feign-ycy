package com.ycy.service;

import com.ycy.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@FeignClient(value = "springcloud-provider",fallback = UserServiceError.class)
public interface UserServiceF {

    @GetMapping("/findUserList")
    Map findUserList(@RequestParam("page") Integer page, @RequestParam("rows")Integer rows);

    @PostMapping("saveUser")
    void saveUser(User user);
}
