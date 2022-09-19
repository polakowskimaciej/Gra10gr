package com.questions.ask;

import com.questions.Question;

import java.util.Objects;

public class TimeQuestionAsk implements Question {
    private String question = "Czy to jest odpowiedni czas na prośbę? (Czy ta osoba ma teraz dobry nastrój?)";

    public String getQuestion() {
        return question;
    }


    @Override
    public String toString() {
        return "TimeQuestionAsk{" +
                "question='" + question + '\'' +
                '}';
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
}