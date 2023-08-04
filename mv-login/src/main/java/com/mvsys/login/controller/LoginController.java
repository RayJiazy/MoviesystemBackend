package com.mvsys.login.controller;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.mvsys.login.model.*;
import com.mvsys.login.service.*;
@RestController
@RequestMapping("hello")
// 动态刷新配置注解 配置相关后面会介绍到
@RefreshScope
public class LoginController {
    @Autowired
    private RegisterService registerService;
    @Autowired
    private LoginService loginService;
    @PostMapping("/register")
    public String register(@RequestBody User user) {
        return registerService.register(user);
    }

    @PostMapping("/login")
    public String login(@RequestBody Account account) {
        return loginService.login(account);
    }
    @GetMapping("/offline")
    public int offline(@RequestParam(value="user_id") Integer user_id, @RequestParam(value="role") String role) {
        return loginService.offline(user_id,role);
    }
}
