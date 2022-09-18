package com.questions.ask;

import com.questions.Question;

import java.util.Objects;

public class TimeQuestionAsk implements Question {
    private String question = "Czy to jest odpowiedni czas na prośbę? (Czy ta osoba ma teraz dobry nastrój?)";

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