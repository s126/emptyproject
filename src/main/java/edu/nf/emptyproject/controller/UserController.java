package edu.nf.emptyproject.controller;

import edu.nf.emptyproject.model.User;
import edu.nf.emptyproject.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Controller
@RequestMapping("/users")
public class UserController {

    @Resource
    private UserService userService;

    // 显示所有用户
    @GetMapping
    public String index(User user) {
        return "users/index";
    }

    // 进入注册页面
    @GetMapping("/add")
    public String add(User user) {
        return "users/regist";
    }

    // 添加新的用户
    @PostMapping
    public String create(User user) {
        return "redirect: index";
    }

    // 显示某个用户信息
    @GetMapping("/{id}")
    public String show(@PathVariable long id, ModelMap model) {
        model.addAttribute("user", userService.findUserById(id));
        return "users/show";
    }

    // 进入编辑用户页面
    @GetMapping("/{id}/edit")
    public String edit(@PathVariable int id) {
        return "users/edit";
    }

    // 更新用户信息
    @PutMapping("/{id}")
    public String update(@PathVariable int id) {
        return "users/show";
    }

    // 删除用户
    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
        return "redirect: /users/index";
    }

}
