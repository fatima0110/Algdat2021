package Ukeoppgaver.Uke37.Seksjon145;
import eksempelklasser.Studium;

public class Oppgave1 {
    public static void main(String[] args) {
        for (Studium s : Studium.values())
        {
            System.out.println(s.toString() + " (" + s.name() + ")");
        }
        // Ingeniørfag - data (Data)
        // Informasjonsteknologi (IT)
        // Anvendt datateknologi (Anvendt)
        // Enkeltemnestudent (Enkeltemne)
    }

}
