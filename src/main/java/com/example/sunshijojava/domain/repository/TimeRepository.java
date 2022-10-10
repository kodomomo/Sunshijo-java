package com.example.sunshijojava.domain.repository;

import com.example.sunshijojava.domain.Time;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface TimeRepository extends JpaRepository<Time, UUID> {
    List<Time> findAllByDayOfWeekAndGradeAndClassNumOrderByDayOfWeekAscSequenceAsc(LocalDateTime date, int grade, int classNum);

    Optional<Time> findByDayOfWeekAndGradeAndClassNumAndSequence(LocalDateTime dateTime, int grade, int classNum, int sequence);
}
