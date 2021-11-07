package Ukeoppgaver.Uke35.Seksjon1213;


public class Oppgave4 {
    public static void kopier(int[] a, int i, int[] b, int j, int ant) {
        System.arraycopy(a,0,b,0,a.length);     // legger a først i b
        System.arraycopy(a,0,b,b.length - a.length,a.length);      // legger a bakerst i b
        System.arraycopy(a, 0,b,(b.length-a.length)/2,a.length);


    }
}
