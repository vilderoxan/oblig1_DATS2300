package oblig1;

import java.lang.UnsupportedOperationException;

////// Løsningsforslag Oblig 1 ////////////////////////

public class Oblig1 {


    private Oblig1() {
    }

    ///// Oppgave 1 //////////////////////////////////////
    public static int maks(int[] a) {
        if (a.length == 0) {
            throw new java.util.NoSuchElementException ("Arrayet er tomt");
        }
        int maks = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] > maks) {
                maks = a[i];

            }
        }
        return maks;
    }

    // returnere hvor mange ganger man må flytte på tall for å få listen sortert fra
    // minste til største verdi
    public static int ombyttinger(int[] a) {
        if (a.length < 2) {
            throw new java.util.NoSuchElementException("a.length < 2!");
        }
        int temp;
        int antall = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                temp = a[i];
                a[i] = a[i + 1];
                a[i + 1] = temp;
                antall++;
            }
        }
        return antall;
    }


    ///// Oppgave 2 //////////////////////////////////////
    //Telle opp antall ulike, men skal kun fungere dersom listen er sortert
    public static int antallUlikeSortert(int[] a) {
        int n = ombyttinger(a);

        if (n > 0) { // dette skjer dersom listen ikke er sortert
            throw new IllegalStateException();
        }

        int temp = a[0];
        int count = 1;

        for (int i = 1; i < a.length; i++) {
            if (a[i] != temp) {
                count++;
                temp = a[i];
            }
        }
        return count;
    }


    ///// Oppgave 3 //////////////////////////////////////

    // returnerer antall ulike i en usortert tabell
    // Kan sortere først og så
    public static int antallUlikeUsortert(int[] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j < a.length; j++) {
                if (a[i] != a[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    // 1, 2, 6, 3

    ///// Oppgave 4 //////////////////////////////////////
    public static void delsortering(int[] a) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 5 //////////////////////////////////////
    public static void rotasjon(char[] a) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 6 //////////////////////////////////////
    public static void rotasjon(char[] a, int k) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 7 //////////////////////////////////////
    /// 7a)
    public static String flett(String s, String t) {
        throw new UnsupportedOperationException();
    }

    /// 7b)
    public static String flett(String... s) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 8 //////////////////////////////////////
    public static int[] indekssortering(int[] a) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 9 //////////////////////////////////////
    public static int[] tredjeMin(int[] a) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 10 //////////////////////////////////////
    public static int bokstavNr(char bokstav) {
        throw new UnsupportedOperationException();
    }

    public static boolean inneholdt(String a, String b) {
        throw new UnsupportedOperationException();
    }

}  // Oblig1


