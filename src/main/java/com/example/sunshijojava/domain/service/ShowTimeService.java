package com.example.sunshijojava.domain.service;

import com.example.sunshijojava.domain.domain.User;
import com.example.sunshijojava.domain.domain.repository.UserRepository;
import com.example.sunshijojava.exception.UserNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

@Service
@RequiredArgsConstructor
public class ShowTimeService {
    private final UserRepository userRepository;

    public void get(String deviceToken) throws IOException {
        User user = userRepository.findByDeviceToken(deviceToken)
                .orElseThrow(() -> UserNotFoundException.EXCEPTION);

        StringBuilder builder = new StringBuilder("https://open.neis.go.kr/hub/hisTimetable");
        builder.append("?").append(URLEncoder.encode("ATPT_OFCDC_SC_CODE", "UTF-8")).append("=").append("G10");
        builder.append("?").append(URLEncoder.encode("SD_SCHUL_CODE", "UTF-8")).append("=").append("7430310");
        builder.append("?").append(URLEncoder.encode("AY", "UTF-8")).append("=").append(2022);
        builder.append("?").append(URLEncoder.encode("SEM", "UTF-8")).append("=").append(2);
        builder.append("?").append(URLEncoder.encode("Type", "UTF-8")).append("=").append("json");
        builder.append("?").append(URLEncoder.encode("pIndex", "UTF-8")).append("=").append(1);
        builder.append("?").append(URLEncoder.encode("pSize", "UTF-8")).append("=").append(100);
        builder.append("&").append(URLEncoder.encode("GRADE", "UTF-8")).append("=").append(user.getGrade());
        builder.append("&").append(URLEncoder.encode("CLASS_NM", "UTF-8")).append("=").append(user.getClassNum());
        builder.append("&").append(URLEncoder.encode("ALL_TI_YMD", "UTF-8")).append("=").append(20220918);
        builder.append("&").append(URLEncoder.encode("KEY", "UTF-8")).append("=").append("585f960221af4ba9adb0e6d4fe86eaf6");

        URL url = new URL(builder.toString());

        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        connection.setRequestMethod("GET");
        connection.setRequestProperty("Content-type", "application/json");
        connection.setDoOutput(true);

        StringBuffer buffer = new StringBuffer();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream(), "UTF-8"));

        while (bufferedReader.ready()) {
            buffer.append(bufferedReader.readLine());
        }
    }
}
