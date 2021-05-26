package io.github.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.client.UserClient;
import io.github.dto.UserDTO;

@RestController
@RequestMapping("/v1/user_test")
public class UserTestController {

    @Autowired
    private UserClient userClient;

    @GetMapping("/getUser")
    public UserDTO getUser() {
        return userClient.getUser();
    }
}
