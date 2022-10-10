package com.example.sunshijojava.service;

import com.example.sunshijojava.domain.repository.TimeRepository;
import com.example.sunshijojava.present.dto.request.TimeRequest;
import com.example.sunshijojava.present.dto.response.QueryListResponse;
import com.example.sunshijojava.present.dto.response.QueryResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class ShowTimeService {
    private final TimeRepository timeRepository;

    public QueryResponse time(TimeRequest request) {

        List<QueryResponse.QueryTimeResponse> list =
                timeRepository.findAllByDayOfWeekAndGradeAndClassNumOrderByDayOfWeekAscSequenceAsc(
                                request.getDate(), request.getGrade(), request.getClassNum()
                        )
                        .stream()
                        .map(time ->
                                QueryResponse.QueryTimeResponse.builder()
                                        .scheduleId(time.getScheduleId())
                                        .dayOfWeek(time.getDayOfWeek())
                                        .sequence(time.getSequence())
                                        .subject(time.getSubject())
                                        .isExam(time.isExam())
                                        .build()
                        ).collect(Collectors.toList());

        return new QueryResponse(list);
    }
}
