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
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        gameLogic.selectPath(path);
        String answer1 = scanner.nextLine();
        gameLogic.getAnswerToAsk(answer1);
    }
}
