package org.kulasny.repository;

import org.kulasny.view.MenuOption;

public enum SortOrder{
    ASCENDING,
    DESCENDING;

    public static SortOrder valueOf(MenuOption menuOption){
        return switch (menuOption){
            case SortDescending -> DESCENDING;
            default -> ASCENDING;
        };
    }
}