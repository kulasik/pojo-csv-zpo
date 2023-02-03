package org.kulasny.domain.csv;

import org.kulasny.domain.exercise.NrKartyW;

import java.util.*;

public class MagazynW {
    final NrKartyW NrKarty;
    final GregorianCalendar DataW;
    final Double Masa;
    final String Jedn;
    final Integer Firma;
    final Integer NrKlienta;
    final Integer NrMagw;
    final Integer NrOdpadu;

    public MagazynW(String nrKarty,
                    String dataW,
                    String masa,
                    String jedn,
                    String firma,
                    String nrKlienta,
                    String nrMagw,
                    String nrOdpadu) {
        NrKarty = new NrKartyW(nrKarty);
        int[] data = Arrays.stream((dataW.split("\\."))).mapToInt(Integer::parseInt).toArray();
        DataW = new GregorianCalendar(data[2], data[1], data[0]);
        Masa = Double.valueOf(masa.replaceAll("\\W+",""));
        Jedn = jedn;
        Firma = Integer.valueOf(firma.replaceAll("\\W+",""));
        NrKlienta = Integer.valueOf(nrKlienta.replaceAll("\\W+",""));
        NrMagw = Integer.valueOf(nrMagw.replaceAll("\\W+",""));
        NrOdpadu = Integer.valueOf(nrOdpadu.replaceAll("\\W+",""));
    }

    public NrKartyW getNrKarty() {
        return NrKarty;
    }

    public GregorianCalendar getDataW() {
        return DataW;
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

    public Integer getNrKlienta() {
        return NrKlienta;
    }

    public Integer getNrOdpadu() {return NrOdpadu;}
}
