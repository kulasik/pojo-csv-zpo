package org.kulasny.service.exercise1;

import org.kulasny.domain.exercise.Exercise1;
import org.kulasny.repository.SortOrder;

import java.util.List;
import java.util.Map;

public interface Exercise1Service {

    List<Exercise1> listSortedByDefault();

    List<Exercise1> listSortedByNrKarty(SortOrder order);

    List<Exercise1> listSortedByKod(SortOrder order);

    List<Exercise1> listSortedByFirma(SortOrder order);

    Map<Integer, Map<String,Double>> listSumOfMasaGroupedByNazwaSkroconaAndFirmaAndKod(String nazwaSkrocona);
}
