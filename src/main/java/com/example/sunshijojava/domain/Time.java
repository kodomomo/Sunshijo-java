package com.example.sunshijojava.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity(name = "tbl_schedule")
public class Time {
    @Id @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(columnDefinition = "BINARY(36)")
    private UUID scheduleId;

    @Column
    private int grade;

    @Column
    private int classNum;

    @Column
    private String subject;

    @Column
    private String dayOfWeek;

    @Column
    private int sequence;

    @Column
    private boolean isExam;
}
