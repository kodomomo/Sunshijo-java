package com.example.sunshijojava.present;

import com.example.sunshijojava.present.dto.request.ExamRequest;
import com.example.sunshijojava.present.dto.request.TimeRequest;
import com.example.sunshijojava.present.dto.request.UserInfoSetResponse;
import com.example.sunshijojava.present.dto.response.ExamResponse;
import com.example.sunshijojava.present.dto.response.QueryListResponse;
import com.example.sunshijojava.present.dto.response.UserSignResponse;
import com.example.sunshijojava.service.ExamService;
import com.example.sunshijojava.service.InfoSetService;
import com.example.sunshijojava.service.ShowTimeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class TimeController {
    private final InfoSetService infoSetService;
    private final ShowTimeService service;
    private final ExamService examService;

    @PatchMapping("/settings/{device}")
    public UserSignResponse update(@PathVariable("device") String deviceToken, @RequestBody @Valid UserInfoSetResponse request) {
        return infoSetService.updateInfo(deviceToken, request);
    }

    @GetMapping("/schedule")
    public QueryListResponse time(@RequestBody @Valid TimeRequest request) {
        return service.time(request);
    }

    @GetMapping("/exam")
    public ExamResponse exam(@RequestBody @Valid ExamRequest request) {
        return examService.findExam(request);
    }
}
