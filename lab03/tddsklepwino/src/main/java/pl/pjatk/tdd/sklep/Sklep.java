package pl.pjatk.tdd.sklep;

public class Sklep {
    public static void dokonajZakupu(KartaKlienta karta, double kwotaZakupu) {
        //TODO: dodaj algorytm na liczenie ilości kuponów jakie należą się za zakup
        int liczbaKuponowDarmoweWino = (int) (kwotaZakupu / 40);
        if (liczbaKuponowDarmoweWino != 0 && liczbaKuponowDarmoweWino < 4){
            karta.dodajKupony(liczbaKuponowDarmoweWino);
        }
        int wartoscZnizki = 0;
        if (kwotaZakupu > 50) {
            wartoscZnizki += 5;
        }
        if (kwotaZakupu > 100) {
            wartoscZnizki += 10;
        }
        if (karta.pobierzIloscDostepnychKuponow() >= 10) {
            wartoscZnizki += 3;
        }
        karta.dodajZnizke(wartoscZnizki);
    }

    public static KartaKlienta wydajNowaKarte(){
        return new KartaKlienta();
    }
}
