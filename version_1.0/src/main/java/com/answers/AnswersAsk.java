package com.answers;

public enum AnswersAsk {
    Answer1("Nie proś, nie sugeruj"),
    Answer2("Pośrednio sugeruj, akceptuj odmowę"),
    Answer3("Otwarcie sugeruj, akceptuj odmowę"),
    Answer4("Nieśmiało proś, akceptuj odmowę"),
    Answer5("Uprzejmie proś, ale akceptuj odmowę"),
    Answer6("Pewnie proś, akceptuj odmowę"),
    Answer7("Pewnie proś, sprzeciwiaj się odmowie"),
    Answer8("Stanowczo proś, sprzeciwiaj się odmowie"),
    Answer9("Stanowczo proś, nalegaj, negocjuj, ponawiaj prośby"),
    Answer10("Proś i nie akceptuj odmowy");
    public String answer;

    AnswersAsk(String answer) {
        this.answer = answer;
    }

    public String getAnswer() {
        return answer;
    }

}
