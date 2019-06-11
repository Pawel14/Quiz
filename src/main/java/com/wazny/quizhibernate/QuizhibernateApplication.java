package com.wazny.quizhibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QuizhibernateApplication implements CommandLineRunner {

    @Autowired
    QuestionRepo questionRepo;

    public static void main(String[] args) {
        SpringApplication.run(QuizhibernateApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {


    }
}
