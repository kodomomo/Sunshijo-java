package com.example.sunshijojava.domain.repository.command;

import com.example.sunshijojava.domain.Time;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

import java.util.List;

import static com.example.sunshijojava.domain.QTime.time;
import static com.example.sunshijojava.domain.QUser.user;

@RequiredArgsConstructor
public class TimeCustomImpl implements TimeCustom {

    private final JPAQueryFactory query;

    @Override
    public List<Time> getTimeByDate(String date) {
        return null;
    }
}
