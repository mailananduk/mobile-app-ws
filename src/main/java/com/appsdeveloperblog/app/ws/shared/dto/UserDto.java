package com.appsdeveloperblog.app.ws.shared.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserDto implements Serializable {
    private static final long serialVersionUID = -297420978611106616L;

    private long id;
    private String userId;
    private String firstName;
    private String lastName;
    private String emailId;
    private String password;
    private String encryptedPassword;
    private String emailVerificationToken;
    private String emailVerificationStatus;
}
