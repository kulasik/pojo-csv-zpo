package org.kulasny.models.csv;

public class Slownik {
    final Integer Gr;
    final Integer Podgr;
    final Integer Rodz;
    final String Typ;
    final String Opis;
    final Integer NrOdpadu;

    public Slownik(String gr,
                   String podgr,
                   String rodz,
                   String typ,
                   String opis,
                   String nrOdpadu) {
        Gr = Integer.valueOf(gr.trim());
        Podgr = Integer.valueOf(podgr.trim());
        Rodz = Integer.valueOf(rodz.trim());
        Typ = typ.trim();
        Opis = opis;
        NrOdpadu = Integer.valueOf(nrOdpadu.trim());
    }

    public Integer getGr() {
        return Gr;
    }

    public Integer getPodgr() {
        return Podgr;
    }

    public Integer getRodz() {
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
