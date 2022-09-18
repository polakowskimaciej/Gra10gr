package com;

import com.answers.AnswersAsk;
import com.answers.AnswersRefuse;

import java.util.ArrayList;

public class ScoreCounter {
    private static final ArrayList<Integer> scores = new ArrayList();
    AnswersAsk answersAsk = new AnswersAsk();
    AnswersRefuse answersRefuse = new AnswersRefuse();

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
            return answersAsk.getAnswer1();
        } else if (getSum() == 20) {
            return answersAsk.getAnswer2();
        } else if (getSum() == 30) {
            return answersAsk.getAnswer3();
        } else if (getSum() == 40) {
            return answersAsk.getAnswer4();
        } else if (getSum() == 50) {
            return answersAsk.getAnswer5();
        } else if (getSum() == 60) {
            return answersAsk.getAnswer6();
        } else if (getSum() == 70) {
            return answersAsk.getAnswer7();
        } else if (getSum() == 80) {
            return answersAsk.getAnswer8();
        } else if (getSum() == 90) {
            return answersAsk.getAnswer9();
        } else if (getSum() == 100) {
            return answersAsk.getAnswer10();
        }
        return null;
    }

    public String checkScoreRefuse() {
        if (getSum() <= 10) {
            return answersRefuse.getAnswer1();
        } else if (getSum() == 20) {
            return answersRefuse.getAnswer2();
        } else if (getSum() == 30) {
            return answersRefuse.getAnswer3();
        } else if (getSum() == 40) {
            return answersRefuse.getAnswer4();
        } else if (getSum() == 50) {
            return answersRefuse.getAnswer5();
        } else if (getSum() == 60) {
            return answersRefuse.getAnswer6();
        } else if (getSum() == 70) {
            return answersRefuse.getAnswer7();
        } else if (getSum() == 80) {
            return answersRefuse.getAnswer8();
        } else if (getSum() == 90) {
            return answersRefuse.getAnswer9();
        } else if (getSum() == 100) {
            return answersRefuse.getAnswer10();
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