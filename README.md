# pojo-csv-zpo
Projekt z przedmiotu "Zaawansowane Programowanie Obiektowe"

## 1.Klasy:
* Config - Importuje dane z plik�w csv oraz zwraca listy
* Dostawcy, MagazynP, MagazynW, Slownik - reprezentuj� dane
* Exercise1, Exercise2 - Reprezentuj� dane w postaci finalnej dla ka�dego zadania
* Exercise1Repository, Exercise2Repository - S� to interfejsy imituj�ce zapytania do bazy danych
* Exercise1RepositoryImpl, Exercise2RepositoryImpl - S� to implementacje powy�szych interfejs�w
* SortOrder - Enum odpowiedzialny za okre�lenie w jaki spos�b sortujemy dane
* Exercise1Service, Exercise2Service - S� to interfejsy odpowiedzialne za realizacje zada� na zbiorze danych
* Exercise1ServiceImpl, Exercise2Service - S� to implementacje powy�szych interfejs�w
* MenuOption - Enum odpowiedzialny za wyb�r opcji w menu
* MenuView - Klasa widoku odpowiedzialna za wy�wietlenie danych

## 2. Nowe Dane:
* W pliku Magazynw.csv brakowa�o jednej kolumny z tego powodu do��czy�em j� na podstawie danych z pliku magazynp.csv
* Stworzy�em rozk�ad prawdopodobie�stwa dla kolumny nr_odpadu oraz wed�ug niego wylosowa�em numery odpad�w dla ca�ego zbioru
