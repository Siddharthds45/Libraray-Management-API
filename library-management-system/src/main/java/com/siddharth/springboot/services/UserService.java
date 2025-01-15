package com.siddharth.springboot.services;

import com.siddharth.springboot.dto.UserDto;

import java.util.List;

public interface UserService {
    UserDto createUser(UserDto userDto);
    List<UserDto> getUsers();

}
