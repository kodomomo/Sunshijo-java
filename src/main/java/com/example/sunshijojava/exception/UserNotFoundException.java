package com.example.sunshijojava.exception;


import com.example.sunshijojava.global.error.exception.ErrorCode;
import com.example.sunshijojava.global.error.exception.SunException;

public class UserNotFoundException extends SunException {
    public static final UserNotFoundException EXCEPTION =
            new UserNotFoundException();

    public UserNotFoundException() {
        super(ErrorCode.USER_NOT_FOUND);
    }
}
