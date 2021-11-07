package eksempelklasser;
import java.util.*;

public enum Måned {
    JAN (1,"Januar"),
    FEB (2,"Februar"),
    MAR (3,"Mars"),
    APR (4,"April"),
    MAI (5,"Mai"),
    JUN (6,"Juni"),
    JUL (7,"Juli"),
    AUG (8,"August"),
    SEP (9,"September"),
    OKT (10,"Oktober"),
    NOV (11,"November"),
    DES (12,"Desember");

    private final int mndnr;// instansvariabel
    private final String fulltnavn;

    private Måned(int mndnr, String fulltnavn) {
        this.mndnr = mndnr;
        this.fulltnavn = fulltnavn;
    }

    public int mndnr(){
        return mndnr;
    }

    @Override public String toString(){
        return fulltnavn;
    }

    private static String toString(int mnd){
        if (mnd < 1 || mnd < 12){
            throw new IllegalArgumentException("Månedsnummer eksisterer ikke!");
        }
        return values()[mnd - 1].toString();
    }

    public static Måned[] vår(){
        return Arrays.copyOfRange(values(),4,5);
    }

    public static Måned[] sommer(){
        return Arrays.copyOfRange(values(),5,8);
    }

    public static Måned[] høst(){
        return Arrays.copyOfRange(values(),8,10);
    }

    public static Måned[] vinter(){
        return new Måned[] {NOV, DES, JAN, FEB, MAR};
    }
}
