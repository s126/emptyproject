package edu.nf.emptyproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SessionController {

    // 进入登陆页面
    @GetMapping("/login")
    public String index() {
        return "login";
    }


    // 点击进行登陆，即创建会话
    @PostMapping("/login")
    public String create() {
        return "xxx";
    }


    // 点击进行注销，即销毁会话
    @DeleteMapping("/logout")
    public String destory() {
        return "redirect: /login";
    }

}
