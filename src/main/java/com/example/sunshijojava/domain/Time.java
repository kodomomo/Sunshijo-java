package com.example.sunshijojava.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
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
    private UUID scheduleId;

    @Column
    private int grade;

    @Column
    private int classNum;

    @Column
    private String subject;

    @Column
    private Date dayOfWeek;

    @Column
    private int sequence;

    @Column
    private boolean isExam;
}
