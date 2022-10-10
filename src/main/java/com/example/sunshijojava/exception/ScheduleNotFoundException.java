package com.example.sunshijojava.exception;

import com.example.sunshijojava.global.error.exception.ErrorCode;
import com.example.sunshijojava.global.error.exception.SunException;

public class ScheduleNotFoundException extends SunException {
    public static final ScheduleNotFoundException EXCEPTION =
            new ScheduleNotFoundException();

    public ScheduleNotFoundException() {
        super(ErrorCode.TIME_NOT_FOUND);
    }
}
