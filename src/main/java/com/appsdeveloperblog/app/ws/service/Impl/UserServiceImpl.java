package com.appsdeveloperblog.app.ws.service.Impl;

import com.appsdeveloperblog.app.ws.service.UserService;
import com.appsdeveloperblog.app.ws.shared.dto.UserDto;
import com.appsdeveloperblog.app.ws.shared.utils.CommonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;


@Service
public class UserServiceImpl implements UserService {
    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;

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
        userDto.setUserId(CommonUtils.generateRandomString(10));
        userDto.setFirstName("First name");
        userDto.setLastName("Last name");
        userDto.setEmailId("my email Id");
        userDto.setPassword("my password");
        userDto.setEncryptedPassword(bCryptPasswordEncoder.encode("my password"));
        userDto.setEmailVerificationToken("");
        userDto.setEmailVerificationStatus("");
        return userDto;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        //get user details from db
        UserDto userDto = getUserDto();
        if (userDto == null) throw new UsernameNotFoundException(email);

        User user = new User(userDto.getEmailId(), userDto.getEncryptedPassword(), new ArrayList<>());
        return user;
    }
}
