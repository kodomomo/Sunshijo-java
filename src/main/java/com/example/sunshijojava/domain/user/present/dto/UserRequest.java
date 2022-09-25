package com.example.sunshijojava.domain.user.present.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class UserRequest {

    private int grade;

    private int classNum;
    
    private String deviceToken;
}
