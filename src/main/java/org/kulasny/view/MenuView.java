package org.kulasny.view;

import org.kulasny.domain.exercise.Exercise1;
import org.kulasny.domain.exercise.Exercise2;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MenuView {

    public void showMenu(){
        System.out.println("""
                1. Wyświetl zestawienie z plików Dostawcy, MagazynP oraz Slownik
                2. Wyświetl zestawienie z plików Dostawcy, MagazynW oraz Slownik
                3. Podaj sumę mas wybranego kodu dla podanej skróconej nazwy klienta dla magazynuP z uwzględnieniem zmiennej firma
                4. Podaj sumę mas wybranego kodu dla podanej skróconej nazwy klienta dla magazynuW z uwzględnieniem zmiennej firma
                0. Wyjdź

                """);
    }

    public Integer inputOption(){
        System.out.println("Podaj numer opcji: ");
        Integer result = new Scanner(System.in).nextInt();
        System.out.println("\n\n");
        return result;
    }

    public void showMenuExerciseSummary(){
        System.out.println("""
                Zestawienia domyślnie są posortowane wg. zmiennej Nr_karty (rosnąco)

                5. Posortuj zestawienie wg. zmiennej Nr_karty
                6. Posortuj zestawienie wg. zmiennej Kod
                7. Posortuj zestawienie wg. zmiennej Firma
                0. Wyjdź

                """);
    }

    public void showMenuSorting(){
        System.out.println("""
                8. Sortuj rosnąco (domyślnie)
                9. Sortuj malejąco
                0. Wyjdź

                """);
    }

    public void showSuma(Map<Integer, Map<String,Double>> sumaMap, String nazwa){
        System.out.println("Dla firmy:" + nazwa);
        sumaMap.forEach((k,v) ->{
            System.out.println("Dla zmiennej firma:" + k + "\n");
            v.forEach((m,n)->{
                System.out.println("Dla kodu " + m + " suma mas wynosi: " + n);
            });
            System.out.println("\n");
        });
    }

    public void showListExercise1(List<Exercise1> exercise1List){
        System.out.println("Nr_Karty | DataD | Kod | Masa | Jedn | Firma | Typ | Nazwa_Skrocona | Nr_Mag | Opis");
        exercise1List.forEach(System.out::println);
        System.out.println("\n\n");
    }

    public void showListExercise2(List<Exercise2> exercise2List){
        System.out.println("Nr_Karty | DataW | Kod | Masa | Firma | Typ | Nazwa_Skrocona | Opis");
        exercise2List.forEach(System.out::println);
        System.out.println("\n\n");
    }

}
