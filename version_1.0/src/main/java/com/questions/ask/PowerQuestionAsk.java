package com.questions.ask;

import com.questions.Question;

import java.util.Objects;

public class PowerQuestionAsk implements Question {
    private String question = "Czy jestem odpowiedzialny za mówienie tej osobie co ma robić?";

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