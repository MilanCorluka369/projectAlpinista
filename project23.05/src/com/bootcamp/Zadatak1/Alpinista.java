package com.bootcamp.Zadatak1;

public class Alpinista extends Planinar{
    private int poeni;
    private static final double maksimalniUspon = 4000;
    private static final double clanarina = 1500;

    public Alpinista(String ime, String prezime, int identifikacioniBroj, int poeni) {
        super(ime, prezime, identifikacioniBroj);
        this.poeni = poeni;
    }

    public int getPoeni() {
        return poeni;
    }

    public void setPoeni(int poeni) {
        this.poeni = poeni;
    }

    public void dodajPoene(int poeni){
        this.poeni += poeni;
    }

    @Override
    public String toString() {
        return super.toString() + " " + poeni + " " + maksimalniUspon + " " + clanarina;
    }

    @Override
    public void stampaj() {
        System.out.println("\nAlpinista, id: " + super.getIdentifikacioniBroj() +
                "\nIme: " + super.getIme() + " " + super.getPrezime() + "\nBroj poena: " + poeni);
    }

    @Override
    public double clanarinaPlaninara() {
        double popust = this.clanarina - this.poeni * 50;
        if (popust < 0)
            System.out.println("\nAlpinista ne placa clanarinu");
        return popust;
    }

    public boolean uspesanUspon(Planina planina) {
        if(maksimalniUspon < planina.getVisinaPlanine())
            return false;
        return true;
    }
}
