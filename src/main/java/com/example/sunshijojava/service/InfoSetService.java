package com.example.sunshijojava.service;

import com.example.sunshijojava.domain.User;
import com.example.sunshijojava.facade.UserFacade;
import com.example.sunshijojava.present.dto.request.UserInfoSetRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class InfoSetService {
    private final UserFacade userFacade;

    @Transactional
    public void updateInfo(String deviceToken, UserInfoSetRequest request) {
        User user = userFacade.findByDeviceToken(deviceToken);
        
        user.updateUser(request.getGrade(), request.getClassNum());
    }
}
