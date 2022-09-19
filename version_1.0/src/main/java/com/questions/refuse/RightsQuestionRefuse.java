package com.questions.refuse;

import com.questions.Question;

import java.util.Objects;

public class RightsQuestionRefuse implements Question {
    private String question = "Czy prawo lub zasady moralne obligują mnie do spełnienia prośby albo czy odmowa naruszy prawa tej osoby?";

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
        return "RightsQuestionRefuse{" +
                "question='" + question + '\'' +
                '}';
    }
}