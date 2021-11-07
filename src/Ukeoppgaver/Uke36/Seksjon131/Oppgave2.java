package Ukeoppgaver.Uke36.Seksjon131;

import Datastrukturer.Tabell;

import java.util.Arrays;

public class Oppgave2 {
    public static void main(String[] args) {
        int[] a = {3 , 1, 4, 9, 7, 1};        // permutasjon av tallene fra 1 til 10
        Tabell.nestePermutasjon(a);              // lager neste permutasjon
        System.out.println(Arrays.toString(a));  // [3, 1, 4, 9, 8, 2, 5, 6, 7, 10]
    }
}
