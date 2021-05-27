package io.github.service;

import io.github.dto.UserDTO;

public interface UserService {
    UserDTO getUserDTO(String userName);
}
