package io.github.service.impl;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import io.github.dto.UserDTO;
import io.github.entity.UserEntity;
import io.github.service.UserService;
import io.github.utils.ModelMapperUtils;

@Service
public class UserServiceImpl implements UserService {

    @Override
    @Cacheable("user")
    public UserDTO getUserDTO() {
        UserEntity userEntity = new UserEntity();
        userEntity.setUserName("shenjunyu");
        userEntity.setPassword("123456");

        return ModelMapperUtils.copyModelProperties(userEntity, UserDTO.class);
    }
}
