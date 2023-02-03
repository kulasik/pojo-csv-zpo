package org.kulasny.domain.exercise;

public class NrKartyW{
    private final Integer year;
    private final String firma;

    private final Integer catalogueNumber;

    public NrKartyW(String nrKarty) {
        String[] data = nrKarty.split("/");
        this.year = Integer.parseInt(data[2]);
        this.firma = data[1];
        this.catalogueNumber = Integer.parseInt(data[0]);
    }

    public Integer getYear() {
        return year;
    }

    public Integer getFirma() {
        return Integer.parseInt(firma.replaceAll("W",""));
    }

    public Integer getCatalogueNumber() {
        return catalogueNumber;
    }

    @Override
    public String toString() {
        return year.toString() + "/" + firma + "/" + catalogueNumber.toString();
    }
}
