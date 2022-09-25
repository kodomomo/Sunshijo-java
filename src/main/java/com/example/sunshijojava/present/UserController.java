package com.example.sunshijojava.present;

import com.example.sunshijojava.domain.User;
import com.example.sunshijojava.present.dto.request.UserRequest;
import com.example.sunshijojava.service.UserSignService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class UserController {
    private final UserSignService userSignService;

    @PostMapping("/login")
    public User sign(@RequestBody @Valid UserRequest request) {
        return userSignService.sign(request);
    }
}
