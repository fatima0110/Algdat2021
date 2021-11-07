package Ukeoppgaver.Uke41.Seksjon412;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class Oppgave1 {
    public static class TabellStakk<T> implements Stakk<T> {
        private T[] a;                     // en T-tabell
        private int antall;                // antall verdier på stakken

        public TabellStakk()               // konstruktør - tabellengde 8
        {
            this(8);
        }

        @SuppressWarnings("unchecked")     // pga. konverteringen: Object[] -> T[]
        public TabellStakk(int lengde)     // valgfri tabellengde
        {
            if (lengde < 0)
                throw new IllegalArgumentException("Negativ tabellengde!");

            a = (T[]) new Object[lengde];     // oppretter tabellen
            antall = 0;                      // stakken er tom
        }

        public void leggInn(T verdi) {
            if (antall == a.length)
                a = Arrays.copyOf(a, antall == 0 ? 1 : 2 * antall);   // dobler

            a[antall++] = verdi;
        }

        public T kikk() {
            if (antall == 0)       // sjekker om stakken er tom
                throw new NoSuchElementException("Stakken er tom!");

            return a[antall - 1];    // returnerer den øverste verdien
        }

        public T taUt() {
            if (antall == 0)       // sjekker om stakken er tom
                throw new NoSuchElementException("Stakken er tom!");

            antall--;             // reduserer antallet

            T temp = a[antall];   // tar var på det øverste objektet
            a[antall] = null;     // tilrettelegger for resirkulering

            return temp;          // returnerer den øverste verdien
        }

        public boolean tom() {
            return antall == 0;
        }

        public int antall() {
            return antall;
        }

        public void nullstill() {
           for (int i = 0; i < antall; i++){
               a[i] = null;
               antall = 0;
           }
        }
    }
    public interface Stakk<T>          // eng: Stack
    {
        public void leggInn(T verdi);    // eng: push
        public T kikk();                 // eng: peek
        public T taUt();                 // eng: pop
        public int antall();             // eng: size
        public boolean tom();            // eng: isEmpty
        public void nullstill();         // eng: clear

    } // interface Stakk
}
