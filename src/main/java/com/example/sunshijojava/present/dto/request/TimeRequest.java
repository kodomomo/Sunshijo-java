package com.example.sunshijojava.present.dto.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Getter
@NoArgsConstructor
public class TimeRequest {
    private int grade;
    private int classNum;

    private String date1;
    private String date2;
    private String date3;
    private String date4;
    private String date5;
}
