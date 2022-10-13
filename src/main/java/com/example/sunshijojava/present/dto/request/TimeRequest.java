package com.example.sunshijojava.present.dto.request;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
public class TimeRequest {
    private int grade;
    private int classNum;
    private LocalDate date;
}
