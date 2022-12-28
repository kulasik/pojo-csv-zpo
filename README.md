# pojo-csv-zpo
Projekt z przedmiotu "Zaawansowane Programowanie Obiektowe"

## 1.Klasy:
* Config - Importuje dane z plików csv oraz zwraca listy
* Dostawcy, MagazynP, MagazynW, Slownik - reprezentuj¹ dane
* Exercise1, Exercise2 - Reprezentuj¹ dane w postaci finalnej dla ka¿dego zadania
* Exercise1Repository, Exercise2Repository - S¹ to interfejsy imituj¹ce zapytania do bazy danych
* Exercise1RepositoryImpl, Exercise2RepositoryImpl - S¹ to implementacje powy¿szych interfejsów
* SortOrder - Enum odpowiedzialny za okreœlenie w jaki sposób sortujemy dane
* Exercise1Service, Exercise2Service - S¹ to interfejsy odpowiedzialne za realizacje zadañ na zbiorze danych
* Exercise1ServiceImpl, Exercise2Service - S¹ to implementacje powy¿szych interfejsów
* MenuOption - Enum odpowiedzialny za wybór opcji w menu
* MenuView - Klasa widoku odpowiedzialna za wyœwietlenie danych

## 2. Nowe Dane:
* W pliku Magazynw.csv brakowa³o jednej kolumny z tego powodu do³¹czy³em j¹ na podstawie danych z pliku magazynp.csv
* Stworzy³em rozk³ad prawdopodobieñstwa dla kolumny nr_odpadu oraz wed³ug niego wylosowa³em numery odpadów dla ca³ego zbioru
