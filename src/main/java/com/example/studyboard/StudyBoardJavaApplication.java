package com.example.studyboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@ConfigurationPropertiesScan
@SpringBootApplication
public class StudyBoardJavaApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudyBoardJavaApplication.class, args);
    }

}
