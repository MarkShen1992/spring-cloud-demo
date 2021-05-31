package io.github.entity;

import com.baomidou.mybatisplus.annotation.TableName;

import io.github.constant.TableConstant;
import lombok.Data;

@Data
@TableName(TableConstant.USER)
public class UserEntity {

    /**
     * id
     */
    private Long id;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 密码
     */
    private String password;
}
