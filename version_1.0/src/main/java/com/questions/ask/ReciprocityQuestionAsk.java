package com.questions.ask;

import com.questions.Question;

import java.util.Objects;

public class ReciprocityQuestionAsk implements Question {
    private String question = "Czy daję tej osobie co najmniej tyle samo o ile proszę?";

    public String getQuestion() {
        return question;
    }


    public Integer getScore(String answer) {
        if (Objects.equals(answer, "T")) {
            return 10;
        } else if (Objects.equals(answer, "N")) {
            return 0;
        } else {
            return null;
        }
    }

    @Override
    public String toString() {
        return "ReciprocityQuestionAsk{" +
                "question='" + question + '\'' +
                '}';
    }
}