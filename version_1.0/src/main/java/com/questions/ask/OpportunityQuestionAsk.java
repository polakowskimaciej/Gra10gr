package com.questions.ask;

import com.questions.Question;

import java.util.Objects;

public class OpportunityQuestionAsk implements Question {
    private String question = "Czy ta osoba może dać Ci lub zrobić to, czego chcesz?";

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