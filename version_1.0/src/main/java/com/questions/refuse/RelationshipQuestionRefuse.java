package com.questions.refuse;

import com.questions.Question;

import java.util.Objects;

public class RelationshipQuestionRefuse implements Question {
    private String question = "Czy to, czego chce ode mnie ta osoba jest stosowne do mojej relacji z tą osobą?";

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
        return "RelationshipQuestionRefuse{" +
                "question='" + question + '\'' +
                '}';
    }
}