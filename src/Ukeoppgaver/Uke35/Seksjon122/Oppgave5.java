package Ukeoppgaver.Uke35.Seksjon122;
import Datastrukturer.Tabell;

public class Oppgave5 {
    public static void skriv(int[] a, int fra, int til) {
        Tabell.skriv(a,fra,til);
        System.out.println();
    }
    public static void skriv(int [] a) {
       Tabell.skriv(a,0,a.length);
    }
}
