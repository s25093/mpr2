package pl.pjatk.tdd.sklep;

public class KartaKlienta {
    private int dostepneKupony;

    private int znizka;

    KartaKlienta(){
        this.znizka = 0;
        this.dostepneKupony = 0;
    }

    void dodajKupony(int iloscKuponow) {
        this.dostepneKupony += iloscKuponow;
    }

    void dodajZnizke(int wartoscZnizki){this.znizka -= wartoscZnizki;}

    public int pobierzIloscDostepnychKuponow() {
        return dostepneKupony;
    }

    public int pobierzWartoscZnizki(){return znizka;}
}
