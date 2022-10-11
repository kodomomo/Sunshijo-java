package com.example.sunshijojava.domain.repository;

import com.example.sunshijojava.domain.Time;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface TimeRepository extends CrudRepository<Time, UUID> {
    List<Time> findAllByDayOfWeekAndGradeAndClassNumOrderByDayOfWeekAscSequenceAsc(String date, int grade, int classNum);

    Optional<Time> findByDayOfWeekAndGradeAndClassNumAndSequence(String dateTime, int grade, int classNum, int sequence);
}
