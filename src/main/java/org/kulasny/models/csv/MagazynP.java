package org.kulasny.models.csv;

import java.util.Arrays;
import java.util.Date;
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
        int[] data = Arrays.stream((dataD.split("."))).mapToInt(Integer::parseInt).toArray();
        DataD = new GregorianCalendar(data[2], data[1], data[0]);
        Masa = Double.valueOf(masa.trim());
        Jedn = jedn;
        Firma = Integer.valueOf(firma.trim());
        NrMag = Integer.valueOf(nrMag.trim());
        NrOdpadu = Integer.valueOf(nrOdpadu.trim());
        NrKlienta = Integer.valueOf(nrKlienta.trim());
    }
}
