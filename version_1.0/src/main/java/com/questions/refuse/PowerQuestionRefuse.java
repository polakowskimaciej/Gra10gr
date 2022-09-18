package com.questions.refuse;

import com.questions.Question;

import java.util.Objects;

public class PowerQuestionRefuse implements Question {
    private String question = "Czy druga osoba jest odpowiedzialna za mówienie mi co mam robić?";

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