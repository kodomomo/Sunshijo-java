package com.example.sunshijojava.domain.repository;

import com.example.sunshijojava.domain.Teacher;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface TeacherRepository extends CrudRepository<Teacher, UUID> {
}
