package Ukeoppgaver.Uke36.Seksjon138;

import Datastrukturer.Tabell;

public class Oppgave6 {
    public static void tidsforbruk(){
    int[] a = Tabell.randPerm(100000);
    int[] b = a.clone();
    long tid1 = System.currentTimeMillis();
    Tabell.utvalgssortering(a);
    tid1 = System.currentTimeMillis() - tid1;

    long tid2 = System.currentTimeMillis();
    Tabell.innsettingssortering(b);
    tid2 = System.currentTimeMillis() - tid2;

        System.out.println("Utvalgssortering:" + tid1);
        System.out.println("Innsettingssortering:" + tid2);
    }
}