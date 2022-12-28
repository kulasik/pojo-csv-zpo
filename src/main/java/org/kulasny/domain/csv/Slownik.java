package org.kulasny.domain.csv;

public class Slownik {
    final String Gr;
    final String Podgr;
    final String Rodz;
    final String Typ;
    final String Opis;
    final Integer NrOdpadu;

    public Slownik(String gr,
                   String podgr,
                   String rodz,
                   String typ,
                   String opis,
                   String nrOdpadu) {
        Gr = gr.replaceAll("\\W+","");
        Podgr = podgr.replaceAll("\\W+","");
        Rodz = rodz.replaceAll("\\W+","");
        Typ = typ.replaceAll("\\W+", "");
        Opis = opis;
        NrOdpadu = Integer.valueOf(nrOdpadu.replaceAll("\\W+",""));
    }

    public String getGr() {
        return Gr;
    }

    public String getPodgr() {
        return Podgr;
    }

    public String getRodz() {
        return Rodz;
    }

    public String getTyp() {
        return Typ;
    }

    public String getOpis() {
        return Opis;
    }

    public Integer getNrOdpadu() {
        return NrOdpadu;
    }

    @Override
    public String toString() {
        return "Slownik{" +
                "Gr=" + Gr +
                ", Podgr=" + Podgr +
                ", Rodz=" + Rodz +
                ", Typ=" + Typ +
                ", Opis='" + Opis + '\'' +
                ", NrOdpadu=" + NrOdpadu +
                '}';
    }
}
