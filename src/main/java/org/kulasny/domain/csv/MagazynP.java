package org.kulasny.domain.csv;

import java.util.Arrays;
import java.util.GregorianCalendar;

public class MagazynP {
    final String NrKarty;
    final GregorianCalendar DataD;
    final Double Masa;
    final String Jedn;
    final Integer Firma;
    final Integer NrMag;
    final Integer NrOdpadu;
    final Integer NrKlienta;

    public MagazynP(String nrKarty,
                    String dataD,
                    String masa,
                    String jedn,
                    String firma,
                    String nrMag,
                    String nrOdpadu,
                    String nrKlienta) {
        NrKarty = nrKarty;
        int[] data = Arrays.stream((dataD.split("\\."))).mapToInt(Integer::parseInt).toArray();
        DataD = new GregorianCalendar(data[2], data[1], data[0]);
        Masa = Double.valueOf(masa.replaceAll("\\W+",""));
        Jedn = jedn;
        Firma = Integer.valueOf(firma.replaceAll("\\W+",""));
        NrMag = Integer.valueOf(nrMag.replaceAll("\\W+",""));
        NrOdpadu = Integer.valueOf(nrOdpadu.replaceAll("\\W+",""));
        NrKlienta = Integer.valueOf(nrKlienta.replaceAll("\\W+",""));
    }

    public String getNrKarty() {
        return NrKarty;
    }

    public GregorianCalendar getDataD() {
        return DataD;
    }

    public Double getMasa() {
        return Masa;
    }

    public String getJedn() {
        return Jedn;
    }

    public Integer getFirma() {
        return Firma;
    }

    public Integer getNrMag() {
        return NrMag;
    }

    public Integer getNrOdpadu() {
        return NrOdpadu;
    }

    public Integer getNrKlienta() {
        return NrKlienta;
    }
}
