package com.example.sunshijojava.domain.present;

import com.example.sunshijojava.domain.present.dto.request.UserRequest;
import com.example.sunshijojava.domain.present.dto.response.UserSignResponse;
import com.example.sunshijojava.domain.service.InfoSetService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class TimeController {
    private final InfoSetService infoSetService;

    @PatchMapping("/settings")
    public UserSignResponse update(@RequestBody @Valid UserRequest request) {
        return infoSetService.updateInfo(request);
    }
}
