package Ukeoppgaver.Uke36.Seksjon138;

import Datastrukturer.Tabell;

public class Oppgave7 {
    public static void innsettingssortering(int[] a, int fra, int til) {
        Tabell.fratilKontroll(a.length,fra,til);
        for (int i = fra; i < til; i++)
        {
            int temp = a[i];  // hjelpevariabel
            int j = i - 1; for (;j >= fra && temp < a[j]; j--) a[j+1] = a[j];

            a[j+1] = temp;
        }
    }
}
