package com.questions;

import com.GameLogic;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameLogicTest {
GameLogic gameLogic = new GameLogic();
    @Test
    void gameTestAsk() {
        //given - ścieżka ask
        gameLogic.selectPath("P");
        //when - przechodzę przez pytania i daję tu odp
        gameLogic.getAnswerToAsk("T");
        gameLogic.getAnswerToAsk("T");
        gameLogic.getAnswerToAsk("T");
        gameLogic.getAnswerToAsk("T");
        gameLogic.getAnswerToAsk("T");
        gameLogic.getAnswerToAsk("T");
        gameLogic.getAnswerToAsk("T");
        gameLogic.getAnswerToAsk("T");
        gameLogic.getAnswerToAsk("T");
        gameLogic.getAnswerToAsk("T");
        //then - wynik się zgadza
        assertEquals(100, gameLogic.getSum());
    }
    @Test
    void gameTestRefuse() {
        gameLogic.selectPath("O");
        gameLogic.getAnswerToRefuse("T");
        gameLogic.getAnswerToRefuse("N");
        gameLogic.getAnswerToRefuse("T");
        gameLogic.getAnswerToRefuse("N");
        gameLogic.getAnswerToRefuse("T");
        gameLogic.getAnswerToRefuse("N");
        gameLogic.getAnswerToRefuse("T");
        gameLogic.getAnswerToRefuse("N");
        gameLogic.getAnswerToRefuse("T");
        gameLogic.getAnswerToRefuse("N");
        assertEquals(50,gameLogic.getSum());
    }
}