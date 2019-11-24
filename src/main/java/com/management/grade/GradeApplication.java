package com.management.grade;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@MapperScan("com.management.grade.mapper")
@EnableCaching
public class GradeApplication {

    public static void main(String[] args) {
        SpringApplication.run(GradeApplication.class, args);
    }

}
