package com.appsdeveloperblog.app.ws.ui.model.request;

import lombok.Data;

@Data
public class UserDetailsRequestModel {
    private String firstName;
    private String lastName;
    private String emailId;
    private String password;

}
