package com.example.sunshijojava.domain.repository.command;

import com.example.sunshijojava.domain.Time;

import java.util.List;

public interface TimeCustom {
    List<Time> getTimeByDate(String date);
}
