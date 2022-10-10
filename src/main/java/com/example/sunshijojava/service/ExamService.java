package com.example.sunshijojava.service;

import com.example.sunshijojava.domain.Time;
import com.example.sunshijojava.domain.repository.ExamRepository;
import com.example.sunshijojava.domain.repository.TimeRepository;
import com.example.sunshijojava.exception.ScheduleNotFoundException;
import com.example.sunshijojava.present.dto.request.ExamRequest;
import com.example.sunshijojava.present.dto.response.ExamResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class ExamService {
    private final TimeRepository timeRepository;
    private final ExamRepository examRepository;

    public ExamResponse findExam(ExamRequest request) {
        Time time = timeRepository.findByDayOfWeekAndGradeAndClassNumAndSequence(
                request.getDateTime(), request.getGrade(), request.getClassNum(), request.getSequence()
                )
                .orElseThrow(() -> ScheduleNotFoundException.EXCEPTION);


        List<ExamResponse.ExamDto> examDtos = examRepository.findAllByTime(time)
                .stream()
                .map(exam -> ExamResponse.ExamDto.builder()
                        .examId(exam.getId())
                        .title(exam.getTitle())
                        .teacher(exam.getTeacher().getName())
                        .examDate(exam.getDate())
                        .build()
                )
                .collect(Collectors.toList());

        return new ExamResponse(examDtos);
    }
}
