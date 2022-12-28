package org.kulasny.repository.exercise1;

import org.kulasny.domain.exercise.Exercise1;
import org.kulasny.repository.SortOrder;

import java.util.List;

public interface Exercise1Repository {

    List<Exercise1> getExercise1List();

    List<Exercise1> findByNazwaSkrocona(String nazwaSkrocona);

    List<Exercise1> sortByNrKarty(SortOrder order);

    List<Exercise1> sortByKod(SortOrder order);

    List<Exercise1> sortByFirma(SortOrder order);

}
