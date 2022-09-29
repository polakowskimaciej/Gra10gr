package com;

import com.questions.Question;

import java.util.List;
import java.util.Scanner;

//w CV podać link, gdzie zrobiłem gra -> readme, opisać w redme gdzie co jest, TO NIE JEST w ramach kursu, wszystie info; Co, jak, gdzie, dlaczego - markdown - dać linki główna klasa -/ wchodzę na gita i dostaję radme i to ma opisać o czym jest projekt.
public class Application {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean newGame = true;
        while (newGame) {
            GameLogic gameLogic = new GameLogic();
            ScoreCounter scoreCounter = new ScoreCounter();
            scoreCounter.clearScoresList();
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
                        try {
                            String answer = scanner.nextLine();
                            gameLogic.getAnswerToAsk(answer); //odp na pierwsze pytanie
                        } catch (Exception exception) {
                            System.out.println("Zła odpowiedź, spróbuj ponownie. Wpisz T lub N.");
                        }
                        System.out.println(gameLogic.getAsk()); // weź następne pytanie
                    }
                    while (gameLogic.getQuestionsAsk().size() > 1);
                }
                //Ostatnie pytanie
                if (gameLogic.getQuestionsAsk().size() == 1) {
                    try {
                        String answer = scanner.nextLine();
                        gameLogic.getAnswerToAsk(answer);
                    } catch (Exception exception) {
                        System.out.println("Zła odpowiedź, spróbuj ponownie. Wpisz T lub N.");
                    }
                }
                //ścieżka odpowiedzi
            } else if (path.equals("O")) {
                if (gameLogic.getQuestionsRefuse().size() > 1) {
                    do {
                        try {
                            String answer = scanner.nextLine();
                            gameLogic.getAnswerToRefuse(answer);
                        } catch (Exception exception) {
                            System.out.println("Zła odpowiedź, spróbuj ponownie. Wpisz T lub N.");
                        }
                        System.out.println(gameLogic.getRefuse());
                    }
                    while (gameLogic.getQuestionsRefuse().size() > 1);
                }
                if (gameLogic.getQuestionsRefuse().size() == 1) {
                    try {
                        String answer = scanner.nextLine();
                        gameLogic.getAnswerToRefuse(answer);
                    } catch (Exception exception) {
                        System.out.println("Zła odpowiedź, spróbuj ponownie. Wpisz T lub N.");
                    }
                }
            }
            System.out.println("/-----------------------------------------/");
            System.out.println("Otrzymałeś " + scoreCounter.getSum() + "gr");
            if (path.equals("P")) {
                System.out.println(scoreCounter.checkScoreAsk());
            } else {
                System.out.println(scoreCounter.checkScoreRefuse());
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


}

