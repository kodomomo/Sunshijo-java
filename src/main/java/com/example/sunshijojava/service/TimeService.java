package com.example.sunshijojava.service;

import com.example.sunshijojava.domain.Time;
import com.example.sunshijojava.domain.repository.TimeRepository;
import com.example.sunshijojava.present.dto.request.ExamCreateRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class TimeService {
    private final TimeRepository timeRepository;

    public void create(ExamCreateRequest request) {
        timeRepository.save(
                Time.builder()
                        .classNum(request.getClassNum())
                        .grade(request.getGrade())
                        .dayOfWeek(request.getDate())
                        .isExam(request.isExam())
                        .sequence(request.getSequence())
                        .subject(request.getSubject())
                        .build()
        );
    }
}
