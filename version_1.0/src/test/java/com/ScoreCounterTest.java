package com;

import com.answers.AnswersAsk;
import com.answers.AnswersRefuse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class ScoreCounterTest {
    ScoreCounter scoreCounter = new ScoreCounter();


    @BeforeEach
    void setScoreCounter() {
        scoreCounter.clearScoresList();
    }

    @Test
    void checkScoreAsk() {
        //given
        scoreCounter.addScoreToList(50);
        //when
        //than
        assertEquals(AnswersAsk.Answer5.getAnswer(), scoreCounter.checkScoreAsk());
    }

    @Test
    void shouldReturnNullWrongValueAsk() {
        scoreCounter.addScoreToList(55);
        assertNull(scoreCounter.checkScoreAsk());
    }

    @Test
    void shouldReturnNullWrongValueRefuse() {
        scoreCounter.addScoreToList(105);
        assertNull(scoreCounter.checkScoreRefuse());
    }

    @Test
    void checkScoreRefuse() {
        scoreCounter.addScoreToList(40);
        assertEquals(AnswersRefuse.Answer4.getAnswer(), scoreCounter.checkScoreRefuse());
    }
    @Test
    void changeScoreTest() {
        //given
        scoreCounter.addScoreToList(10);
        scoreCounter.addScoreToList(0);
        //when
        scoreCounter.correctScore(0);
        //than
        assertEquals(0,scoreCounter.getSum());
    }
}