package io.github.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import io.github.Constant;
import io.github.dto.User;

@FeignClient(name = Constant.SERVICE, path = "/v1/user")
public interface UserClient {

    @GetMapping("/getUser")
    User getUser();
}
