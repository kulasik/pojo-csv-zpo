package org.kulasny.service.exercise2;

import org.kulasny.domain.exercise.Exercise2;
import org.kulasny.repository.SortOrder;

import java.util.List;
import java.util.Map;

public interface Exercise2Service {

    List<Exercise2> listSortedByDefault();

    List<Exercise2> listSortedByNrKarty(SortOrder order);

    List<Exercise2> listSortedByKod(SortOrder order);

    List<Exercise2> listSortedByFirma(SortOrder order);

    Map<Integer, Map<String,Double>> listSumOfMasaGroupedByNazwaSkroconaAndFirmaAndKod(String nazwaSkrocona);
}
