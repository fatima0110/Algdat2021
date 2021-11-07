package Ukeoppgaver.Uke37.Seksjon143;

import Datastrukturer.Tabell;

import java.util.Arrays;

public class Oppgave6 {
    public static void main(String[] args) {
        Integer[] a = Tabell.randPermInteger(10);
        System.out.println(Arrays.toString(a));
        // En mulig utskrift: [7, 1, 8, 2, 10, 3, 4, 6, 5, 9]

        Tabell.innsettingssortering(a);
        System.out.println(Arrays.toString(a));
        // Utskrift: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

    }
}
