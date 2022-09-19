package com;

import java.util.Objects;
import java.util.Scanner;

public class Application {
    //1. prośba czy odmowa? - pytanie i scanner po odpowiedź
    //2. seria pytań
    //3. zliczenie punktów
    //4. podanie wyniku
    //5. Przegląd listy - które pytania są ważniejsze?
    //6. Jeśli tak - Pytanie z kim się konsultujesz?, jeśli nie, to zakup opcji
    //6. czy konsultant koryguje wynik?
    //7. korekta wyniku
    //8. zakup opcji - którą wybierasz z tych na które Cię stać
//main nie potrzebny - bo załóż, że nie masz konsoli
    //testy - stan w klasie, ale
    //pytanie jako osobna klasa - metoda weryfikuj odpowiedź string z odpowiedzią i zwracam ilość punków
    public static void main(String[] args) {
        GameLogic gameLogic = new GameLogic();
        ScoreCounter scoreCounter = new ScoreCounter();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz P jeśli pytasz lub O jeśli Odmawiasz");
        String path = scanner.nextLine();
        gameLogic.selectPath(path);
            if (path.equals("P")) {
                do {
                    String answer = scanner.nextLine();
                    gameLogic.getAnswerToAsk(answer);
                    System.out.println(gameLogic.getAsk());
                }
                while (gameLogic.getQuestionsAsk().size() > 0);
            } else if (path.equals("O")) {
                do {
                    String answer = scanner.nextLine();
                    gameLogic.getAnswerToRefuse(answer);
                    System.out.println(gameLogic.getRefuse());
                }
                while (gameLogic.getQuestionsRefuse().size() > 0);
        }
            System.out.println("Otrzymałeś " + scoreCounter.getSum() + "gr");
        if (path.equals("P")) {
            scoreCounter.checkScoreAsk();
        } else {
            scoreCounter.checkScoreRefuse();
        }
        System.out.println("Czy chcesz poprawić wynik?");
        System.out.println("Wpisz T jeśli Tak");
        String answerCorrectScore = scanner.nextLine();
        if (answerCorrectScore.equals("T")) {
            scoreCounter.showAnswers();
            System.out.println("Którą odpowiedź chcesz poprawić? Wpisz numer");
            int answerNumber = scanner.nextInt();
            scoreCounter.correctScore(answerNumber);
        } else {
            System.out.println("Powodzenia :-)");
        }
    }
}
