package org.kulasny.domain.exercise;

import java.util.Comparator;

public class Exercise1NrKartyComparator implements Comparator<Exercise1> {
    @Override
    public int compare(Exercise1 o1, Exercise1 o2) {
        if (!o1.getNrKarty().getYear().equals(o2.getNrKarty().getYear())){
            return Integer.compare(o1.getNrKarty().getYear(),
                    o2.getNrKarty().getYear());
        }else if(!o1.getNrKarty().getFirma().equals(o2.getNrKarty().getFirma())){
            return Integer.compare(o1.getNrKarty().getFirma(),
                    o2.getNrKarty().getFirma());
        }else{
            return Integer.compare(o1.getNrKarty().getCatalogueNumber(),
                    o2.getNrKarty().getCatalogueNumber());
        }
    }

    @Override
    public Comparator<Exercise1> reversed() {
        return Comparator.super.reversed();
    }
}
