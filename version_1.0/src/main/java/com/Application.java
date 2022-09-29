package com;

import com.questions.Question;

import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean newGame = true;
        while (newGame) {
            ScoreCounter scoreCounter = new ScoreCounter();
            GameLogic gameLogic = new GameLogic(scoreCounter);
            //dialog
            String answerCorrectScore;
            System.out.println("Gra w 10gr to narzędzie pomagające ustalić siłę Prośby lub Odmowy.");
            System.out.println("Wybierz ścieżkę gry i odpowiedz na serię 10 pytań.");
            System.out.println("Za każdą odpowiedź otrzymasz 0 lub 10 gr.");
            System.out.println("Suma groszy zostanie porównana z tabelą i wynik będzie wskazówką jak dobrać komunikat do danej sytuacji.");
            System.out.println("/-----------------------------------------/");
            //Wybór ścieżki
            System.out.println("Wpisz P jeśli pytasz lub O jeśli Odmawiasz");
            String path = "";
            boolean run = true;
            while (run) {
                path = scanner.nextLine();
                List<String> correctAnswers = List.of("P", "O");
                if (correctAnswers.contains(path)) {
                    run = false;
                } else {
                    System.out.println("Spróbuj jeszcze raz. Wpisz P jeśli pytasz lub O jeśli Odmawiasz");
                }
            }
            Question firstQuestionFromPath = gameLogic.selectPath(path);
            System.out.println(firstQuestionFromPath);
            //pętla do przeprowadzenia pytań
            //ścieżka pytania
            if (path.equals("P")) {
                if (gameLogic.getQuestionsAsk().size() > 1) {
                    do {
                        handleGetAnswerToAsk(scanner, gameLogic);
                        System.out.println(gameLogic.getAsk()); // weź następne pytanie
                    }
                    while (gameLogic.getQuestionsAsk().size() > 1);
                }
                //Ostatnie pytanie
                if (gameLogic.getQuestionsAsk().size() == 1) {
                    handleGetAnswerToAsk(scanner, gameLogic);
                }
                //ścieżka odpowiedzi
            } else if (path.equals("O")) {
                if (gameLogic.getQuestionsRefuse().size() > 1) {
                    do {
                        //extract method
                        handleGetAnswerToRefuse(scanner, gameLogic);
                        System.out.println(gameLogic.getRefuse());
                    }
                    while (gameLogic.getQuestionsRefuse().size() > 1);
                }
                if (gameLogic.getQuestionsRefuse().size() == 1) {
                    handleGetAnswerToRefuse(scanner, gameLogic);
                }
            }
            System.out.println("/-----------------------------------------/");
            System.out.println("Otrzymałeś " + scoreCounter.getSum() + "gr");
            if (path.equals("P")) {
                System.out.println(gameLogic.getAnswerAsk());
            } else {
                System.out.println(gameLogic.getAnswerRefuse());
            }
            System.out.println("/-----------------------------------------/");
            System.out.println("Skonsultuj wynik z zaufaną osobą.");
            System.out.println("Czy po konsultacji chcesz poprawić wynik?");
            System.out.println("Poprawa wyniku to uruchomienie gry ponownie");
            System.out.println("Wpisz T jeśli Tak");
            answerCorrectScore = scanner.nextLine();
            List<String> correctAnswersScore = List.of("T");
            if (!correctAnswersScore.contains(answerCorrectScore)) {
                newGame = false;
            } else {
                System.out.println("Gramy ponownie");
                System.out.println("/-----------------------------------------/");
            }
        }
        System.out.println("Powodzenia");

    }

    private static void handleGetAnswerToRefuse(Scanner scanner, GameLogic gameLogic) {
        try {
            String answer = scanner.nextLine();
            gameLogic.getAnswerToRefuse(answer);
        } catch (Exception exception) {
            System.out.println("Zła odpowiedź, spróbuj ponownie. Wpisz T lub N.");
        }
    }

    private static void handleGetAnswerToAsk(Scanner scanner, GameLogic gameLogic) {
        try {
            String answer = scanner.nextLine();
            gameLogic.getAnswerToAsk(answer); //odp na pierwsze pytanie
        } catch (Exception exception) {
            System.out.println("Zła odpowiedź, spróbuj ponownie. Wpisz T lub N.");
        }
    }


}

