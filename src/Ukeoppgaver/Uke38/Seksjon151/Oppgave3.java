package Ukeoppgaver.Uke38.Seksjon151;

public class Oppgave3 {
    public static int tverrsum(int n)              // n må være >= 0
    {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
