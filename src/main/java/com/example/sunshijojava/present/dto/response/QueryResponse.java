package com.example.sunshijojava.present.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Getter
@AllArgsConstructor
@Builder
public class QueryResponse {
    private final List<QueryTimeResponse> responseList;

    @Getter
    @Builder
    public static class QueryTimeResponse {
        private final UUID scheduleId;
        private final LocalDateTime dayOfWeek;
        private final int sequence;
        private final String subject;
        private final boolean isExam;

    }
}
