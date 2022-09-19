package com.questions.ask;

import com.questions.Question;

import java.util.Objects;

public class SeflRespectQuestionAsk implements Question {
    private String question = "Czy prośba zwiększy Twoje poczucie kompetencji i szacunek do Siebie?";

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
        return "SeflRespectQuestionAsk{" +
                "question='" + question + '\'' +
                '}';
    }
}