package com.wazny.quizhibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class MyController {

    @Autowired
    QuestionRepo questionRepo;

    @GetMapping("quiz")
    String getQuiz(Model model) {

        List<Question> questions = questionRepo.findAll();
        model.addAttribute("q", questions);
        return "quiz";
    }

}
