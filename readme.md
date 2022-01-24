Laboratorium 10
Celem ćwiczenia jest skorzystanie ze Spring Boot oraz napisanie i przetestowanie aplikacji wypisującej bieżącą datę w różnych formatach.
Wymagania
1. Aplikacja ma być stworzona z użyciem Spring Boot
2. Aplikacja ma wypisać na ekran bieżącą datę w formacie ”Current
   date is <formatted-current-date-time>” gdzie <formatted-currerntdate-time> to obecny czas
3. Napis do wypisania na ekran powinien być zwracany przez CurrentDateTimeService. Serwis ten powinien pobierać bieżącą datę z odpowiedniego serwisu.
4. Serwisy udostępniającę bieżącą datę mają implementować interfejs
   CurrentDateTimeProvider posiadający jedną metodę publiczną String
   currentDateTime()
5. CurrentDateTimeService powinien przyjmować CurrentDateTimeProvider jako argument swojego konstruktora
6. Serwis HumanReadableDateTimeProvider ma zwracać czas w formacie d L yyyy HH:mm:ss gdzie L to skrócona nazwa miesiąca w języku
   angielskim, np. 7 Feb 2022 12:23:34
7. Serwis IsoDateTimeProvider powinien zwracać datę w formacie yyyyMM-ddTHH:mm:ss np. 2022-02-07T12:23:34
8. W danym momencie aplikacja powinna korzystać jedynie z jednego
   mechanizmy zwracania czasu i mechanizm ten powinien być konfigurowany za pomocą dependency injection w Springu
9. Należy napisać z użyciem JUnit testy sprawdzające poprawność działania CurrentDateTimeService
10. Ponieważ implementacje CurrentDateTimeProvider przy każdym uruchomieniu zwracają inny ciąg znaków (ponieważ zwracają bieżący czas
    który się zmienia) ciężko jest napisać deterministyczne testy CurrentDateTimeService wypisującego czas na podstawie wartości zwróconej
    przez CurrentDateTimeProvider
11. Aby móc przetestować CurrentDateTimeService na potrzeby testów
    powinien on otrzymywać jako argumenty swojego konstruktora nie rzeczywiste obiekty CurrentDateTimeProvider ale ich mocki, zwracające
    zadane przez nas wartości
12. Do stworzenia mocków należy zastosować bibliotekę Mockito (po uprzednim zaznajomieniu się z tematyką mocków i biblioteki mockito)
    1
    Oddawanie zadania:
1. Zadanie należy oddać do 25. stycznia 2022 do godziny 23:00
2. Zadanie należy przedstawić na zajęciach 19. stycznia lub 26. stycznia
3. Warunkiem oceny zadania jest jego wcześniejsze oddanie na platformie
   delta
4. Zadanie należy oddawać jako archiwum .zip. Archiwum powinno zawierać cały projekt.
5. Podczas oddawania zadania należy je ściągnąć z platformy delta, rozpakować, zaimportować do IDE i uruchomić.
6. Z zadania można uzyskać maksymalnie 6 punktów.