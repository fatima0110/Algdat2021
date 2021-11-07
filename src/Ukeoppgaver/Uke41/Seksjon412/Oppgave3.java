package Ukeoppgaver.Uke41.Seksjon412;

public class Oppgave3 {
    public static <T> void snu(Oppgave1.Stakk<T> A){
       Oppgave1.Stakk<T> B = new Oppgave1.TabellStakk<T>();
        Oppgave1.Stakk<T> C = new Oppgave1.TabellStakk<T>();

        while (!A.tom()) B.leggInn(A.taUt());  // verdiene flyttes fra A til B
        while (!B.tom()) C.leggInn(B.taUt());  // verdiene flyttes fra B til C
        while (!C.tom()) A.leggInn(C.taUt());  // verdiene flyttes fra A til B
    }
}
