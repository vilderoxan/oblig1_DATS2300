package oblig1;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Denne klassen kan du bruke til hjelp under utvikling av din oblig.
 * Lag små og enkle test-eksempler for å teste at metoden din fungerer som ønsket.
 */
class Oblig1UnitTest {

    @org.junit.jupiter.api.Test
    void maks() {
        int[] a = {1, 4, 9, 7, 5, 34, 4, 8, 9, 23};
        int[] b = {1, 4, 9, 70, 5, 34, 4, 4, 5, 23};

        int maksimum = Oblig1.maks(a);
        int maksimum1 = Oblig1.maks(b);
        assertEquals(34, maksimum);
        assertEquals(70, maksimum1);
    }

    @org.junit.jupiter.api.Test
    void ombyttinger() {
        int[] a = {6, 5, 4, 3, 2, 1};
        int[] b = {1, 2, 3, 4, 5};
        int[] c = {4, 9, 3, 6, 1, 5, 7, 8, 10, 2};
        int[] d = {2, 5, 8, 4, 3, 10, 1, 7, 6, 9};
        assertEquals(5, Oblig1.ombyttinger(a));
        assertEquals(0, Oblig1.ombyttinger(b));
        assertEquals(7, Oblig1.ombyttinger(c));
        assertEquals(6, Oblig1.ombyttinger(d));
    }

    @org.junit.jupiter.api.Test
    void antallUlikeSortert() {
        int[] a = {1, 2, 2, 3, 3};
        int[] b = {1, 1, 1};
        int[] c = {1, 1, 1, 2, 2, 3, 4, 5, 5, 6, 7, 7, 7};
        int[] d = {};
        assertEquals(3, Oblig1.antallUlikeSortert(a));
        assertEquals(1, Oblig1.antallUlikeSortert(b));
        assertEquals(7, Oblig1.antallUlikeSortert(c));
        assertEquals(0, Oblig1.antallUlikeSortert(d));

    }

    @org.junit.jupiter.api.Test
    void antallUlikeUsortert() {
        int[] a = {1, 3, 2, 3, 2};
        int[] b = {1, 1, 1};
        int[] c = {7, 1, 7, 2, 2, 3, 4, 6, 5, 6, 7, 1, 7};
        int[] d = {};
        assertEquals(3, Oblig1.antallUlikeUsortert(a));
        assertEquals(1, Oblig1.antallUlikeUsortert(b));
        assertEquals(7, Oblig1.antallUlikeUsortert(c));
        assertEquals(0, Oblig1.antallUlikeUsortert(d));
    }

    @org.junit.jupiter.api.Test
    void kvikksortering1() {
        int[] a = {3, 2, 1, 6, 4, 5};
        Oblig1.kvikksortering(a, 0, 3);
        int[] expected = {1, 2, 3, 6, 4, 5};
        assertArrayEquals(expected, a);
    }

    @org.junit.jupiter.api.Test
    void kvikksortering2() {
        int[] a = {3, 2, 1, 6, 4, 5};
        Oblig1.kvikksortering(a, 3, a.length);
        int[] expected = {3, 2, 1, 4, 5, 6};
        assertArrayEquals(expected, a);
    }

    @org.junit.jupiter.api.Test
    void separerOddPar() {
        int[] a = {6, 10, 9, 4, 1, 3, 8, 5, 2, 7};
        Oblig1.separerOddPar(a);
        int antallOddetall = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                antallOddetall++;
            }
        }
        for (int i = 0; i < antallOddetall; i++) {
            assertTrue(a[i] % 2 != 0, String.format("Ikke oddetall [%d]: %d", i, a[i]));
        }
        for (int i = antallOddetall; i < a.length; i++) {
            assertTrue(a[i] % 2 == 0, String.format("Ikke partall [%d]: %d", i, a[i]));
        }
    }

    @org.junit.jupiter.api.Test
    void delsortering() {
        int[] a = new int[]{1, 2, 3, 4, 5, 6};
        int[] expected = new int[]{1, 3, 5, 2, 4, 6};
        Oblig1.delsortering(a);
        assertArrayEquals(expected, a);

        a = new int[]{6, 10, 9, 4, 1, 3, 8, 5, 2, 7};
        expected = new int[]{1, 3, 5, 7, 9, 2, 4, 6, 8, 10};
        Oblig1.delsortering(a);
        assertArrayEquals(expected, a);
    }

    @org.junit.jupiter.api.Test
    void rotasjon() {
        assertEquals(true, false, "Implementer rotasjon og denne testen");
    }

    @org.junit.jupiter.api.Test
    void flett() {
        assertEquals(true, false, "Implementer flett og denne testen");
    }

    @org.junit.jupiter.api.Test
    void indekssortering() {
        int[] a = new int[]{1, 2, 3, 4, 5, 6};
        int[] aIndexes = Oblig1.indekssortering(a);
        int[] expected = new int[]{0, 1, 2, 3, 4, 5};
        assertArrayEquals(expected, aIndexes, Arrays.toString(aIndexes));
        int[] b = new int[]{5, 2, 8, 3, 5, 10, 7, 5, 2, 10, 6};
        int[] bIndexes = Oblig1.indekssortering(b);
        int[] expected2 = new int[]{1, 8, 3, 0, 4, 7, 10, 6, 2, 5, 9};
        assertArrayEquals(expected2, bIndexes, Arrays.toString(bIndexes));
    }

    @org.junit.jupiter.api.Test
    void tredjeMin() {
        assertEquals(true, false, "Implementer tredjeMin og denne testen");
    }

    @org.junit.jupiter.api.Test
    void bokstavNr() {
        assertEquals(true, false, "Implementer bokstavNr og denne testen");
    }

    @org.junit.jupiter.api.Test
    void inneholdt() {
        assertEquals(true, false, "Implementer inneholdt og denne testen");
    }
}