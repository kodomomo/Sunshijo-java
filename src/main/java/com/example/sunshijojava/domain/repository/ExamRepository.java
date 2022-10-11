package com.example.sunshijojava.domain.repository;

import com.example.sunshijojava.domain.Exam;
import com.example.sunshijojava.domain.Time;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.UUID;

public interface ExamRepository extends CrudRepository<Exam, UUID> {
    List<Exam> findAllByTime(Time time);
}
