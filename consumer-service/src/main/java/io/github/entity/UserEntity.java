package io.github.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

import io.github.constant.TableConstant;
import lombok.Data;

@Data
@TableName(TableConstant.USER)
public class UserEntity {

    @TableField("id")
    private Long id;

    @TableField("user_name")
    private String userName;

    @TableField("password")
    private String password;
}
