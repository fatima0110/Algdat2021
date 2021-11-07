package Ukeoppgaver.Uke37.Seksjon141;

public class Oppgave4 {
    //oppgave 4,5 og 6
    public static void main(String[] args) {
        Integer a = 1;
        Integer b = 1;

        String d = "Karianne";
        String e = "Kari";
        System.out.println(d.compareTo(e));
        System.out.println(a.compareTo(b));

        //hvis a < b --> -1
        //hvis a > b --> 1
        //hvis a = b --> 0

        System.out.println(Boolean.compare(false, true));
        // resultatet blir -1 fordi false er "mindre enn" true
    }
}
