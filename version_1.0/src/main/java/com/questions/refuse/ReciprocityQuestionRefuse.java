package com.questions.refuse;

import com.questions.Question;

import java.util.Objects;

public class ReciprocityQuestionRefuse implements Question {
    private String question = "Czy ta osoba wiele dla mnie robi?";

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