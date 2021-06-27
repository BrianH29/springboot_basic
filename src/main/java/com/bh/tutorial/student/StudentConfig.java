package com.bh.tutorial.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.JANUARY;
import static java.time.Month.SEPTEMBER;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student jane = new Student(
                    "Jane",
                    "jane@naver.com",
                    LocalDate.of(1993, SEPTEMBER, 18),
                    27
            );

            Student alex = new Student(
                    "Alex",
                    "alex@naver.com",
                    LocalDate.of(1997, JANUARY, 8),
                    23
            );

            repository.saveAll(List.of(jane, alex));
        };
    }
}
