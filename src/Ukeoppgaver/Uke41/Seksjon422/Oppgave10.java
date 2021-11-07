package Ukeoppgaver.Uke41.Seksjon422;
import Datastrukturer.Tabell;
import Ukeoppgaver.Uke41.Seksjon412.Oppgave1;

public class Oppgave10 {
    public static <T> void snu(Tabell.Kø<T> A){
        Oppgave1.Stakk<T> B = new Oppgave1.TabellStakk<T>();
        while (!A.tom()) B.leggInn(A.taUt());  // verdiene flyttes fra A til B
        while (!B.tom()) A.leggInn(B.taUt());  // verdiene flyttes fra B til A
    }
}
