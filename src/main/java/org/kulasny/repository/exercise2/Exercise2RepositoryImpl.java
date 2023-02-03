package org.kulasny.repository.exercise2;

import org.kulasny.domain.exercise.Exercise2;
import org.kulasny.domain.exercise.Exercise2NrKartyComparator;
import org.kulasny.repository.SortOrder;

import java.util.Comparator;
import java.util.List;

public class Exercise2RepositoryImpl implements Exercise2Repository {
    final private List<Exercise2> exercise2List;
    final private Comparator<Exercise2> nrKartyComparatorEx2 = new Exercise2NrKartyComparator();

    public Exercise2RepositoryImpl(List<Exercise2> exercise2List) {
        this.exercise2List = exercise2List;
    }

    @Override
    public List<Exercise2> getExercise2List(){
        return exercise2List;
    }

    @Override
    public List<Exercise2> findByNazwaSkrocona(String nazwaSkrocona) {
        return exercise2List.stream().filter(n-> nazwaSkrocona.equalsIgnoreCase(n.getNazwaSkrocona())).toList();
    }


    @Override
    public List<Exercise2> sortByNrKarty(SortOrder order){
        if(order == SortOrder.ASCENDING){
            return exercise2List.stream().sorted(nrKartyComparatorEx2).toList();
        }else {
            return exercise2List.stream().sorted(nrKartyComparatorEx2.reversed()).toList();
        }
    }

    @Override
    public List<Exercise2> sortByKod(SortOrder order){
        if(order == SortOrder.ASCENDING){
            return exercise2List.stream().sorted(Comparator.comparingInt(Exercise2::getKodInt)).toList();
        }else {
            return exercise2List.stream().sorted(Comparator.comparingInt(Exercise2::getKodInt).reversed()).toList();
        }
    }

    @Override
    public List<Exercise2> sortByFirma(SortOrder order){
        if(order == SortOrder.ASCENDING){
            return exercise2List.stream().sorted(Comparator.comparingInt(Exercise2::getFirma)).toList();
        }else {
            return exercise2List.stream().sorted(Comparator.comparingInt(Exercise2::getFirma).reversed()).toList();
        }
    }

}
