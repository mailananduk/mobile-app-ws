package com.appsdeveloperblog.app.ws.service;

import com.appsdeveloperblog.app.ws.shared.dto.UserDto;

public interface UserService {

    public UserDto getUser(String userId);
    public UserDto createUser(UserDto user);
}
