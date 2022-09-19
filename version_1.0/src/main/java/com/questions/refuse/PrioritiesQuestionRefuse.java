package com.questions.refuse;

import com.questions.Question;

import java.util.Objects;

public class PrioritiesQuestionRefuse implements Question {
    private String question = "Czy moja relacja z tą osobą jest ważniejsza niż odmowa?";

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
        return "PrioritiesQuestionRefuse{" +
                "question='" + question + '\'' +
                '}';
    }
}
