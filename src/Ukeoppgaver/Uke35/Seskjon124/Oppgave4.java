package Ukeoppgaver.Uke35.Seskjon124;
import Datastrukturer.Tabell;

public class Oppgave4 {
    public static void sortering(int[] a) {
       for (int i = a.length; i > 1; i--) { //går nedover i for-løkken
           int m = Tabell.maks(a,0,i);
           Tabell.bytt(a,i-1,m); //bytter de nye maksverdiene bakerst
       }
    }
}