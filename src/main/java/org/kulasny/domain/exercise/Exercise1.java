package org.kulasny.domain.exercise;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Exercise1 {
    final NrKartyP nrKarty;
    final GregorianCalendar dataD;
    final String kod;
    final Double masa;
    final String jedn;
    final Integer firma;
    final String typ;
    final String nazwaSkrocona;
    final Integer nrMag;
    final String opis;

    public Exercise1(NrKartyP nrKarty,
                     GregorianCalendar dataW,
                     String kod,
                     Double masa,
                     String jedn,
                     Integer firma,
                     String typ,
                     String nazwaSkrocona,
                     Integer nrMag,
                     String opis) {
        this.nrKarty = nrKarty;
        this.dataD = dataW;
        this.kod = kod;
        this.masa = masa;
        this.jedn = jedn;
        this.firma = firma;
        this.typ = typ;
        this.nazwaSkrocona = nazwaSkrocona;
        this.nrMag = nrMag;
        this.opis = opis;
    }

    public NrKartyP getNrKarty() {
        return nrKarty;
    }

    public Integer getKodInt() {
        return Integer.valueOf(kod);
    }

    public String getKod(){
        return kod;
    }

    public Double getMasa() {
        return masa;
    }

    public Integer getFirma() {
        return firma;
    }

    public String getNazwaSkrocona() {
        return nazwaSkrocona;
    }

    public String getJedn() {
        return jedn;
    }

    private static String format(GregorianCalendar calendar){
        SimpleDateFormat fmt = new SimpleDateFormat("dd-MM-yyyy");
        fmt.setCalendar(calendar);

        return fmt.format(calendar.getTime());
    }
    @Override
    public String toString() {
        return nrKarty + "|" +
                format(dataD) + "|" +
                kod + "|" +
                masa + "|" +
                jedn + "|" +
                firma + "|" +
                typ + "|" +
                nazwaSkrocona + "|" +
                nrMag + "|" +
                opis;
    }
}
