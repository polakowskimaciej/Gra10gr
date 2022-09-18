package com.questions.ask;

import com.questions.Question;

import java.util.Objects;

public class RelationshipQuestionAsk implements Question {
    private String question = "Czy to, czego chcę jest stosowne do mojej relacji z tą osobą?";

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