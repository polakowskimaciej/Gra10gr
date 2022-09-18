package com.questions.ask;

import com.questions.Question;

import java.util.Objects;

public class RightsQuestionAsk implements Question {
    private String question = "Czy prawo lub zasady moralne nakazują tej osobie dać mi to, czego chcę?";

    public String getQuestion() {
        return question;
    }

    public int getScore(String answer) {
        if(Objects.equals(answer, "T")) {
            return 10;
        } else {
            return 0;
        }
    }
}