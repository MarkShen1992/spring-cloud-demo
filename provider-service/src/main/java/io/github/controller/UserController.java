package io.github.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.dto.User;

@RestController
@RequestMapping("/v1/user")
public class UserController {

    @GetMapping("/getUser")
    public User getUser() {
        User u = new User("zhangsan", "123456");
        return u;
    }
}
