package org.kulasny.repository.exercise2;

import org.kulasny.domain.exercise.Exercise2;
import org.kulasny.repository.SortOrder;

import java.util.List;

public interface Exercise2Repository {

    List<Exercise2> getExercise2List();

    List<Exercise2> findByNazwaSkrocona(String nazwaSkrocona);

    List<Exercise2> sortByNrKarty(SortOrder order);

    List<Exercise2> sortByKod(SortOrder order);

    List<Exercise2> sortByFirma(SortOrder order);

}
