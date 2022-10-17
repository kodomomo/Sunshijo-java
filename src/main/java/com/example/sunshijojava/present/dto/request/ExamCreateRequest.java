package com.example.sunshijojava.present.dto.request;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ExamCreateRequest {
    private int classNum;
    private String date;
    private int grade;
    private boolean isExam;
    private int sequence;
    private String subject;
}
