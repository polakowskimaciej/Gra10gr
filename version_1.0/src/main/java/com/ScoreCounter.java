package com;

import com.answers.AnswersAsk;
import com.answers.AnswersRefuse;

import java.util.ArrayList;

public class ScoreCounter {
    private static final ArrayList<Integer> scores = new ArrayList();

    public void addScoreToList(int score) {
        scores.add(score);
    }

    public void clearScoresList() {
        scores.clear();
    }

    public int getSum() {
        return scores.stream()
                .reduce(0, Integer::sum);
    }

    public void printSum() {
        System.out.println("Twój wynik to: " + getSum());
    }

    public String checkScoreAsk() {
        if (getSum() <= 10) {
            return AnswersAsk.Answer1.getAnswer();
        } else if (getSum() == 20) {
            return AnswersAsk.Answer2.getAnswer();
        } else if (getSum() == 30) {
            return AnswersAsk.Answer3.getAnswer();
        } else if (getSum() == 40) {
            return AnswersAsk.Answer4.getAnswer();
        } else if (getSum() == 50) {
            return AnswersAsk.Answer5.getAnswer();
        } else if (getSum() == 60) {
            return AnswersAsk.Answer6.getAnswer();
        } else if (getSum() == 70) {
            return AnswersAsk.Answer7.getAnswer();
        } else if (getSum() == 80) {
            return AnswersAsk.Answer8.getAnswer();
        } else if (getSum() == 90) {
            return AnswersAsk.Answer9.getAnswer();
        } else if (getSum() == 100) {
            return AnswersAsk.Answer10.getAnswer();
        }
        return null;
    }

    public String checkScoreRefuse() {
        if (getSum() <= 10) {
            return AnswersRefuse.Answer1.getAnswer();
        } else if (getSum() == 20) {
            return AnswersRefuse.Answer2.getAnswer();
        } else if (getSum() == 30) {
            return AnswersRefuse.Answer3.getAnswer();
        } else if (getSum() == 40) {
            return AnswersRefuse.Answer4.getAnswer();
        } else if (getSum() == 50) {
            return AnswersRefuse.Answer5.getAnswer();
        } else if (getSum() == 60) {
            return AnswersRefuse.Answer6.getAnswer();
        } else if (getSum() == 70) {
            return AnswersRefuse.Answer7.getAnswer();
        } else if (getSum() == 80) {
            return AnswersRefuse.Answer8.getAnswer();
        } else if (getSum() == 90) {
            return AnswersRefuse.Answer9.getAnswer();
        } else if (getSum() == 100) {
            return AnswersRefuse.Answer10.getAnswer();
        }
        return null;
    }

    public void correctScore(int index) {
        if (scores.indexOf(index) == 0)
            scores.set(index, 10);
        else {
            scores.set(index, 0);
        }


    }

    public void showAnswers() {
        scores.forEach(System.out::println);
    }
}