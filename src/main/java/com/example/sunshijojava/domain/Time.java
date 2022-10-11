package com.example.sunshijojava.domain;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "tbl_schedule")
@Entity
public class Time {
    @Id @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(columnDefinition = "BINARY(36)")
    private UUID id;

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

    @Builder
    public Time(int grade, int classNum, String subject, String dayOfWeek, int sequence, boolean isExam) {
        this.grade = grade;
        this.classNum = classNum;
        this.subject = subject;
        this.dayOfWeek = dayOfWeek;
        this.sequence = sequence;
        this.isExam = isExam;
    }
}
