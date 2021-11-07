package Ukeoppgaver.Uke41.Seksjon412;

import Datastrukturer.Tabell;

public class Oppgave4 {
    public static <T> void kopier(Oppgave1.Stakk<T> A, Oppgave1.Stakk<T> B) {
        Oppgave1.Stakk<T> C = new Oppgave1.TabellStakk<T>();

        while (!A.tom())
            C.leggInn(A.taUt());  // verdiene flyttes fra A til 
        while (!C.tom()) {
            T t = C.taUt();
            B.leggInn(t);
            A.leggInn(t);
        }
    }
}
