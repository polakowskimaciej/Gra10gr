package com.questions.refuse;

import com.questions.Question;

import java.util.Objects;

public class RightsQuestionRefuse implements Question {
    private String question = "Czy prawo lub zasady moralne obligują mnie do spełnienia prośby albo czy odmowa naruszy prawa tej osoby?";

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