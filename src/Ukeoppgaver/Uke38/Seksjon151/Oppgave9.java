package Ukeoppgaver.Uke38.Seksjon151;

import Datastrukturer.Tabell;

public class Oppgave9 {
    public static int sum(int[] a, int v, int h) {
        if (v == h) {
            return v;
        }
            int m = (v + h) / 2; //midten
            int mv = Tabell.maks(a, v, m);
            int mh = Tabell.maks(a, m + 1, h);

            return a[mv] >= a[mh] ? mv : mh;
        }
   // public static int maks(int[] a) {
     //   return maks(a,0,a.length-1);

}