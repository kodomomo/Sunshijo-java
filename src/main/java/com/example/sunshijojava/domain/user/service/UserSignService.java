package com.example.sunshijojava.domain.user.service;

import com.example.sunshijojava.domain.user.domain.User;
import com.example.sunshijojava.domain.user.domain.repository.UserRepository;
import com.example.sunshijojava.domain.user.present.dto.UserRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserSignService {
    private final UserRepository userRepository;

    public void sign(UserRequest request) {
        userRepository.save(
                User.builder()
                        .grade(request.getGrade())
                        .classNum(request.getClassNum())
                        .deviceToken(request.getDeviceToken())
                        .build()
        );
    }
}
