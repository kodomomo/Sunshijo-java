package com.example.sunshijojava.service;

import com.example.sunshijojava.domain.repository.TimeRepository;
import com.example.sunshijojava.present.dto.request.TimeRequest;
import com.example.sunshijojava.present.dto.response.QueryResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class ShowTimeService {
    private final TimeRepository timeRepository;

    public QueryResponse time(TimeRequest request) {

        List<QueryResponse.QueryTimeResponse> list =

                timeRepository.findAllByDayOfWeek(
                                request.getDate1()
                        )
                        .stream()
                        .map(time ->
                                QueryResponse.QueryTimeResponse.builder()
                                        .scheduleId(time.getId())
                                        .dayOfWeek(time.getDayOfWeek())
                                        .sequence(time.getSequence())
                                        .subject(time.getSubject())
                                        .isExam(time.isExam())
                                        .build()
                        ).collect(Collectors.toList());

        List<QueryResponse.QueryTimeResponse> list2 =

                timeRepository.findAllByDayOfWeek(
                                request.getDate2()
                        )
                        .stream()
                        .map(time ->
                                QueryResponse.QueryTimeResponse.builder()
                                        .scheduleId(time.getId())
                                        .dayOfWeek(time.getDayOfWeek())
                                        .sequence(time.getSequence())
                                        .subject(time.getSubject())
                                        .isExam(time.isExam())
                                        .build()
                        ).collect(Collectors.toList());

        List<QueryResponse.QueryTimeResponse> list3 =

                timeRepository.findAllByDayOfWeek(
                                request.getDate3()
                        )
                        .stream()
                        .map(time ->
                                QueryResponse.QueryTimeResponse.builder()
                                        .scheduleId(time.getId())
                                        .dayOfWeek(time.getDayOfWeek())
                                        .sequence(time.getSequence())
                                        .subject(time.getSubject())
                                        .isExam(time.isExam())
                                        .build()
                        ).collect(Collectors.toList());

        List<QueryResponse.QueryTimeResponse> list4 =

                timeRepository.findAllByDayOfWeek(
                                request.getDate4()
                        )
                        .stream()
                        .map(time ->
                                QueryResponse.QueryTimeResponse.builder()
                                        .scheduleId(time.getId())
                                        .dayOfWeek(time.getDayOfWeek())
                                        .sequence(time.getSequence())
                                        .subject(time.getSubject())
                                        .isExam(time.isExam())
                                        .build()
                        ).collect(Collectors.toList());

        List<QueryResponse.QueryTimeResponse> list5 =

                timeRepository.findAllByDayOfWeek(
                                request.getDate5()
                        )
                        .stream()
                        .map(time ->
                                QueryResponse.QueryTimeResponse.builder()
                                        .scheduleId(time.getId())
                                        .dayOfWeek(time.getDayOfWeek())
                                        .sequence(time.getSequence())
                                        .subject(time.getSubject())
                                        .isExam(time.isExam())
                                        .build()
                        ).collect(Collectors.toList());

        return new QueryResponse(list, list2, list3, list4, list5);

    }
}
