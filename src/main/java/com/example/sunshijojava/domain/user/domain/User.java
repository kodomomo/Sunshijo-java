package com.example.sunshijojava.domain.user.domain;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column
    private int grade;

    @NotNull
    @Column
    private int classNum;

    @NotNull
    @Column
    private String deviceToken;

    @Builder
    public User(int grade, int classNum, String deviceToken) {
        this.grade = grade;
        this.classNum = classNum;
        this.deviceToken = deviceToken;
    }
}
