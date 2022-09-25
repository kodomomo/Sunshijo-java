package com.example.sunshijojava.domain.service;

import com.example.sunshijojava.domain.domain.User;
import com.example.sunshijojava.domain.domain.repository.UserRepository;
import com.example.sunshijojava.domain.present.dto.request.UserRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserSignService {
    private final UserRepository userRepository;

    public User sign(UserRequest request) {
        return userRepository.save(
                User.builder()
                        .grade(request.getGrade())
                        .classNum(request.getClassNum())
                        .deviceToken(request.getDeviceToken())
                        .build()
        );
    }
}
