package Ukeoppgaver.Uke36.Seksjon134;

import Datastrukturer.Tabell;

public class Oppgave9 {
    public static void utvalgssortering(int[] a, int fra, int til){
        //a[fra:til>
        Tabell.fratilKontroll(a.length,fra,til);

        for (int i = fra; i < til - 1; i++ ){
            Tabell.bytt(a,i,Tabell.min(a,i,til));

        }

    }
}
