package Ukeoppgaver.Uke36.Seksjon134;

import Datastrukturer.Tabell;

public class Oppgave3 {
    public static void main(String[] args) {
        int[] a = {7,5,9,2,10,4,1,8,6,3};     // en usortert heltallstabell
        Tabell.utvalgssortering(a);           // stigende sortering
        Tabell.snu(a);                        // tabellen snus
        Tabell.skriv(a);                      // 10 9 8 7 6 5 4 3 2 1

    }
}
