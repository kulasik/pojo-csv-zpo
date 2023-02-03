package org.kulasny.domain.exercise;

import java.util.Arrays;

public class NrKartyP {
    private final Integer year;
    private final Integer firma;
    private final Integer catalogueNumber;

    public NrKartyP(String nrKarty) {
        int[] data = Arrays.stream((nrKarty.split("/"))).mapToInt(Integer::parseInt).toArray();
        this.year = data[2];
        this.firma = data[1];
        this.catalogueNumber = data[0];
    }

    public Integer getYear() {
        return year;
    }

    public Integer getFirma() {
        return firma;
    }

    public Integer getCatalogueNumber() {
        return catalogueNumber;
    }

    @Override
    public String toString() {
        return year.toString() + "/" + firma.toString() + "/" + catalogueNumber.toString();
    }
}
