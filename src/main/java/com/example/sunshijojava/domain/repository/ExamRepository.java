package com.example.sunshijojava.domain.repository;

import com.example.sunshijojava.domain.Exam;
import com.example.sunshijojava.domain.Time;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ExamRepository extends CrudRepository<Exam, Long> {
    List<Exam> findAllByTime(Time time);
}
