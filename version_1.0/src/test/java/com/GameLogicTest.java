package com;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameLogicTest {
    GameLogic gameLogic;
    ScoreCounter scoreCounter = new ScoreCounter();

    GameLogicTest() {
        gameLogic = new GameLogic(scoreCounter);
    }

    @BeforeEach
    void setGameLogic() {
        scoreCounter.clearScoresList();
    }

    @Test
    void gameTestAskSum() {
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
        //then - dostaję poprawną odpowiedź
        assertEquals(100, gameLogic.getSum());
    }
//dodatkowo sprawdź odpowiedź
    @Test
    void gameTestAskAnswer() {
        gameLogic.selectPath("P");
        //when - przechodzę przez pytania i daję tu odp
        gameLogic.getAnswerToAsk("T");
        gameLogic.getAnswerToAsk("T");
        gameLogic.getAnswerToAsk("T");
        gameLogic.getAnswerToAsk("T");
        gameLogic.getAnswerToAsk("T");
        gameLogic.getAnswerToAsk("N");
        gameLogic.getAnswerToAsk("T");
        gameLogic.getAnswerToAsk("T");
        gameLogic.getAnswerToAsk("T");
        gameLogic.getAnswerToAsk("T");
        //then - dostaję poprawną odpowiedź
        assertEquals("Stanowczo proś, nalegaj, negocjuj, ponawiaj prośby", gameLogic.getAnswerAsk());
    }

    @Test
    void gameTestRefuseSum() {
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
        assertEquals(50, gameLogic.getSum());
    }

    @Test
    void gameTestRefuseAnswer() {
        gameLogic.selectPath("O");
        gameLogic.getAnswerToRefuse("T");
        gameLogic.getAnswerToRefuse("N");
        gameLogic.getAnswerToRefuse("T");
        gameLogic.getAnswerToRefuse("N");
        gameLogic.getAnswerToRefuse("T");
        gameLogic.getAnswerToRefuse("N");
        gameLogic.getAnswerToRefuse("T");
        gameLogic.getAnswerToRefuse("N");
        gameLogic.getAnswerToRefuse("N");
        gameLogic.getAnswerToRefuse("N");
        assertEquals("Zrób to, ale okazuj niechęć", gameLogic.getAnswerRefuse());
    }
    @Test
    void shouldReturnNullIfWrongAnswer() {
        gameLogic.selectPath("P");
        assertThrows(NullPointerException.class, () -> gameLogic.getAnswerToAsk("xxx"));
    }

    @Test
    void shouldReturnNullIfWrongAnswerPath() {
        assertNull(gameLogic.selectPath("X"));
    }
}