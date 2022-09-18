package com.questions.refuse;

import com.questions.Question;

import java.util.Objects;

public class PrioritiesQuestionRefuse implements Question {
    private String question = "Czy moja relacja z tą osobą jest ważniejsza niż odmowa?";

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
