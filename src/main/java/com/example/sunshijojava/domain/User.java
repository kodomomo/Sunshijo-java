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
    @Column(columnDefinition = "BINARY(16)")
    private UUID id;

    @Column
    private Integer grade;

    @Column
    private Integer classNum;

    @NotNull
    @Column(unique = true)
    private String deviceToken;

    @Builder
    public User(Integer grade, Integer classNum, String deviceToken) {
        this.grade = grade;
        this.classNum = classNum;
        this.deviceToken = deviceToken;
    }

    public void updateUser(Integer grade, Integer classNum) {
        this.grade = grade;
        this.classNum = classNum;
    }
}
