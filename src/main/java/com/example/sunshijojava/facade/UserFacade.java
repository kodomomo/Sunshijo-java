package com.example.sunshijojava.facade;

import com.example.sunshijojava.domain.User;
import com.example.sunshijojava.domain.repository.UserRepository;
import com.example.sunshijojava.exception.UserNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class UserFacade {
    private final UserRepository userRepository;

    public User findByDeviceToken(String deviceToken) {
        return userRepository.findByDeviceToken(deviceToken)
                .orElseThrow(() -> UserNotFoundException.EXCEPTION);
    }
}
