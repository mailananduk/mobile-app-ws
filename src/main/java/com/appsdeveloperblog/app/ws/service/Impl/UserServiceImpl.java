package com.appsdeveloperblog.app.ws.service.Impl;

import com.appsdeveloperblog.app.ws.service.UserService;
import com.appsdeveloperblog.app.ws.shared.dto.UserDto;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public UserDto getUser(String userId) {
        return getUserDto();
    }

    @Override
    public UserDto createUser(UserDto user) {
        return getUserDto();
    }

    private UserDto getUserDto() {
        UserDto userDto = new UserDto();
        userDto.setId(1);
        userDto.setUserId("user id");
        userDto.setFirstName("First name");
        userDto.setLastName("Last name");
        userDto.setEmailId("Email Id");
        userDto.setPassword("my password");
        userDto.setEncryptedPassword("");
        userDto.setEmailVerificationToken("");
        userDto.setEmailVerificationStatus("");
        return userDto;
    }
}
