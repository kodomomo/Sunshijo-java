package com.example.sunshijojava.domain;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "tbl_user")
@Entity
public class User {
    @Id @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(columnDefinition = "BINARY(36)")
    private UUID id;

    @Column
    private int grade;

    @Column
    private int classNum;

    @Column(unique = true)
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
