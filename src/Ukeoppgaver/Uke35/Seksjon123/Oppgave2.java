package Ukeoppgaver.Uke35.Seksjon123;

public class Oppgave2 {
    /*
     * Checks that fromIndex and toIndex are in
     * the range and throws an exception if they aren't.
     */
    static void rangeCheck(int arrayLength, int fromIndex, int toIndex)
    {
        if (fromIndex > toIndex)
        {
            throw new IllegalArgumentException(
                    "fromIndex(" + fromIndex + ") > toIndex(" + toIndex + ")");
        }

        if (fromIndex < 0)
        {
            throw new ArrayIndexOutOfBoundsException(fromIndex);
        }

        if (toIndex > arrayLength)
        {
            throw new ArrayIndexOutOfBoundsException(toIndex);
        }
    }
}
