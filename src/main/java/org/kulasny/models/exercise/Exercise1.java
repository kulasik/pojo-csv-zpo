package org.kulasny.models.exercise;

import java.util.Comparator;
import java.util.GregorianCalendar;
import java.util.List;

public class Exercise1 {

    public  enum SortOrder{
        ASCENDING,
        DESCENDING
    }
    final String nrKarty;
    final GregorianCalendar dataD;
    final Integer kod;
    final Double masa;
    final String jedn;
    final Integer firma;
    final String typ;
    final String nazwaSkrocona;
    final Integer nrMag;
    final String opis;

    public Exercise1(String nrKarty,
                     GregorianCalendar dataD,
                     Integer kod,
                     Double masa,
                     String jedn,
                     Integer firma,
                     String typ,
                     String nazwaSkrocona,
                     Integer nrMag,
                     String opis) {
        this.nrKarty = nrKarty;
        this.dataD = dataD;
        this.kod = kod;
        this.masa = masa;
        this.jedn = jedn;
        this.firma = firma;
        this.typ = typ;
        this.nazwaSkrocona = nazwaSkrocona;
        this.nrMag = nrMag;
        this.opis = opis;
    }

    public String getNrKarty() {
        return nrKarty;
    }

    public GregorianCalendar getDataD() {
        return dataD;
    }

    public Integer getKod() {
        return kod;
    }

    public Double getMasa() {
        return masa;
    }

    public String getJedn() {
        return jedn;
    }

    public Integer getFirma() {
        return firma;
    }

    public String getTyp() {
        return typ;
    }

    public String getNazwaSkrocona() {
        return nazwaSkrocona;
    }

    public Integer getNrMag() {
        return nrMag;
    }

    public String getOpis() {
        return opis;
    }

    public static List<Exercise1> sortByNrKarty(List<Exercise1> exercise1List){
        return sortByNrKarty(exercise1List, SortOrder.ASCENDING);
    }

    public static List<Exercise1> sortByNrKarty(List<Exercise1> exercise1List, SortOrder order){
        if(order == SortOrder.ASCENDING){
            return exercise1List.stream().sorted(Comparator.comparing(Exercise1::getNrKarty)).toList();
        }else {
            return exercise1List.stream().sorted(Comparator.comparing(Exercise1::getNrKarty).reversed()).toList();
        }
    }

    public static List<Exercise1> sortByKod(List<Exercise1> exercise1List){
        return sortByKod(exercise1List, SortOrder.ASCENDING);
    }

    public static List<Exercise1> sortByKod(List<Exercise1> exercise1List, SortOrder order){
        if(order == SortOrder.ASCENDING){
            return exercise1List.stream().sorted(Comparator.comparing(Exercise1::getKod)).toList();
        }else {
            return exercise1List.stream().sorted(Comparator.comparing(Exercise1::getKod).reversed()).toList();
        }
    }

    public static List<Exercise1> sortByFirma(List<Exercise1> exercise1List){
        return sortByFirma(exercise1List, SortOrder.ASCENDING);
    }

    public static List<Exercise1> sortByFirma(List<Exercise1> exercise1List, SortOrder order){
        if(order == SortOrder.ASCENDING){
            return exercise1List.stream().sorted(Comparator.comparing(Exercise1::getFirma)).toList();
        }else {
            return exercise1List.stream().sorted(Comparator.comparing(Exercise1::getFirma).reversed()).toList();
        }
    }
}
