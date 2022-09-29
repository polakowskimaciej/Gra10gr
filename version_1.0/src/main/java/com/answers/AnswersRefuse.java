package com.answers;

public enum AnswersRefuse {
    Answer1("Zrób to, czego chce druga osoba, bez proszenia"),
    Answer2("Nie narzekaj, zrób to ochoczo"),
    Answer3("Zrób to pomimo braku ochoty"),
    Answer4("Zrób to, ale okazuj niechęć"),
    Answer5("Powiedz, że raczej nie, ale w sposób uprzejmy"),
    Answer6("Odmów pewnie, ale z możliwością ponownego rozpatrzenia prośby"),
    Answer7("Odmów pewnie, sprzeciwiaj się przed powiedzeniem 'tak'"),
    Answer8("Zdecydowanie odmów sprzeciwiaj się przed powiedzeniem 'tak'"),
    Answer9("Zdecydowanie, opieraj się, negocjuj"),
    Answer10("Nie rób tego");
    public String answer;

    AnswersRefuse(String answer) {
        this.answer = answer;
    }

    public String getAnswer() {
        return answer;
    }
}
