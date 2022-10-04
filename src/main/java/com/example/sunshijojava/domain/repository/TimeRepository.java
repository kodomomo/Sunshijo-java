package com.example.sunshijojava.domain.repository;

import com.example.sunshijojava.domain.Time;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface TimeRepository extends JpaRepository<Time, UUID> {
    List<Time> findAllByDayOfWeekAndGradeAndClassNumOrderByDayOfWeekAscSequenceAsc(String date, int grade, int classNum);
}