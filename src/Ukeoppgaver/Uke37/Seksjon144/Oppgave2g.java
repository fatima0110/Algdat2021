package Ukeoppgaver.Uke37.Seksjon144;
import eksempelklasser.Person;

import java.util.Objects;

//public class Oppgave2g {
    //Oppgave 2 g)

    //NetBeans

    //Hvis metoden equals() er laget (men ikke hashCode()), vil NetBeans tilby flg. kode for hashCode() (konstantene varierer fra gang til gang):

   // public int hashCode()
    //{
      //  int hash = 5;
       // hash = 71 * hash + Objects.hashCode(this.fornavn);
       // hash = 71 * hash + Objects.hashCode(this.etternavn);
        //return hash;
   // }
    //Hvis metoden hashCode() er laget (men ikke equals()), vil NetBeans tilby flg. kode for equals():

    //public boolean equals(Object o)
    //{
       // if (o == null) return false;
        //if (getClass() != o.getClass()) return false;
        //final Person other = (Person) o;
        //if (!Objects.equals(this.fornavn, other.fornavn)) return false;
       // return Objects.equals(this.etternavn, other.etternavn);
    //}

    //Eclipse

    //Hvis ingen av dem er kodet, vil Eclipse lage flg. forslag:

    //@Override
   // public int hashCode()
    //{
      //  final int prime = 31;
        //int result = 1;
        /*result = prime * result + ((Person.etternavn == null) ? 0 : etternavn.hashCode());
        result = prime * result + ((fornavn == null) ? 0 : fornavn.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Person other = (Person) obj;
        if (etternavn == null)
        {
            if (other.etternavn != null) return false;
        }
        else if (!etternavn.equals(other.etternavn)) return false;
        if (fornavn == null)
        {
            if (other.fornavn != null) return false;
        }
        else if (!fornavn.equals(other.fornavn)) return false;
        return true;
    }

}
         */
