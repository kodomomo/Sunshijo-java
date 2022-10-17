package com.example.sunshijojava.present.dto.request;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Getter
@NoArgsConstructor
public class UserRequest {

    private Integer grade;

    private Integer classNum;

    @NotBlank(message = "공백은 허용하지 않습니다")
    private String deviceToken;
}
