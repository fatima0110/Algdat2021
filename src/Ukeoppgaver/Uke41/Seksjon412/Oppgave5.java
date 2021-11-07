package Ukeoppgaver.Uke41.Seksjon412;

public class Oppgave5 {
    public static <T> void snu(Oppgave1.Stakk<T> A){
      Oppgave1.Stakk<T> B = new Oppgave1.TabellStakk<T>();
    int n = A.antall() - 1;

    while (n>0){
    T temp = A.taUt();
    for (int j = 0; j < n; j++) {
    B.leggInn(A.taUt());
    A.leggInn(temp);
    }
    while (!B.tom()) A.leggInn(B.taUt());
    n--;
    }
    }
}
