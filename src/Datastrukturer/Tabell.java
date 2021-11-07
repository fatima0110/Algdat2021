package Datastrukturer;

import Ukeoppgaver.Uke41.Seksjon412.Oppgave1;
import eksempelklasser.Komparator;
import org.w3c.dom.Node;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;

public class Tabell {
    public static Object innse; // Samleklasse for tabellmetoder
    private Tabell() {
    }   // privat standardkonstruktør - hindrer instansiering

    public static void bytt(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static int[] randPerm(int n) {
        int[] a = new int[n]; // fyller tabellen med 1, 2, . . , n
        for (int i = 0; i < n; i++) a[i] = i + 1;

        Random r = new Random();  // hentes fra java.util

        for (int k = n - 1; k > 0; k--) {
            int i = r.nextInt(k + 1);  // tilfeldig tall fra [0,k]
            bytt(a, k, i);
        }

        return a; // tabellen med permutasjonen returneres

    } // randPerm

    public static void randPerm(int[] a) // stokker om a
    {
        Random r = new Random();  // hentes fra java.util

        for (int k = a.length - 1; k > 0; k--) {
            int i = r.nextInt(k + 1);  // tilfeldig tall fra [0,k]
            bytt(a, k, i);
        }
    }

    public static int maks(int[] a, int fra, int til) {
        //if (fra < 0 || til > a.length || fra >= til)
        //  throw new IllegalArgumentException("Illegalt intervall!");

        fratilKontroll(a.length, fra, til);

        int m = fra;             // indeks til største verdi i a[fra:til>
        int maksverdi = a[fra];  // største verdi i a[fra:til>

        for (int i = fra + 1; i < til; i++)
            if (a[i] > maksverdi) {
                m = i;               // indeks til største verdi oppdateres
                maksverdi = a[m];    // største verdi oppdateres
            }

        return m;  // posisjonen til største verdi i a[fra:til>
    }

    public static int maks(int[] a)  // bruker hele tabellen
    {
        return maks(a, 0, a.length);  // kaller metoden over
    }

    public static int min(int[] a, int fra, int til) {
        if (fra < 0 || til > a.length || fra >= til)
            throw new IllegalArgumentException("Illegalt intervall!");

        int m = fra;             // indeks til minste verdi i a[fra:til>
        int minverdi = a[fra];  // minste verdi i a[fra:til>

        for (int i = fra + 1; i < til; i++)
            if (a[i] < minverdi) {
                m = i;               // indeks til minste verdi oppdateres
                minverdi = a[m];    // minste verdi oppdateres
            }

        return m;  // posisjonen til minste verdi i a[fra:til>
    }

    public static int min(int[] a)  // bruker hele tabellen
    {
        return min(a, 0, a.length);  // kaller metoden over
    }

    public static void bytt(char[] c, int i, int j) {
        char temp = c[i];
        c[i] = c[j];
        c[j] = temp;
    }

    public static void fratilKontroll(int tablengde, int fra, int til) {
        if (fra < 0)                                  // fra er negativ
            throw new ArrayIndexOutOfBoundsException
                    ("fra(" + fra + ") er negativ!");

        if (til > tablengde)                          // til er utenfor tabellen
            throw new ArrayIndexOutOfBoundsException
                    ("til(" + til + ") > tablengde(" + tablengde + ")");

        if (fra > til)                                // fra er større enn til
            throw new IllegalArgumentException
                    ("fra(" + fra + ") > til(" + til + ") - illegalt intervall!");
    }

    public static void skriv(int[] a, int fra, int til) {
        Tabell.fratilKontroll(a.length, fra, til);
        if (til - fra > 0) System.out.print(a[fra]);
        for (int i = fra + 1; i < til; i++) System.out.print(" " + a[i]);
    }

    public static void skriv(int[] a) {

        skriv(a, 0, a.length);
    }

    public static void skrivln(int[] a, int fra, int til) {
        skriv(a, fra, til);
        System.out.println();
    }

    public static void skrivln(int[] a) {
        skrivln(a, 0, a.length);
    }

    public static void vhKontroll(int tablengde, int v, int h) {
        if (v < 0)
            throw new ArrayIndexOutOfBoundsException("v(" + v + ") < 0");

        if (h >= tablengde)
            throw new ArrayIndexOutOfBoundsException
                    ("h(" + h + ") >= tablengde(" + tablengde + ")");

        if (v > h + 1)
            throw new IllegalArgumentException
                    ("v = " + v + ", h = " + h);
    }
    public static int[] nestMaks(int[] a)  // legges i class Tabell
    {
        int n = a.length;   // tabellens lengde

        if (n < 2) throw   // må ha minst to verdier!
                new java.util.NoSuchElementException("a.length(" + n + ") < 2!");

        int m = maks(a);  // m er posisjonen til tabellens største verdi

        int nm;           // nm skal inneholde posisjonen til nest største verdi

        if (m == 0)                            // den største ligger først
        {
            nm = maks(a, 1, n);                  // leter i a[1:n>
        }
        else if (m == n - 1)                   // den største ligger bakerst
        {
            nm = maks(a, 0, n - 1);              // leter i a[0:n-1>
        }
        else
        {
            int mv = maks(a, 0, m);              // leter i a[0:m>
            int mh = maks(a, m + 1, n);          // leter i a[m+1:n>
            nm = a[mh] > a[mv] ? mh : mv;        // hvem er størst?
        }

        return new int[] {m,nm};      // m i posisjon 0 , nm i posisjon 1

    } // nestMaks

    public static void snu(int[] a, int v, int h)  // snur intervallet a[v:h]
    {
        while (v < h) bytt(a, v++, h--);
    }

    public static void snu(int[] a, int v)  // snur fra og med v og ut tabellen
    {
        snu(a, v, a.length - 1);
    }

    public static void snu(int[] a)  // snur hele tabellen
    {
        snu(a, 0, a.length - 1);
    }

    public static boolean nestePermutasjon(int[] a)
    {
        int i = a.length - 2;                    // i starter nest bakerst
        while (i >= 0 && a[i] > a[i + 1]) i--;   // går mot venstre
        if (i < 0) return false;                 // a = {n, n-1, . . . , 2, 1}

        int j = a.length - 1;                    // j starter bakerst
        while (a[j] < a[i]) j--;                 // stopper når a[j] > a[i]
        bytt(a,i,j); snu(a,i + 1);             // bytter og snur

        return true;                             // en ny permutasjon
    }

    public static void utvalgssortering(int[] a)
    {
        for (int i = 0; i < a.length - 1; i++)
            bytt(a, i, min(a, i, a.length));  // to hjelpemetoder
    }
    public static int lineærsøk(int[] a, int verdi) // legges i class Tabell
    {
        if (a.length == 0 || verdi > a[a.length-1])
            return -(a.length + 1);  // verdi er større enn den største

        int i = 0; for( ; a[i] < verdi; i++);  // siste verdi er vaktpost

        return verdi == a[i] ? i : -(i + 1);   // sjekker innholdet i a[i]
    }
    public static int binærsøk(int[] a, int fra, int til, int verdi)
    {
        Tabell.fratilKontroll(a.length,fra,til);  // se Programkode 1.2.3 a)
        int v = fra, h = til - 1;  // v og h er intervallets endepunkter

        while (v <= h)    // fortsetter så lenge som a[v:h] ikke er tom
        {
            int m = (v + h)/2;      // heltallsdivisjon - finner midten
            int midtverdi = a[m];   // hjelpevariabel for midtverdien

            if (verdi == midtverdi) return m;          // funnet
            else if (verdi > midtverdi) v = m + 1;     // verdi i a[m+1:h]
            else  h = m - 1;                           // verdi i a[v:m-1]
        }

        return -(v + 1);    // ikke funnet, v er relativt innsettingspunkt
    }

    public static int binærsøk1(int[] a, int verdi)  // søker i hele a
    {
        return binærsøk(a,0,a.length,verdi);  // bruker metoden over
    }

    // 2. versjon av binærsøk - returverdier som for Programkode 1.3.6 a)
    public static int binærsøk2(int[] a, int fra, int til, int verdi)
    {
        Tabell.fratilKontroll(a.length,fra,til);  // se Programkode 1.2.3 a)
        int v = fra, h = til - 1;    // v og h er intervallets endepunkter

        while (v <= h)  // fortsetter så lenge som a[v:h] ikke er tom
        {
            int m = (v + h)/2;     // heltallsdivisjon - finner midten
            int midtverdi = a[m];  // hjelpevariabel for  midtverdien

            if (verdi > midtverdi) v = m + 1;        // verdi i a[m+1:h]
            else if (verdi < midtverdi) h = m - 1;   // verdi i a[v:m-1]
            else return m;                           // funnet
        }

        return -(v + 1);   // ikke funnet, v er relativt innsettingspunkt
    }

    // 3. versjon av binærsøk - returverdier som for Programkode 1.3.6 a)
    public static int binærsøk3(int[] a, int fra, int til, int verdi)
    {
        Tabell.fratilKontroll(a.length,fra,til);  // se Programkode 1.2.3 a)
        int v = fra, h = til - 1;  // v og h er intervallets endepunkter

        while (v < h)  // obs. må ha v < h her og ikke v <= h
        {
            int m = (v + h)/2;  // heltallsdivisjon - finner midten

            if (verdi > a[m]) v = m + 1;   // verdi må ligge i a[m+1:h]
            else  h = m;                   // verdi må ligge i a[v:m]
        }
        if (h < v || verdi < a[v]) return -(v + 1);  // ikke funnet
        else if (verdi == a[v]) return v;            // funnet
        else  return -(v + 2);                       // ikke funnet
    }

    public static void innsettingssortering(int[] a)
    {
        for (int i = 1; i < a.length; i++)  // starter med i = 1
        {
            int temp = a[i];  // hjelpevariabel
            for (int j = i - 1; j >= 0 && temp < a[j]; j--) Tabell.bytt(a, j, j + 1);
        }
    }

    public static int tverrsum(int n)
    {
        System.out.println("tverrsum(" + n + ") starter!");
        int sum = (n < 10) ? n : tverrsum(n / 10) + (n % 10);
        System.out.println("tverrsum(" + n + ") er ferdig!");
        return sum;
    }

    public interface Kø<T> {           // eng: Queue

        public boolean leggInn(T verdi); // eng: offer/add/enqueue    inn bakerst
        public T kikk();                 // eng: peek/element/front   den første
        public T taUt();                 // eng: poll/remove/dequeue  tar ut den første
        public int antall();             // eng: size                 køens antall
        public boolean tom();            // eng: isEmpty              er køen tom?
        public void nullstill();         // eng: clear                tømmer køen
    } // interface Kø

    public static class TabellKø<T> implements Kø<T> {
        private T[] a;      // en tabell
        private int fra;    // posisjonen til den første i køen
        private int til;    // posisjonen til første ledige plass

        @SuppressWarnings("unchecked")      // pga. konverteringen: Object[] -> T[]
        public TabellKø(int lengde) {
            if (lengde < 1)
                throw new IllegalArgumentException("Må ha positiv lengde!");

            a = (T[]) new Object[lengde];

            fra = til = 0;    // a[fra:til> er tom
        }

        public TabellKø()   // standardkonstruktør
        {
            this(8);
        }

        public int antall() {
            return fra <= til ? til - fra : a.length + til - fra;
        }

        public boolean leggInn(T verdi)   // null-verdier skal være tillatt
        {
            a[til] = verdi;                                 // ny verdi bakerst
            til++;                                          // øker til med 1
            if (til == a.length) til = 0;                   // hopper til 0
            if (fra == til) a = utvidTabell(2 * a.length);    // sjekker og dobler
            return true;                                    // vellykket innlegging
        }

        private T[] utvidTabell(int lengde) {
            @SuppressWarnings("unchecked")      // pga. konverteringen: Object[] -> T[]
            T[] b = (T[]) new Object[lengde];  // ny tabell

            // kopierer intervallet a[fra:a.length> over i b
            System.arraycopy(a, fra, b, 0, a.length - fra);

            // kopierer intervallet a[0:fra> over i b
            System.arraycopy(a, 0, b, a.length - fra, fra);

            fra = 0;
            til = a.length;
            return b;
        }

        public T taUt() {
            if (fra == til) throw new         // sjekker om køen er tom
                    NoSuchElementException("Køen er tom!");

            T temp = a[fra];                  // tar vare på den første i køen
            a[fra] = null;                    // nuller innholdet
            fra++;                            // øker fra med 1
            if (fra == a.length) fra = 0;     // hopper til 0
            return temp;                      // returnerer den første


            // Her skal resten av metodene settes inn

        } // class TabellKø

        public T kikk() {
            if (fra == til) {
                throw new NoSuchElementException("Køen er tom!");
            }
            return a[fra];
        }

        public boolean tom() {
            return til == fra;
        }

        public void nullstill() {
            while (fra != til) {
                a[fra++] = null;
                if (fra == a.length)fra = 0;
            }
        }

        public int indeksTil(T verdi) {
            int k = fra;

            while (k != til) {
                if (verdi.equals(a[k])) {
                    return fra <= k ? k - fra : a.length + k - fra;
                    }
                k++;
                if (k == a.length) {
                    k = 0;
                }
            }
            return -1;
        }

        public String toString() {

            if (tom()) {
                return "[]";
            }
            int sfra = fra, stil = til;

            StringBuilder s = new StringBuilder();
            s.append('[').append(a[sfra]);
            sfra++;
            if (sfra == a.length) {
                sfra = 0;
            }

            while (sfra != stil) {
                s.append(',').append(a[sfra]);
                sfra++;
            }
            if (sfra == a.length) {
                sfra = 0;
            }
            s.append(']');

            return s.toString();
        }

        public static int maks(double[] a)     // legges i class Tabell
        {
            int m = 0;                           // indeks til største verdi
            double maksverdi = a[0];             // største verdi

            for (int i = 1; i < a.length; i++) if (a[i] > maksverdi) {
                maksverdi = a[i];     // største verdi oppdateres
                m = i;                // indeks til største verdi oppdaters
            }
            return m;     // returnerer posisjonen til største verdi
        }

        public static int maks(String[] a)    // legges i class Tabell
        {
            int m = 0;                          // indeks til største verdi
            String maksverdi = a[0];            // største verdi

            for (int i = 1; i < a.length; i++) if (a[i].compareTo(maksverdi) > 0) {
                maksverdi = a[i];  // største verdi oppdateres
                m = i;             // indeks til største verdi oppdaters
            }
            return m;  // returnerer posisjonen til største verdi
        }

        public static int maks(char[] c)    // legges i class Tabell
        {
            int m = 0;                          // indeks til største verdi
            char maksverdi = c[0];            // største verdi

            for (int i = 1; i < c.length; i++) if (c[i] > maksverdi)  {
                maksverdi = c[i];  // største verdi oppdateres
                m = i;             // indeks til største verdi oppdaters
            }
            return m;  // returnerer posisjonen til største verdi
        }
        public static int maks(Integer[] a)    // legges i class Tabell
        {
            int m = 0;                          // indeks til største verdi
            Integer maksverdi = a[0];            // største verdi

            for (int i = 1; i < a.length; i++) if (a[i] > maksverdi)  {
                maksverdi = a[i];  // største verdi oppdateres
                m = i;             // indeks til største verdi oppdaters
            }
            return m;  // returnerer posisjonen til største verdi
        }

       // public class EnkeltLenketListe<T, Liste> implements Liste<T>, Kø<T> {
         //   public T taUt()
          //  {
          //      if (tom()) throw new NoSuchElementException("Køen er tom!");
            //    return fjern(0);   // returnerer (og fjerner) den første
            //}

            //public T kikk()
           // {
            //    if (tom()) throw new NoSuchElementException("Køen er tom!");
             //   return hent(0);    // henter den første
            //}

        //}

    }

    public static <T extends Comparable<? super T>> int maks(T[] a)
    {
        int m = 0;                     // indeks til største verdi
        T maksverdi = a[0];            // største verdi

        for (int i = 1; i < a.length; i++) if (a[i].compareTo(maksverdi) > 0)
        {
            maksverdi = a[i];  // største verdi oppdateres
            m = i;             // indeks til største verdi oppdaters
        }
        return m;  // returnerer posisjonen til største verdi
    } // maks

    public static <T extends Comparable<? super T>> void innsettingssortering(T[] a)
    {
        for (int i = 1; i < a.length; i++)  // starter med i = 1
        {
            T verdi = a[i];        // verdi er et tabellelemnet
            int  j = i - 1;        // j er en indeks
            // sammenligner og forskyver:
            for (; j >= 0 && verdi.compareTo(a[j]) < 0 ; j--) a[j+1] = a[j];

            a[j + 1] = verdi;      // j + 1 er rett sortert plass
        }
    }

    public static void bytt(Object[] a, int i, int j)
    {
        Object temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static Integer[] randPermInteger(int n)
    {
        Integer[] a = new Integer[n];               // en Integer-tabell
        Arrays.setAll(a, i -> i + 1);               // tallene fra 1 til n

        Random r = new Random();   // hentes fra  java.util

        for (int k = n - 1; k > 0; k--)
        {
            int i = r.nextInt(k+1);  // tilfeldig tall fra [0,k]
            bytt(a,k,i);             // bytter om
        }
        return a;  // tabellen med permutasjonen returneres
    }

    public static <T> void innsettingssortering(T[] a, Komparator<? super T> c)
    {
        for (int i = 1; i < a.length; i++)  // starter med i = 1
        {
            T verdi = a[i];        // verdi er et tabellelemnet
            int  j = i - 1;        // j er en indeks

            // sammenligner og forskyver:
            for (; j >= 0 && c.compare(verdi,a[j]) < 0 ; j--) a[j+1] = a[j];

            a[j + 1] = verdi;      // j + 1 er rett sortert plass
        }
    }

    public static <T> int maks(T[] a, int fra, int til, Komparator<? super T> c) {
        fratilKontroll(a.length, fra, til);
        if (fra == til) {
            throw new NoSuchElementException("tomt tabellintervall!");
        }
        int m = fra;      //indeks til største verdi
        T maksverdi = a[fra]; //største verdi

    for (int i = fra + 1; i < til; i++) {
        if (c.compare(a[i], maksverdi) > 0) {
            maksverdi = a[i];
            m = i;
        }
    }
    return m;
    }

} // class Tabell

