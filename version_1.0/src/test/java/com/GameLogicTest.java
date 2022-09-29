package com;

import com.GameLogic;
import com.ScoreCounter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameLogicTest {
    GameLogic gameLogic = new GameLogic();
    ScoreCounter scoreCounter = new ScoreCounter();

    @BeforeEach
    void setGameLogic() {
        scoreCounter.clearScoresList();
    }

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
        assertEquals(50, gameLogic.getSum());
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