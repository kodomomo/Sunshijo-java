package com.example.sunshijojava.global.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@EnableJpaAuditing
@Configuration
public class JpaAudtingConfig {
}
