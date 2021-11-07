package Ukeoppgaver.Uke38.Seksjon151;

public class Oppgave1 {
    public static int a(int n){
        if (n < 0) {
            throw new IllegalArgumentException("n kan ikke være negativ!");
        }
        int x = 0, y = 1, z = 1;
        for (int i=0; i < n; i++) {

            z = 2*y + 3*x; x = y; y =z;
        }
        return z;
    }
}
