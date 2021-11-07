package Ukeoppgaver.Uke41.Seksjon412;

public class Oppgave6 {
    public static <T> void kopier(Oppgave1.Stakk<T> A, Oppgave1.Stakk<T> B) {
        int n = A.antall();
        while (n > 0) {
            for (int j = 0; j < n; j++)
                B.leggInn(A.taUt());
                T temp = B.kikk();
                for (int j = 0; j < n; j++)
                    A.leggInn(B.taUt());
                    B.leggInn(temp);
                    n--;
        }
    }
}
