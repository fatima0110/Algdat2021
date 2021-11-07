package Ukeoppgaver.Uke34.Seksjon113;

public class Oppgave5 {
    public static int maks(int[] a)  // a er en heltallstabell
    {
        if (a.length < 1)
            throw new java.util.NoSuchElementException("Tabellen a er tom!");

        int m = 0;  // indeks til foreløpig største verdi (m for maks)

        for (int i = 1; i < a.length; i++) // obs: starter med i = 1
        {
            if (a[i] > a[m]) m = i;  // indeksen oppdateres
        }

        return m;  // returnerer indeksen/posisjonen til største verdi

    } // maks

    public static int min(int[] a)  // a er en heltallstabell
    {
        if (a.length < 1)
            throw new java.util.NoSuchElementException("Tabellen a er tom!");

        int m = 0;  // indeks til minste verdi

        for (int i = 1; i < a.length; i++) // obs: starter med i = 1
        {
            if (a[i] < a[m]) m = i;  // indeksen oppdateres
        }

        return m;  // returnerer indeksen/posisjonen til minste verdi

    } // min

    public static int[] minmaks(int[] a) {
        return new int[]{min(a), maks(a)};
        //utfører 2n - 2 sammenlikninger siden maks-, og min-metoden
        //hver for seg utfører n - 1 sammenlikninger

    }

    //alternativt kan denne metoden bruker

    public static int[] minmaks2(int[] a) {
        int mi = 0, minverdi = a[0];
        int ma = 0, maksverdi = a[0];

        int verdi = 0;

        for (int i = 1; i < a.length; i++) {
            verdi = a[i];

            if (verdi > maksverdi) {
                maksverdi = verdi;
                ma = i;
            } else if (verdi < minverdi) {
                minverdi = verdi;
                mi = i;
            }
        }
        return new int[]{mi, ma};

    }
}
