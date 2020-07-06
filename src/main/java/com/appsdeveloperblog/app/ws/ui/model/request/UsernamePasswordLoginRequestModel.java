package com.appsdeveloperblog.app.ws.ui.model.request;

import lombok.Data;

@Data
public class UsernamePasswordLoginRequestModel {
    private String emailId;
    private String password;
}
