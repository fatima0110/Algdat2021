package Ukeoppgaver.Uke36.Seksjon135;

//Oppgave 5a
public class Oppgave5 {
    public static int lineærsøk(int[] a, int k, int verdi){
        if (k < 1) {
            throw new IllegalArgumentException("K må være > 0");
        }
            int j = k - 1;
            for (; j < a.length && verdi > a[j]; j+= k );

            int i = j - k + 1;//søker i a[j-k+1:j]
        for (; i < a.length && verdi > a[i]; i++);

        if (i < a.length && a[i] == verdi){
            return i; //funnet
        }
        else {
            return -(i + 1);
        }
    }

    public static void main(String[] args) {
        int[] a = {5,35,63,2,5,6,7,8,5};
        int k = 1;
        System.out.println(lineærsøk(a,k,9));
    }

    //Oppgave 5c
    public static int kvadratrotsøk(int[] a, int verdi)
    {
        return lineærsøk(a,(int)Math.sqrt(a.length),verdi);
    }

}
