package com.example.sunshijojava.domain;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "tbl_user")
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

    public void updateUser(int grade, int classNum) {
        this.grade = grade;
        this.classNum = classNum;
    }
}
