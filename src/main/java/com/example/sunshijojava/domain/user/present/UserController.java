package com.example.sunshijojava.domain.user.present;

import com.example.sunshijojava.domain.user.present.dto.UserRequest;
import com.example.sunshijojava.domain.user.service.UserSignService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/login")
@RequiredArgsConstructor
public class UserController {
    private final UserSignService userSignService;

    @PostMapping
    public void sign(@RequestBody @Valid UserRequest request) {
        userSignService.sign(request);
    }
}
