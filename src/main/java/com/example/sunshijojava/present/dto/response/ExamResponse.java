package com.example.sunshijojava.present.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Getter
@AllArgsConstructor
@Builder
public class ExamResponse {
    private List<ExamDto> examDtos;

    @Getter
    @Builder
    public static class ExamDto {
        private UUID examId;
        private String title;
        private String teacher;
        private String examDate;
    }
}
