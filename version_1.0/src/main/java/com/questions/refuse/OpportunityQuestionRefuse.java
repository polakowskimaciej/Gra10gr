package com.questions.refuse;

import com.questions.Question;

import java.util.Objects;

public class OpportunityQuestionRefuse implements Question {
    private String question = "Czy mam to, czego chce ta osoba?";

    public String getQuestion() {
        return question;
    }

    public int getScore(String answer) {
        if(Objects.equals(answer, "N")) {
            return 10;
        } else {
            return 0;
        }
    }
}