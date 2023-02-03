package org.kulasny.repository.exercise1;

import org.kulasny.domain.exercise.Exercise1;
import org.kulasny.domain.exercise.Exercise1NrKartyComparator;
import org.kulasny.repository.SortOrder;

import java.util.Comparator;
import java.util.List;

public class Exercise1RepositoryImpl implements Exercise1Repository {
    final private List<Exercise1> exercise1List;
    final private Comparator<Exercise1> nrKartyComparatorEx1 = new Exercise1NrKartyComparator();

    public Exercise1RepositoryImpl(List<Exercise1> exercise1List) {
        this.exercise1List = exercise1List;
    }
    @Override
    public List<Exercise1> getExercise1List(){
        return exercise1List;
    }

    @Override
    public List<Exercise1> findByNazwaSkrocona(String nazwaSkrocona) {
        return exercise1List.stream().filter(n-> nazwaSkrocona.equalsIgnoreCase(n.getNazwaSkrocona())).toList();
    }


    @Override
    public List<Exercise1> sortByNrKarty(SortOrder order){
        if(order == SortOrder.ASCENDING){
            return exercise1List.stream().sorted(nrKartyComparatorEx1).toList();
        }else {
            return exercise1List.stream().sorted(nrKartyComparatorEx1.reversed()).toList();
        }
    }

    @Override
    public List<Exercise1> sortByKod(SortOrder order){
        if(order == SortOrder.ASCENDING){
            return exercise1List.stream().sorted(Comparator.comparingInt(Exercise1::getKodInt)).toList();
        }else {
            return exercise1List.stream().sorted(Comparator.comparingInt(Exercise1::getKodInt).reversed()).toList();
        }
    }

    @Override
    public List<Exercise1> sortByFirma(SortOrder order){
        if(order == SortOrder.ASCENDING){
            return exercise1List.stream().sorted(Comparator.comparingInt(Exercise1::getFirma)).toList();
        }else {
            return exercise1List.stream().sorted(Comparator.comparingInt(Exercise1::getFirma).reversed()).toList();
        }
    }

}
