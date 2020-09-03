package oblig1;

import java.lang.UnsupportedOperationException;

////// Løsningsforslag Oblig 1 ////////////////////////

public class Oblig1 {


    private Oblig1() {
    }

    ///// Oppgave 1 //////////////////////////////////////
    public static int maks(int[] a) {
        if (a.length == 0) {
            throw new java.util.NoSuchElementException("Arrayet er tomt");
        }
        int maks;

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                int temp = a[i];
                a[i] = a[i + 1];
                a[i + 1] = temp;
            }
        }
        maks = a[a.length - 1];
        return maks;
    }


    public static int ombyttinger(int[] a) {
        int antall = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                int temp = a[i];
                a[i] = a[i + 1];
                a[i + 1] = temp;
                antall++;  // inversjon = true
            }
        }
        return antall;
    }


    ///// Oppgave 2 //////////////////////////////////////
    public static boolean erSortert(int[] a) {
        for (int i = 1; i < a.length; i++)
            if (a[i - 1] > a[i]) return false;
        return true;
    }

    public static int antallUlikeSortert(int[] a) {
        boolean n = erSortert(a);
        if (!n) {
            throw new IllegalStateException("Listen er ikke sortert stigende");
        }

        int count = 1;

        if (a.length == 0) {
            count = 0;
        } else {
            int temp = a[0];
            for (int i = 1; i < a.length; i++) {
                if (a[i] != temp) {
                    count++;
                    temp = a[i];
                }
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

    public static int maks2(int[] a)   // versjon 2 av maks-metoden
    {
        int m = 0;             // indeks til største verdi
        int maksverdi = a[0];  // største verdi
        int antall = 0;

        for (int i = 1; i < a.length; i++)
            if (a[i] > maksverdi) {
                maksverdi = a[i];  // største verdi oppdateres
                m = i;             // indeks til største verdi oppdaters
                antall++;
            }
        return antall;  // returnerer indeks/posisjonen til største verdi

    }

    public static void main(String[] args) {
        int[] c = {4, 9, 3, 6, 1, 5, 7, 8, 10, 2};
        //System.out.println(ombyttinger(c));
        System.out.println(maks2(c));
    }

}  // Oblig1


