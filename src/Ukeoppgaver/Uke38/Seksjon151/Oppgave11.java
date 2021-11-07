package Ukeoppgaver.Uke38.Seksjon151;

public class Oppgave11 {
    public static int fib(int n)         // det n-te Fibonacci-tallet
    {
        if (n <= 1) return n;              // fib(0) = 0, fib(1) = 1
        else return fib(n-1) + fib(n-2);   // summen av de to foregående
    }

    public static void main(String[] args) {
        System.out.println(fib(20));
        System.out.println(fib(30));
        System.out.println(fib(40));
        System.out.println(fib(50)); //får ikke et svar her
    }
}
