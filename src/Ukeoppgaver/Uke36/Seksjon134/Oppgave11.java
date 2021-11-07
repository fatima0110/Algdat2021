package Ukeoppgaver.Uke36.Seksjon134;

import Datastrukturer.Tabell;

public class Oppgave11 {
    //hvis m=i er ombyttingen unødvendig

    public static void utvalgssortering(int[] a) {
        for (int i = 0; i < a.length - 1; i++ ){
            int m = Tabell.min(a,i,a.length); //posisjonen til den minste
            if (m != i) Tabell.bytt(a,i,m);
        }
    }

    public static int utvalgssortering1(int[] a) {
        int antall = 0;
        for (int i = 0; i < a.length - 1; i++ ){
            int m = Tabell.min(a,i,a.length); //posisjonen til den minste
            if (m != i){
                Tabell.bytt(a,i,m);
            }
            else {
                antall++;
            }
        }
        return antall;
    }
}
