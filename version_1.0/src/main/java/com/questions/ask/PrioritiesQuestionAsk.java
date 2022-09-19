package com.questions.ask;

import com.questions.Question;

import java.util.Objects;

public class PrioritiesQuestionAsk implements Question {
    private String question = "Czy osiągnięcie celu jest ważniejsze niż relacja z tą osobą?";

    public String getQuestion() {
        return question;
    }

    @Override
    public String toString() {
        return "PrioritiesQuestionAsk{" +
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
