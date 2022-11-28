package com;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class ScoreCounterTest {
    ScoreCounter scoreCounter = new ScoreCounter();


    @BeforeEach
    void setScoreCounter() {
        scoreCounter.clearScoresList();
    }

    @ParameterizedTest
    @CsvSource(value = {"0:Nie proś, nie sugeruj",
            "10:Nie proś, nie sugeruj",
            "20:Pośrednio sugeruj, akceptuj odmowę",
            "30:Otwarcie sugeruj, akceptuj odmowę",
            "40:Nieśmiało proś, akceptuj odmowę",
            "50:Uprzejmie proś, ale akceptuj odmowę",
            "60:Pewnie proś, akceptuj odmowę",
            "70:Pewnie proś, sprzeciwiaj się odmowie",
            "80:Stanowczo proś, sprzeciwiaj się odmowie",
            "90:Stanowczo proś, nalegaj, negocjuj, ponawiaj prośby",
            "100:Proś i nie akceptuj odmowy"}, delimiter = ':')
    void checkScoreAsk(int input, String expected) {
        //given
        scoreCounter.addScoreToList(input);
        //when
        //than
        assertEquals(expected, scoreCounter.checkScoreAsk());
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

    @ParameterizedTest
    @CsvSource(value = {"0:Zrób to, czego chce druga osoba, bez proszenia",
            "10:Zrób to, czego chce druga osoba, bez proszenia",
            "20:Nie narzekaj, zrób to ochoczo",
            "30:Zrób to pomimo braku ochoty",
            "40:Zrób to, ale okazuj niechęć",
            "50:Powiedz, że raczej nie, ale w sposób uprzejmy",
            "60:Odmów pewnie, ale z możliwością ponownego rozpatrzenia prośby",
            "70:Odmów pewnie, sprzeciwiaj się przed powiedzeniem 'tak'",
            "80:Zdecydowanie odmów sprzeciwiaj się przed powiedzeniem 'tak'",
            "90:Zdecydowanie, opieraj się, negocjuj",
            "100:Nie rób tego"
    }, delimiter = ':')
    void checkScoreRefuse(int input, String expected) {
        scoreCounter.addScoreToList(input);
        assertEquals(expected, scoreCounter.checkScoreRefuse());
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