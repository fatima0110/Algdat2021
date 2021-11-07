package Ukeoppgaver.Uke37.Seksjon143;
import Datastrukturer.Tabell;

public class Oppgave5 {
    public static void skriv(Object[] a, int fra, int til) {

        Tabell.fratilKontroll(a.length, fra, til);

        for (int i = fra; i < til; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void skriv(Object[] a) {
        skriv(a, 0, a.length);
    }

    public static void skrivIn(Object[] a, int fra, int til) {
        skriv(a,fra,til);
        System.out.println();
    }

    public static void skrivIn(Object[] a){
        skrivIn(a,0, a.length);
    }

    public void bytt(Object[] a, int i, int j) {
        Object temp = a[i];
        a[i] = a[j];
        a[j] = temp;

    }
}