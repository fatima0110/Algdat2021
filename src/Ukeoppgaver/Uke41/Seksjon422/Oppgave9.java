package Ukeoppgaver.Uke41.Seksjon422;
import Datastrukturer.Tabell;
import Ukeoppgaver.Uke41.Seksjon412.Oppgave1;

public class Oppgave9 {
    public static <T> void snu(Oppgave1.Stakk<T> A){
        Tabell.Kø<T> B = new Tabell.TabellKø<T>();

        while (!A.tom()) B.leggInn(A.taUt());  // verdiene flyttes fra A til B
        while (!B.tom()) A.leggInn(B.taUt());  // verdiene flyttes fra B til A
    }
}
