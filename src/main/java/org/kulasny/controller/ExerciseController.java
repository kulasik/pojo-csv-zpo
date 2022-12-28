package org.kulasny.controller;

import org.kulasny.config.Config;
import org.kulasny.domain.exercise.Exercise1;
import org.kulasny.domain.exercise.Exercise2;
import org.kulasny.repository.SortOrder;
import org.kulasny.repository.exercise1.Exercise1Repository;
import org.kulasny.repository.exercise1.Exercise1RepositoryImpl;
import org.kulasny.repository.exercise2.Exercise2Repository;
import org.kulasny.repository.exercise2.Exercise2RepositoryImpl;
import org.kulasny.service.exercise1.Exercise1Service;
import org.kulasny.service.exercise1.Exercise1ServiceImpl;
import org.kulasny.service.exercise2.Exercise2Service;
import org.kulasny.service.exercise2.Exercise2ServiceImpl;
import org.kulasny.view.MenuOption;
import org.kulasny.view.MenuView;

import java.util.List;
import java.util.Scanner;

public class ExerciseController {

    final private Config config = new Config();
    final private List<Exercise1> exercise1List = config.getExercise1List();
    final private List<Exercise2> exercise2List = config.getExercise2List();
    final private Exercise1Repository exercise1Repository = new Exercise1RepositoryImpl(exercise1List);
    final private Exercise2Repository exercise2Repository = new Exercise2RepositoryImpl(exercise2List);
    final private Exercise1Service exercise1Service = new Exercise1ServiceImpl(exercise1Repository);
    final private Exercise2Service exercise2Service = new Exercise2ServiceImpl(exercise2Repository);

    final private MenuView menuView = new MenuView();

    public void show(){
        MenuOption mainOption = MenuOption.Empty;
        MenuOption exerciseOption;
        MenuOption sortOption;

        while(mainOption != MenuOption.Exit){
            menuView.showMenu();
            mainOption = MenuOption.valueOf(menuView.inputOption());
            switch (mainOption){
                case ShowExercise1 -> {
                    menuView.showMenuExerciseSummary();
                    exerciseOption = MenuOption.valueOf(menuView.inputOption());
                    menuView.showMenuSorting();
                    sortOption = MenuOption.valueOf(menuView.inputOption());
                    switch (exerciseOption){
                        case SortByNrKarty -> {
                            menuView.showListExercise1(exercise1Service.listSortedByNrKarty(SortOrder.valueOf(sortOption)));
                        }
                        case SortByKod -> {
                            menuView.showListExercise1(exercise1Service.listSortedByKod(SortOrder.valueOf(sortOption)));
                        }
                        case SortByFirma -> {
                            menuView.showListExercise1(exercise1Service.listSortedByFirma(SortOrder.valueOf(sortOption)));
                        }
                        case Exit -> {
                        }
                        default -> {
                            System.out.println("Błędna odpowiedź");
                        }
                    }
                }
                case ShowExercise2 -> {
                    menuView.showMenuExerciseSummary();
                    exerciseOption = MenuOption.valueOf(menuView.inputOption());
                    menuView.showMenuSorting();
                    sortOption = MenuOption.valueOf(menuView.inputOption());
                    switch (exerciseOption){
                        case SortByNrKarty -> {
                            menuView.showListExercise2(exercise2Service.listSortedByNrKarty(SortOrder.valueOf(sortOption)));
                        }
                        case SortByKod -> {
                            menuView.showListExercise2(exercise2Service.listSortedByKod(SortOrder.valueOf(sortOption)));
                        }
                        case SortByFirma -> {
                            menuView.showListExercise2(exercise2Service.listSortedByFirma(SortOrder.valueOf(sortOption)));
                        }
                        case Exit -> {
                        }
                        default -> {
                            System.out.println("Błędna odpowiedź");
                        }
                    }
                }
                case ShowSum1 -> {
                    System.out.println("Podaj nazwę skróconą klienta:\n");
                    String nazwa = new Scanner(System.in).nextLine();
                    menuView.showSuma(exercise1Service.listSumOfMasaGroupedByNazwaSkroconaAndFirmaAndKod(nazwa),nazwa);
                }
                case ShowSum2 -> {
                    System.out.println("Podaj nazwę skróconą klienta:\n");
                    String nazwa = new Scanner(System.in).nextLine();
                    menuView.showSuma(exercise2Service.listSumOfMasaGroupedByNazwaSkroconaAndFirmaAndKod(nazwa),nazwa);

                }
                case Exit -> {
                }
                default -> {
                    System.out.println("Błędna odpowiedź");
                }
            }
        }
    }
}
