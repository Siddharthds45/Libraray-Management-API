package com.siddharth.springboot.mapper;

import com.siddharth.springboot.dto.UserDto;
import com.siddharth.springboot.entities.User;

public class UserMapper {

    public static UserDto mapToUserDto(User user){
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setName(user.getName());
        return userDto;
    }

    public static User mapToUser(UserDto userDto){
        User user = new User();
        user.setId(userDto.getId());
        user.setName(userDto.getName());
        return user;
    }
}
