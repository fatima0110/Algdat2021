package Ukeoppgaver.Uke37.Seksjon142;
import Datastrukturer.Tabell;

public class Oppgave1 {
    public static void main(String[] args) {
        String[] s = {"Sohil","Per","Thanh","Fatima","Kari","Jasmin"};
        int k = Tabell.maks(s);        // hvilken maks-metode?
        System.out.println(s[k]);      // Utskrift:  Thanh
    }
}
