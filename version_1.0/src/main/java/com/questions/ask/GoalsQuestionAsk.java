package com.questions.ask;

import com.questions.Question;

import java.util.Objects;

public class GoalsQuestionAsk implements Question {
    private String question = "Czy prośba jest istotna dla długowalowego celu?";

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

    //@Override
    //public String display() {
        //return question;
    //}

    @Override
    public String toString() {
        return "GoalsQuestionAsk{" +
                "question='" + question + '\'' +
                '}';
    }
}