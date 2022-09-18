package com.questions.refuse;

import com.questions.Question;

import java.util.Objects;

public class TimeQuestionRefuse implements Question {
    private String question = "Czy należy poczekać z odmową?";

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