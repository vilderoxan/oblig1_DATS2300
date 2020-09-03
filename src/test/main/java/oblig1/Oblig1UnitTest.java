package oblig1;

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
        assertEquals(3, Oblig1.antallUlikeSortert(a));
        assertEquals(1, Oblig1.antallUlikeSortert(b));
        assertEquals(7, Oblig1.antallUlikeSortert(c));
    }

    @org.junit.jupiter.api.Test
    void antallUlikeUsortert() {
        assertEquals(true, false, "Implementer antallUlikeUsortert og denne testen");
    }

    @org.junit.jupiter.api.Test
    void delsortering() {
        assertEquals(true, false, "Implementer delsortering og denne testen");
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
        assertEquals(true, false, "Implementer indekssortering og denne testen");
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