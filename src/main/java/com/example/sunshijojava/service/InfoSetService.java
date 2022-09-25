package com.example.sunshijojava.service;

import com.example.sunshijojava.domain.User;
import com.example.sunshijojava.domain.repository.UserRepository;
import com.example.sunshijojava.present.dto.request.UserRequest;
import com.example.sunshijojava.present.dto.response.UserSignResponse;
import com.example.sunshijojava.exception.UserNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class InfoSetService {
    private final UserRepository userRepository;

    @Transactional
    public UserSignResponse updateInfo(UserRequest request) {
        User user = userRepository.findByDeviceToken(request.getDeviceToken())
                .orElseThrow(() -> UserNotFoundException.EXCEPTION);

        user.updateUser(request.getGrade(), request.getClassNum());

        return UserSignResponse.builder()
                .grade(request.getGrade())
                .classNum(request.getClassNum())
                .build();
    }
}
