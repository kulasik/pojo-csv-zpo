package org.kulasny.models.csv;

import java.util.*;

public class MagazynW {
    final String NrKarty;
    final GregorianCalendar DataW;
    final Double Masa;
    final String Jedn;
    final Integer Firma;
    final Integer NrKlienta;
    final Integer NrMagw;

    public MagazynW(String nrKarty,
                    String dataW,
                    String masa,
                    String jedn,
                    String firma,
                    String nrKlienta,
                    String nrMagw) {
        NrKarty = nrKarty;
        int[] data = Arrays.stream((dataW.split("."))).mapToInt(Integer::parseInt).toArray();
        DataW = new GregorianCalendar(data[2], data[1], data[0]);
        Masa = Double.valueOf(masa.trim());
        Jedn = jedn;
        Firma = Integer.valueOf(firma.trim());
        NrKlienta = Integer.valueOf(nrKlienta.trim());
        NrMagw = Integer.valueOf(nrMagw.trim());
    }
}
