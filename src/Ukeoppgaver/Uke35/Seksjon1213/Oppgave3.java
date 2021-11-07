package Ukeoppgaver.Uke35.Seksjon1213;

public class Oppgave3 {
    public static void kopier(int[] a, int i, int[] b, int j, int ant) {
        for (int n = i + ant; i < n;) b[j++] = a[i++]; //skjønte ikke helt!
    }
}
