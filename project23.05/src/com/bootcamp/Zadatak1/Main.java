package com.bootcamp.Zadatak1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Planina planina1 = new Planina("Sar-planina", "Srbija", 2658);
        ArrayList <Planinar> planinari = new ArrayList<>();
        planinari.add(new RekreativniPlaninar("Milan", "Corluka", 123, 5,
                "Srednje-Banatski okrug"));
        planinari.add(new RekreativniPlaninar("Petar", "Petrovic", 216, 10,
                "Pirotski okrug"));
        planinari.add(new RekreativniPlaninar("Marko", "Markovic", 693, 15,
                "Nisavski okrug"));
        planinari.add(new Alpinista("Ilija", "Ilic", 879, 3));
        planinari.add(new Alpinista("Pera", "Perovic", 645, 5));
        planinari.add(new Alpinista("Darko", "Peric", 753, 10));

        for(Planinar p: planinari){
            p.stampaj();
            if(p.uspesanUspon(planina1))
                System.out.println("Planinar ce se uspesno popeti na vrh!");
            else
                System.out.println("Planinar se nece uspesno popeti na vrh!");
        }

        double zbirClanarina = 0;
        for(Planinar p: planinari){
            zbirClanarina += p.clanarinaPlaninara();
        }
        System.out.println("\nZbir svih clanarina svih planinara je: " + zbirClanarina);
    }
}
