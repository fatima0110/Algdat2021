package Ukeoppgaver.Uke36.Seksjon135;

import Datastrukturer.Tabell;

public class Oppgave2 {
    public static int lineærsøk(int[] a, int verdi) // legges i class Tabell
    {
        if (a.length == 0 || verdi > a[a.length-1])
            return -(a.length + 1);  // verdi er større enn den største

        int i = 0; for( ; a[i] < verdi; i++);  // siste verdi er vaktpost

        return verdi == a[i] ? i : -(i + 1);   // sjekker innholdet i a[i]
    }

   public static void main(String[] args) {
        int[] a = {3,8,10,12,14,16,21,24,27,30,32,33,34,37,40};  // Figur 1.3.5 a)
        System.out.println(Tabell.lineærsøk(a,1)); //søker på et tall mindre enn den minste verdien (3)
       System.out.println(Tabell.lineærsøk(a,2));
       System.out.println(Tabell.lineærsøk(a,15));
       System.out.println(Tabell.lineærsøk(a,16));
       System.out.println(Tabell.lineærsøk(a,40));
       System.out.println(Tabell.lineærsøk(a,41));

    }

    //public static void main(String[] args) {
        //int[] a = {};  // Figur 1.3.5 a)
        //System.out.println(Tabell.lineærsøk(a,6)); //søker på et tall mindre enn den minste verdien (3)

   // }
}
