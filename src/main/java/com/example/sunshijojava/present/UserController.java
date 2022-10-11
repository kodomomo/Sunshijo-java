package com.example.sunshijojava.present;

import com.example.sunshijojava.present.dto.request.UserRequest;
import com.example.sunshijojava.service.UserSignService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("/auth")
public class UserController {
    private final UserSignService userSignService;

    @PostMapping("/login")
    public void sign(@RequestBody @Valid UserRequest request) {
        userSignService.sign(request);
    }
}
