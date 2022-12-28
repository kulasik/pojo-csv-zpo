package org.kulasny.view;

public enum MenuOption {
    ShowExercise1,
    ShowExercise2,
    ShowSum1,
    ShowSum2,
    SortByNrKarty,
    SortByKod,
    SortByFirma,
    SortAscending,
    SortDescending,
    Exit,
    Error,
    Empty;

    public static MenuOption valueOf(int option){
        return switch (option){
            case -1 -> Empty;
            case 1 -> ShowExercise1;
            case 2 -> ShowExercise2;
            case 3 -> ShowSum1;
            case 4 -> ShowSum2;
            case 5 -> SortByNrKarty;
            case 6 -> SortByKod;
            case 7 -> SortByFirma;
            case 8 -> SortAscending;
            case 9 -> SortDescending;
            case 0 -> Exit;
            default -> Error;
        };
    }
}
