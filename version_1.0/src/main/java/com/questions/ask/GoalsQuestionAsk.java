package com.questions.ask;

import com.questions.Question;

import java.util.Objects;

public class GoalsQuestionAsk implements Question {
    private String question = "Czy prośba jest istotna dla długowalowego celu?";

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