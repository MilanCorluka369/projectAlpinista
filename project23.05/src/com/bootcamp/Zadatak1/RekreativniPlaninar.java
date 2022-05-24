package com.bootcamp.Zadatak1;

public class RekreativniPlaninar extends Planinar{
    private int tezinaOpreme;
    private String nazivOkruga;
    private static final double maksimalniUsponBezOpreme = 2000;
    private static final double clanarina = 1000;

    public RekreativniPlaninar(String ime, String prezime, int identifikacioniBroj, int tezinaOpreme,
                               String nazivOkruga) {
        super(ime, prezime, identifikacioniBroj);
        this.tezinaOpreme = tezinaOpreme;
        this.nazivOkruga = nazivOkruga;
    }

    public int getTezinaOpreme() {
        return tezinaOpreme;
    }

    public void setTezinaOpreme(int tezinaOpreme) {
        this.tezinaOpreme = tezinaOpreme;
    }

    public String getNazivOkruga() {
        return nazivOkruga;
    }

    public void setNazivOkruga(String nazivOkruga) {
        this.nazivOkruga = nazivOkruga;
    }

    public double getClanarina() {
        return clanarina;
    }

    @Override
    public String toString() {
        return super.toString() + " " + tezinaOpreme + " " + nazivOkruga + " " +
                maksimalniUsponBezOpreme + " " + clanarina;
    }

    @Override
    public void stampaj() {
        System.out.println("\nRekreativac, id: " + super.getIdentifikacioniBroj() + "\nIme: " +
                super.getIme() + " " + super.getPrezime() + " Okrug: " + nazivOkruga);
    }

    @Override
    public double clanarinaPlaninara() {
        return getClanarina();
    }

    @Override
    public boolean uspesanUspon(Planina planina) {
        double usponSaOpremom = this.maksimalniUsponBezOpreme - this.tezinaOpreme * 50;
        if(usponSaOpremom < planina.getVisinaPlanine())
            return false;
        return true;
    }
}
