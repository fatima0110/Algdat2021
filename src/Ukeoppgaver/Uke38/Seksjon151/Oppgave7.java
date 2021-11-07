package Ukeoppgaver.Uke38.Seksjon151;

public class Oppgave7 {
    public static int kvadratsum(int n) {
        if (n == 1) {
            return 1;
        }
        else {
            return kvadratsum(n-1) + n*n;
        }
    }
}
