package com.questions.ask;

import com.questions.Question;

import java.util.Objects;

public class ReciprocityQuestionAsk implements Question {
    private String question = "Czy daję tej osobie co najmniej tyle samo o ile proszę?";

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