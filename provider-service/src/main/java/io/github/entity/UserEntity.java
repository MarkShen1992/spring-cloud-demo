package io.github.entity;

import lombok.Data;

@Data
public class UserEntity {

    /**
     * 用户名
     */
    private String userName;

    /**
     * 密码
     */
    private String password;
}
