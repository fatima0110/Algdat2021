package Ukeoppgaver.Uke36.Seksjon136;

import Datastrukturer.Tabell;

public class Oppgave4 {
    public static void main(String[] args) {
        int[] a = {1,3,4,4,5,7,7,8,9,10,10,12,15,15,15};
        System.out.println(Tabell.binærsøk3(a,0,a.length,4));
        System.out.println(Tabell.binærsøk3(a,0,a.length,7));
        System.out.println(Tabell.binærsøk3(a,0,a.length,10));
        System.out.println(Tabell.binærsøk3(a,0,a.length,15));

    }
}
