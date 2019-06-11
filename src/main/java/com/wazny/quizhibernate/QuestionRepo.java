package com.wazny.quizhibernate;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface QuestionRepo extends JpaRepository<Question, Long> {

    Optional<Question> findQuestionByContent(String title);

}
