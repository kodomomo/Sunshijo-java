package com.example.sunshijojava.global.error.exception;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum ErrorCode {
    TIME_NOT_FOUND(404, "schedule-404-1", "schedule not found"),
    USER_NOT_FOUND(404, "user-404-0", "user not found");

    private final int status;
    private final String code;
    private final String message;
}
