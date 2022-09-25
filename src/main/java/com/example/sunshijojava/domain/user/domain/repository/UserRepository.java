package com.example.sunshijojava.domain.user.domain.repository;

import com.example.sunshijojava.domain.user.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
