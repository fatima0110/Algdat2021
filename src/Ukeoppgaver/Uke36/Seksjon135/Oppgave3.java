package Ukeoppgaver.Uke36.Seksjon135;

public class Oppgave3 {
    public static int lineærsøk(int[] a, int verdi) //
    {
        if (a.length == 0 || verdi < a[0]) //starter å lete bakerst
            return -1;  // verdi er mindre enn den største

        int i = a.length - 1; for( ; a[i] > verdi; i--);  // siste verdi er vaktpost

        return verdi == a[i] ? i : -(i + 2);   // sjekker innholdet i a[i]
    }
}
