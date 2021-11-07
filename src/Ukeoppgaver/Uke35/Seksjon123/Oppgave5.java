package Ukeoppgaver.Uke35.Seksjon123;
import Datastrukturer.Tabell;

public class Oppgave5 {
    public static void skriv(int[] a, int fra, int til) {
        Tabell.fratilKontroll(a.length,fra,til);

        for (int i = fra; i < til; i++){
            System.out.print(a[i] + " ");
        }
    }

    public static void skrivIn(int[] a, int fra, int til) {
        Tabell.fratilKontroll(a.length,fra,til);

        for (int i = fra; i < til; i++){
            System.out.print(a[i] + " ");
            System.out.println();
        }

    }

}
