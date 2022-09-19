package com.questions.ask;

import com.questions.Question;

import java.util.Objects;

public class KnowlageQuestionAsk implements Question {
    private String question = "Czy wiem czego chcę i czy znam fakty niezbędne do poparcia mojej prośby?";

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
        return "KnowlageQuestionAsk{" +
                "question='" + question + '\'' +
                '}';
    }
}