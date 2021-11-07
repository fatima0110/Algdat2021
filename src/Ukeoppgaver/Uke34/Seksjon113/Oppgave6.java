package Ukeoppgaver.Uke34.Seksjon113;

public class Oppgave6 {
    public static long fak(int n){
        if (n < 0)
            throw new IllegalArgumentException("n<0");
            long fak = 1;

            for (int i = 2; i <= n; i++) fak *=i;

            return fak;

            //Hvis n = 0 eller 1 utføres ingen multiplikasjoner
        //Hvis n > 1 utføres det n - 1 multiplikasjoner
    }
}
