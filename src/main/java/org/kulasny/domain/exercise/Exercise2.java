package org.kulasny.domain.exercise;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Exercise2 {
    final NrKartyW nrKarty;
    final GregorianCalendar dataW;
    final Double masa;
    final String kod;
    final Integer firma;
    final String nazwaSkrocona;
    final String typ;
    final String opis;

    public Exercise2(NrKartyW nrKarty,
                     GregorianCalendar dataW,
                     String kod,
                     Double masa,
                     Integer firma,
                     String typ,
                     String nazwaSkrocona,
                     String opis) {
        this.nrKarty = nrKarty;
        this.dataW = dataW;
        this.kod = kod;
        this.masa = masa;
        this.firma = firma;
        this.typ = typ;
        this.nazwaSkrocona = nazwaSkrocona;
        this.opis = opis;
    }

    public NrKartyW getNrKarty() {
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

    private static String format(GregorianCalendar calendar){
        SimpleDateFormat fmt = new SimpleDateFormat("dd-MM-yyyy");
        fmt.setCalendar(calendar);

        return fmt.format(calendar.getTime());
    }
    @Override
    public String toString() {
        return nrKarty + "|" +
                format(dataW) + "|" +
                kod + "|" +
                masa + "|" +
                firma + "|" +
                typ + "|" +
                nazwaSkrocona + "|" +
                opis;
    }
}
