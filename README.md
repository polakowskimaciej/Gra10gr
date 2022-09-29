# Gra w dziesięciogroszówki
Projekt powstał w ramach budowania portfolio do prezentacji umiejętności testera automatyzującego.
Projekt nie powstał w ramach kursu, to własna inicjatywa odpowiadająca na potrzebę wykorzystania umiejętności w niezależnym projekcie.
## Table of Contents
* [General Info](#general-information)
* [Technologies Used](#technologies-used)
* [Structure](#structure)
* [Project Status](#project-status)
* [Acknowledgements](#acknowledgements)
* [Contact](#contact)

## General Information
Projekt to przeniesienie narzędzia z zakresu skuteczności interpersonalnej z publikacji Marsha M. Linehan 2015 "Terapia dialektyczno-behawioralna (DBT). Trening umiejętności. Materiały i ćwiczenia dla pacjentów".
Narzędzie jest wykorzystywane jako autoinstrukcja przy decyzji z jakim natężeniem prosić lub odmawiać.

## Technologies Used
- IDE - InteliJ IDEA Community Edition
- Junit test framework


## Structure

- Klasa Application zawiera aplikację gry;
- Klasa GameLogic zawiera logikę gry tzn. wybór ścieżki, tworzy listy pytań, gettery odpowiedzi dodające punkty;
- Klasa ScoreCounter służy do zbierania i obsługi przekazywanych przez klasy pytań punktów na podstawie przekazanych odpowiedzi i zwracania wyników zależnie od sumy punktów;
- Pakiet questions zawiera klasy pytań podzielone na dwie ścieżki gry i Interfejs Pytań;
- W każdej z Klas pytań jest getter przekładający odpowiedź na ilość punktów; 
- Pakiet answers zawiera Enum'y z z których korzysta ScoreCounter
- Są dwie klasy testowe, do Game Logic i ScoreCounter

## Project Status
Chciałbym w przyszłości zrobić aplikację projektu w przeglądarce i napisać interpretację kolejnych podobnych narzędzi.

## Acknowledgements
- Dziękuję Szymon Gąsienica-Kotelnicki za wsparcie mentorskie 


## Contact
Created by [@MaciejPolakowski](https://www.linkedin.com/in/maciejpolakowski92/) 