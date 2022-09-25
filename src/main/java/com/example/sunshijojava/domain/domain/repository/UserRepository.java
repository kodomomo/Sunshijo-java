package com.example.sunshijojava.domain.domain.repository;

import com.example.sunshijojava.domain.domain.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Long> {
    Optional<User> findByDeviceToken(String deviceToken);
}
