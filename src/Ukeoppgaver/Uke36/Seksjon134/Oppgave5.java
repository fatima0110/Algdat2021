package Ukeoppgaver.Uke36.Seksjon134;

public class Oppgave5 {
    public static void utvalgssortering(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int m = i;             // indeks til den foreløpig minste
            int minverdi = a[i];  // verdien til den foreløpig minste

            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < minverdi) {
                    minverdi = a[j];  // ny minste verdi
                    m = j;            // indeksen til ny minste verdi
                }
            }
            // bytter om a[i] og a[m]
            int temp = a[i];
            a[i] = a[m];
            a[m] = temp;
        }
    }
}