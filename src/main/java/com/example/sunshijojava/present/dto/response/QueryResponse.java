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
public class QueryResponse {
    private final List<QueryTimeResponse> list1;
    private final List<QueryTimeResponse> list2;
    private final List<QueryTimeResponse> list3;
    private final List<QueryTimeResponse> list4;
    private final List<QueryTimeResponse> list5;

    @Getter
    @Builder
    public static class QueryTimeResponse {
        private final UUID scheduleId;
        private final String dayOfWeek;
        private final int sequence;
        private final String subject;
        private final boolean isExam;

    }
}
