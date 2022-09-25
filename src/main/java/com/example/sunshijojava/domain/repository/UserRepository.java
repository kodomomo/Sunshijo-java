package com.example.sunshijojava.domain.repository;

import com.example.sunshijojava.domain.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Long> {
    Optional<User> findByDeviceToken(String deviceToken);
}
