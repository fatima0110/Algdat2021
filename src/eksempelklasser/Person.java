package eksempelklasser;

import java.util.Objects;

public class Person implements Comparable<Person> {
    private final String fornavn;         // personens fornavn
    private final String etternavn;       // personens etternavn

    public Person(String fornavn, String etternavn){         // konstruktør

        Objects.requireNonNull(fornavn,"Fornavnet må oppgis!");
        Objects.requireNonNull(etternavn,"Etternavnet må oppgis!");

        this.fornavn = fornavn;
        this.etternavn = etternavn;
    }

    public String fornavn() { return fornavn; }       // aksessor
    public String etternavn() { return etternavn; }   // aksessor

    public int compareTo(Person p)    // pga. Comparable<Person>
    {
        int cmp = etternavn.compareTo(p.etternavn);     // etternavn
        if (cmp != 0) return cmp;             // er etternavnene ulike?
        return fornavn.compareTo(p.fornavn);  // sammenligner fornavn
    }

    public boolean equals(Object o)      // vår versjon av equals
    {
        if (o == this) return true;
        if (!(o instanceof Person)) return false;
        return compareTo((Person)o) == 0;

        //Oppgave 2e)
        //if (o==this){ return trye;
        //if (o==null){ return false;
        //if(getClass()!=o.getClass()){ return false;
        //final Person p = (Person)o;
        //return etternavn.equals(p.etternavn) && fornavn.equals(p.fornavn);
        //}
        //}
        //}

        //Oppgave 2f)
        //public boolean equals(Person p){
        //if (p==this){ return true;
        //if(p==null){ return false;
        //return etternavn.equals(p.etternavn) && fornavn.equals(p.fornavn);

    }

    public int hashCode() { return Objects.hash(etternavn, fornavn); }

    public String toString() {
        return String.join(" ", fornavn, etternavn);
        //return fornavn + " " + etternavn;
        }

} // class Person