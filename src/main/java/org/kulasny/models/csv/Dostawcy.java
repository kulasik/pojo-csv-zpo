package org.kulasny.models.csv;

public class Dostawcy {
    final Integer NrKlienta;
    final String Miejscowosc;
    final String Ulica;
    final String NazwaSkrocona;

    public Dostawcy(String nrKlienta,
                    String miejscowosc,
                    String ulica,
                    String nazwaSkrocona) {
        NrKlienta = Integer.valueOf(nrKlienta.trim());
        Miejscowosc = miejscowosc;
        Ulica = ulica;
        NazwaSkrocona = nazwaSkrocona;
    }

    public Integer getNrKlienta() {
        return NrKlienta;
    }

    public String getMiejscowosc() {
        return Miejscowosc;
    }

    public String getUlica() {
        return Ulica;
    }

    public String getNazwaSkrocona() {
        return NazwaSkrocona;
    }

    @Override
    public String toString() {
        return "Dostawcy{" +
                "NrKlienta=" + NrKlienta +
                ", Miejscowosc='" + Miejscowosc + '\'' +
                ", Ulica='" + Ulica + '\'' +
                ", NazwaSkrocona='" + NazwaSkrocona + '\'' +
                '}';
    }
}
