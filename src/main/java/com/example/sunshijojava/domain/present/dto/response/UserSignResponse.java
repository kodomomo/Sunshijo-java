package com.example.sunshijojava.domain.present.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@AllArgsConstructor
@Builder
public class UserSignResponse {
    private int grade;
    private int classNum;
}
