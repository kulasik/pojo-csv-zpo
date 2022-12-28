package org.kulasny.service.exercise2;

import org.kulasny.domain.exercise.Exercise2;
import org.kulasny.repository.SortOrder;
import org.kulasny.repository.exercise2.Exercise2Repository;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercise2ServiceImpl implements Exercise2Service {

    final private Exercise2Repository exercise2Repository;

    public Exercise2ServiceImpl(Exercise2Repository exercise2Repository) {
        this.exercise2Repository = exercise2Repository;
    }

    @Override
    public List<Exercise2> listSortedByDefault() {
        return exercise2Repository.getExercise2List();
    }

    @Override
    public List<Exercise2> listSortedByNrKarty(SortOrder order) {
        return exercise2Repository.sortByNrKarty(order);
    }

    @Override
    public List<Exercise2> listSortedByKod(SortOrder order) {
        return exercise2Repository.sortByKod(order);
    }

    @Override
    public List<Exercise2> listSortedByFirma(SortOrder order) {
        return exercise2Repository.sortByFirma(order);
    }

    @Override
    public Map<Integer, Map<String, Double>> listSumOfMasaGroupedByNazwaSkroconaAndFirmaAndKod(String nazwaSkrocona) {
        List<Exercise2> list = exercise2Repository
                .findByNazwaSkrocona(nazwaSkrocona);

        return list
                .stream()
                .collect(Collectors.groupingBy(Exercise2::getFirma,
                        Collectors.groupingBy(Exercise2::getKod,
                                Collectors.summingDouble(Exercise2::getMasa))));

    }
}
