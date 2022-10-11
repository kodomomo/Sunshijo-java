package com.example.sunshijojava.service;

import com.example.sunshijojava.domain.User;
import com.example.sunshijojava.domain.repository.UserRepository;
import com.example.sunshijojava.exception.UserNotFoundException;
import com.example.sunshijojava.present.dto.request.UserInfoSetRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class InfoSetService {
    private final UserRepository userRepository;

    @Transactional
    public void updateInfo(String deviceToken, UserInfoSetRequest request) {
        User user = userRepository.findByDeviceToken(deviceToken)
                .orElseThrow(() -> UserNotFoundException.EXCEPTION);

        user.updateUser(request.getGrade(), request.getClassNum());
    }
}
