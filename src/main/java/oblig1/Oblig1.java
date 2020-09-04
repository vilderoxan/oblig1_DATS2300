package oblig1;

import java.lang.UnsupportedOperationException;
import java.util.Arrays;
import java.util.NoSuchElementException;


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


    public static void fratilKontroll(int tabellengde, int fra, int til) {
        if (fra < 0)                                  // fra er negativ
            throw new ArrayIndexOutOfBoundsException
                    ("fra(" + fra + ") er negativ!");

        if (til > tabellengde)                          // til er utenfor tabellen
            throw new ArrayIndexOutOfBoundsException
                    ("til(" + til + ") > tablengde(" + tabellengde + ")");

        if (fra > til)                                // fra er større enn til
            throw new IllegalArgumentException
                    ("fra(" + fra + ") > til(" + til + ") - illegalt intervall!");

        if (fra == til)
            throw new NoSuchElementException
                    ("fra(" + fra + ") = til(" + til + ") - tomt tabellintervall!");
    }

    public static void bytt(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    private static int parter0(int[] a, int v, int h, int skilleverdi) {
        while (true)                                  // stopper når v > h
        {
            while (v <= h && a[v] < skilleverdi) v++;   // h er stoppverdi for v
            while (v <= h && a[h] >= skilleverdi) h--;  // v er stoppverdi for h

            if (v < h) bytt(a, v++, h--);
            else return v;  // a[v] er nåden første som ikke er mindre enn skilleverdi
        }
    }

    private static int sParter0(int[] a, int v, int h, int indeks) {
        bytt(a, indeks, h);           // skilleverdi a[indeks] flyttes bakerst
        int pos = parter0(a, v, h - 1, a[h]);  // partisjonerer a[v:h - 1]
        bytt(a, pos, h);              // bytter for å få skilleverdien på rett plass
        return pos;                   // returnerer posisjonen til skilleverdien
    }

    private static void kvikksortering0(int[] a, int v, int h)  // en privat metode
    {
        if (v >= h) return;  // a[v:h] er tomt eller har maks ett element
        int k = sParter0(a, v, h, (v + h) / 2);  // bruker midtverdien
        kvikksortering0(a, v, k - 1);     // sorterer intervallet a[v:k-1]
        kvikksortering0(a, k + 1, h);     // sorterer intervallet a[k+1:h]
    }

    public static void kvikksortering(int[] a, int fra, int til) // a[fra:til>
    {
        fratilKontroll(a.length, fra, til);  // sjekker når metoden er offentlig
        kvikksortering0(a, fra, til - 1);  // v = fra, h = til - 1
    }

    public static void kvikksortering(int[] a)   // sorterer hele tabellen
    {
        kvikksortering0(a, 0, a.length - 1);
    }


    public static boolean partall(int[] a) {
        int partall = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                partall++;
            }
        }
        if (partall != a.length) {
            return false;
        }
        return true;
    }


    public static boolean oddetall(int[] a) {
        int oddetall = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 1 == 1) {
                oddetall++;
            }
        }
        if (oddetall != a.length) {
            return false;
        }
        return true;
    }


    public static int[] delsortering(int[] a) {
        if (partall(a) || oddetall(a) == true) {
            kvikksortering(a);
        } else {
            /* Initialize left and right indexes */
            int left = 0, right = a.length - 1;
            while (left < right) {
                /* Increment left index while we see 0 at left */
                while (a[left] % 2 == 1 && left < right)
                    left++;

                /* Decrement right index while we see 1 at right */
                while (a[right] % 2 == 0 && left < right)
                    right--;

                if (left < right) {
                    /* Swap arr[left] and arr[right]*/
                    int temp = a[left];
                    a[left] = a[right];
                    a[right] = temp;
                    left++;
                    right--;


                    kvikksortering(a);
                }
            }
        }
        return a;
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

        return new String(c);
    }


    /// 7b)
    public static String flett(String... s) {
        int length = 0;
        for (int i = 0; i < s.length; i++) {
            length += s[i].length(); // sum av lengden av alle ord, altså hvor mange bokstaver
        }
        char[] chars = new char[length];
        int charIndex = 0;
        int charWordIndex = 0;

        // "Hpe", "eåg", "id" skal bli til "Heipådeg"
        while (charIndex < length) {
            for (int i = 0; i < s.length; i++) { // løper igjennom hvert ord
                if (charWordIndex < s[i].length()) { // "gard" som passer på at man ikke går utenfor ordet sin lengde
                    chars[charIndex++] = s[i].charAt(charWordIndex);
                }
            }
            charWordIndex++; // etter at vi har løpt igjennom alle ord en gang hopper vi til neste bokstav for hvert ord
        }
        return new String(chars);
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

    public static void partitionArray(int[] nums) {
        if (nums == null) return;

        int left = 0, right = nums.length - 1;
        while (left < right) {
            // odd number
            while (left < right && nums[left] % 2 != 0) {
                left++;
            }
            // even number
            while (left < right && nums[right] % 2 == 0) {
                right--;
            }
            // swap
            if (left < right) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }
        }
    }


    public static void main(String[] args) {
    }

}  // Oblig1


