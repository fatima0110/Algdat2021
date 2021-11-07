package Ukeoppgaver.Uke36.Seksjon131;

import Datastrukturer.Tabell;

import java.util.Arrays;

public class Oppgave3 {
    public static void main(String[] args) {
        int[] a = {3 , 1, 4, 9, 7, 10, 8, 6, 5, 2};// permutasjon av tallene fra 1 til 10
        for (int i = 0; i < 10; i++) {
            Tabell.nestePermutasjon(a);              // lager neste permutasjon
            System.out.println(Arrays.toString(a));  //
        }
    }
}
