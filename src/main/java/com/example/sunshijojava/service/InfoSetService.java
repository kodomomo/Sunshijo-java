package com.example.sunshijojava.service;

import com.example.sunshijojava.domain.User;
import com.example.sunshijojava.domain.repository.UserRepository;
import com.example.sunshijojava.exception.UserNotFoundException;
import com.example.sunshijojava.present.dto.request.UserInfoSetResponse;
import com.example.sunshijojava.present.dto.response.UserSignResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class InfoSetService {
    private final UserRepository userRepository;

    @Transactional
    public UserSignResponse updateInfo(String deviceToken, UserInfoSetResponse request) {
        User user = userRepository.findByDeviceToken(deviceToken)
                .orElseThrow(() -> UserNotFoundException.EXCEPTION);

        user.updateUser(request.getGrade(), request.getClassNum());

        return UserSignResponse.builder()
                .grade(request.getGrade())
                .classNum(request.getClassNum())
                .build();
    }
}