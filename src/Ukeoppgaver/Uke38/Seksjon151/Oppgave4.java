package Ukeoppgaver.Uke38.Seksjon151;

import Datastrukturer.Tabell;

public class Oppgave4 {
    public static int sifferrot(int n){
        while (n >= 10) n = Oppgave3.tverrsum(n);
        return n;
    }

    public static int sifferrot1(int n){ //hvis n ikke går opp, er sifferroten lik resten når n deles med 9
        n %= 9;
        return n == 0 ? 9 : n;
    }

}
