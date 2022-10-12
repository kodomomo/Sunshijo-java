package com.example.sunshijojava.present;

import com.example.sunshijojava.present.dto.request.ExamRequest;
import com.example.sunshijojava.present.dto.request.TimeRequest;
import com.example.sunshijojava.present.dto.request.UserInfoSetRequest;
import com.example.sunshijojava.present.dto.response.ExamResponse;
import com.example.sunshijojava.present.dto.response.QueryListResponse;
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

    @PutMapping("/settings/{device}")
    public void update(@PathVariable("device") String device, @RequestBody @Valid UserInfoSetRequest request) {
          infoSetService.updateInfo(device, request);
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
