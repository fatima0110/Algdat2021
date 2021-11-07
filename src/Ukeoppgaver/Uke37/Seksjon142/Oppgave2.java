package Ukeoppgaver.Uke37.Seksjon142;
import Datastrukturer.Tabell;
import java.util.Arrays;

public class Oppgave2 {
    public static void main(String[] args) {
        String[] s = {"Per","Kari","Ole","Anne","Ali","Eva"};
        Tabell.innsettingssortering(s);
        System.out.println(Arrays.toString(s));  // [Ali, Anne, Eva, Kari, Ole, Per]

        //virker!
    }
}
