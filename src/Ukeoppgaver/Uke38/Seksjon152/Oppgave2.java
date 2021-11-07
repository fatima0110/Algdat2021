package Ukeoppgaver.Uke38.Seksjon152;

import Datastrukturer.Tabell;

public class Oppgave2 {
    public static int euklid(int a, int b) {
        System.out.println("euklid(" + a +"," + b + ") starter!");

        if (b == 0){
            System.out.println("euklid(" + a +"," + b + ") er ferdig!");
            return a;
        }
        int r = a % b; // r er resten
        int k = euklid(b,r);       // rekursivt kall
        System.out.println("euklid(" + a +"," + b + ") starter");
        return k;
    }
}
