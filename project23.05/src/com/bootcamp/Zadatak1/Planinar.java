package com.bootcamp.Zadatak1;

public abstract class Planinar {
    private String ime;
    private String prezime;
    private int identifikacioniBroj;

    public Planinar(String ime, String prezime, int identifikacioniBroj) {
        this.ime = ime;
        this.prezime = prezime;
        this.identifikacioniBroj = identifikacioniBroj;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public int getIdentifikacioniBroj() {
        return identifikacioniBroj;
    }

    @Override
    public String toString() {
        return ime + " " + prezime + " " + identifikacioniBroj;
    }

    public abstract void stampaj();
    public abstract double clanarinaPlaninara();
    public abstract boolean uspesanUspon(Planina planina);
}
