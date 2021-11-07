package Ukeoppgaver.Uke41.Seksjon412;

import java.util.Comparator;

public class Oppgave7 {
    public static <T> void sorter(Oppgave1.Stakk<T> A, Comparator<? super T> c){
        Oppgave1.Stakk<T> B = new Oppgave1.TabellStakk<T>();
        T temp; int n = 0;

        while (!A.tom()){
            temp = A.taUt();
            n=0;
            while (!B.tom() && c.compare(temp,B.kikk()) < 0){
                n++; A.leggInn(B.taUt());
            }
            B.leggInn(temp);
            for (int i=0; i <n; i++)
                B.leggInn(A.taUt());
        }
        while (!B.tom())
            A.leggInn(B.taUt());
    }
}

