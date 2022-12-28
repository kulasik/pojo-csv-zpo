package org.kulasny.service.exercise1;

import org.kulasny.domain.exercise.Exercise1;
import org.kulasny.repository.SortOrder;
import org.kulasny.repository.exercise1.Exercise1Repository;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercise1ServiceImpl implements Exercise1Service{

    final private Exercise1Repository exercise1Repository;

    public Exercise1ServiceImpl(Exercise1Repository exercise1Repository) {
        this.exercise1Repository = exercise1Repository;
    }

    @Override
    public List<Exercise1> listSortedByDefault() {
        return exercise1Repository.getExercise1List();
    }

    @Override
    public List<Exercise1> listSortedByNrKarty(SortOrder order) {
        return exercise1Repository.sortByNrKarty(order);
    }

    @Override
    public List<Exercise1> listSortedByKod(SortOrder order) {
        return exercise1Repository.sortByKod(order);
    }

    @Override
    public List<Exercise1> listSortedByFirma(SortOrder order) {
        return exercise1Repository.sortByFirma(order);
    }

    @Override
    public Map<Integer, Map<String, Double>> listSumOfMasaGroupedByNazwaSkroconaAndFirmaAndKod(String nazwaSkrocona) {
        List<Exercise1> list = exercise1Repository
                .findByNazwaSkrocona(nazwaSkrocona);

        return list
                .stream()
                .collect(Collectors.groupingBy(Exercise1::getFirma,
                        Collectors.groupingBy(Exercise1::getKod,
                                Collectors.summingDouble(Exercise1::getMasa))));

    }
}
