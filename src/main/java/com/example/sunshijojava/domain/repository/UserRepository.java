package com.example.sunshijojava.domain.repository;

import com.example.sunshijojava.domain.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;
import java.util.UUID;

public interface UserRepository extends CrudRepository<User, UUID> {
    Optional<User> findByDeviceToken(String deviceToken);
}
