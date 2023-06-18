package org.example;

public class PozycjaJavaBean {
    PozycjaJavaBean(){}
    private String opis;
    private int ilosc;
    private double cena;
    private int vat;
    private String ku;

    public void setOpis(final String opis) {
        this.opis = opis;
    }
    public void setIlosc(final int ilosc) {
        this.ilosc = ilosc;
    }
    public void setCena(final double cena) {
        this.cena = cena;
    }
    public void setVat(final int vat) {
        this.vat = vat;
    }
    public void setKu(final String ku) {
        this.ku = ku;
    }

    @Override
    public String toString() {
        return "PozycjaJavaBean{" +
                "opis='" + opis + '\'' +
                ", ilosc=" + ilosc +
                ", cena=" + cena +
                ", vat=" + vat +
                ", ku='" + ku + '\'' +
                '}';
    }
}
