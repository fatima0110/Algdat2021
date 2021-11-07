package Ukeoppgaver.Uke38.Seksjon151;

public class Oppgave10 {
    public static int fakultet(int n) {
        if (n == 1) {
            return 1;
        }
        else {
            return n*fakultet(n-1);
        }
    }
}
