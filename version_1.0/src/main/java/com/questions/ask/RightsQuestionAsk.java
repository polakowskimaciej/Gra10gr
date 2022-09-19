package com.questions.ask;

import com.questions.Question;

import java.util.Objects;

public class RightsQuestionAsk implements Question {
    private String question = "Czy prawo lub zasady moralne nakazują tej osobie dać mi to, czego chcę?";

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
        return "RightsQuestionAsk{" +
                "question='" + question + '\'' +
                '}';
    }
}