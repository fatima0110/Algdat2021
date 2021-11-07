package Ukeoppgaver.Uke37.Seksjon143;

import Datastrukturer.Tabell;

public class Oppgave7 {
    public static void main(String[] args){
        double[] d = {5.7,3.14,7.12,3.9,6.5,7.1,7.11};                 // en int-tabell

        Double[] b = new Double[d.length];             // en tom Integer-tabell
        for (int i = 0; i < b.length; i++) b[i] = d[i];  // fyller tabellen (autoboksing)

        Tabell.innsettingssortering(b);
        Oppgave5.skrivIn(b);
    }
}
