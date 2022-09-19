package com;

import com.questions.Question;
import com.questions.ask.*;
import com.questions.refuse.*;

import java.util.ArrayList;

public class GameLogic {
    private ArrayList<Question> questionsAsk = new ArrayList<>();
    private ArrayList<Question> questionsRefuse = new ArrayList<>();
    ScoreCounter scoreCounter = new ScoreCounter();
    //w konstruktorze pytania
    //jak odp na pytania to usówam pyt z listy, lista end i koniec

    public ArrayList<Question> getQuestionsAsk() {
        return questionsAsk;
    }

    public ArrayList<Question> getQuestionsRefuse() {
        return questionsRefuse;
    }

    //wybór ścieżki
    public void selectPath(String path) {
        while (true) {
            if (path.equals("P")) {
                getAsk();
                break;
            } else if (path.equals("O")) {
                getRefuse();
                break;
            } else {
                System.out.println("Wpisz P lub O");
            }
        }
    }

    public GameLogic() {
        questionsAsk.add(new OpportunityQuestionAsk());
        questionsAsk.add(new PrioritiesQuestionAsk());
        questionsAsk.add(new SeflRespectQuestionAsk());
        questionsAsk.add(new RightsQuestionAsk());
        questionsAsk.add(new PowerQuestionAsk());
        questionsAsk.add(new RelationshipQuestionAsk());
        questionsAsk.add(new GoalsQuestionAsk());
        questionsAsk.add(new ReciprocityQuestionAsk());
        questionsAsk.add(new KnowlageQuestionAsk());
        questionsAsk.add(new TimeQuestionAsk());
        questionsRefuse.add(new TimeQuestionRefuse());
        questionsRefuse.add(new OpportunityQuestionRefuse());
        questionsRefuse.add(new PrioritiesQuestionRefuse());
        questionsRefuse.add(new SeflRespectQuestionRefuse());
        questionsRefuse.add(new RightsQuestionRefuse());
        questionsRefuse.add(new PowerQuestionRefuse());
        questionsRefuse.add(new RelationshipQuestionRefuse());
        questionsRefuse.add(new GoalsQuestionRefuse());
        questionsRefuse.add(new ReciprocityQuestionRefuse());
        questionsRefuse.add(new KnowlageQuestionRefuse());
        questionsRefuse.add(new TimeQuestionRefuse());
    }
    public Question getAsk() {
        return questionsAsk.get(0);
    }

    public Question getRefuse() {
        return questionsRefuse.get(0);
    }


    public void getAnswerToAsk(String answer) {
        Question questionOne = questionsAsk.get(0);
        int score = questionOne.getScore(answer);
        scoreCounter.addScoreToList(score);
        questionsAsk.remove(0);
    }

    public void getAnswerToRefuse(String answer) {
        Question questionOne = questionsRefuse.get(0);
        int score = questionOne.getScore(answer);
        scoreCounter.addScoreToList(score);
        questionsRefuse.remove(0);
    }

    public int getSum() {
        return scoreCounter.getSum();
    }


}