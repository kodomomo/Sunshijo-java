package com.example.sunshijojava.present.dto.request;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
public class ExamRequest {
    private int grade;
    private int classNum;
    private LocalDateTime dateTime;
    private int sequence;
}
