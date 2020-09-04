package oblig1;

import java.lang.UnsupportedOperationException;
import java.util.Arrays;

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

    public static int antallUlikeUsortert(int[] a) {
        if (a.length == 0) {
            return 0;
        }
        int count = 1;

        for (int i = 1; i < a.length; i++) {
            int j = 0;
            for (; j < i; j++)
                if (a[i] == a[j])
                    break;

            if (i == j)
                count++;
        }
        return count;
    }

    // 1, 4, 1, 4, 2, 3, 2

    ///// Oppgave 4 //////////////////////////////////////
    public static void delsortering(int[] a) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 5 //////////////////////////////////////
    public static void rotasjon(char[] a) {
        int n = a.length;
        if (n < 2) {
            return;
        }
        int d = 1;
        char temp = a[0];  // tar vare på verdien i indeks 0

        for (int i = -d, j = 0; i != 0; i -= d)  // stopper i 0
        {
            if (i < 0) i += a.length;     // sjekker fortegnet til indeks i
            a[j] = a[i];            // kopierer
            j = i;                  // oppdaterer indeks j
        }
        a[d] = temp;        // legger tilbake verdien
        System.out.println(Arrays.toString(a));
    }


    ///// Oppgave 6 //////////////////////////////////////
    public static void rotasjon(char[] a, int k) {
        int n = a.length;
        if (n < 2) return;                 // tomt eller en verki
        if ((k %= n) < 0) k += n;                             // motsatt vei?

        char[] b = Arrays.copyOfRange(a, n - k, n);      // hjelpetabell
        for (int i = n - 1; i >= k; i--) a[i] = a[i - k];     // forskyver
        System.arraycopy(b, 0, a, 0, k);
    }

    ///// Oppgave 7 //////////////////////////////////////
    /// 7a)

    public static String flett(String s, String t) {
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        char[] c = new char[a.length + b.length]; // en tabell av rett størrelse

        int i = 0, j = 0, k = 0;                 // løkkevariabler

        while (i < a.length && j < b.length) {
            c[k++] = a[i++];      // først en verdi fra a
            c[k++] = b[j++];      // så en verdi fra b
        }
        // vi må ta med resten
        while (i < a.length) c[k++] = a[i++];
        while (j < b.length) c[k++] = b[j++];

        String output =  "";
        for (int l = 0; l < c.length; l++) {
            output = output + c[l];
        }
        return output;
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
        // String s = "ABC";
        // String t = "DEF";
        // String out = flett(s, t);
        // System.out.print(out);



        String[] a = {"Vilde", "Fauchald"};
        String h = a[0].getChars();

        a[0].charAt(0);
        String[] s = new String[a[0].getChars(0, a[0].length());]

        // GJØRE 4 og 7b!!
    }

}  // Oblig1


