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

        int maksimum = Oblig1.maks(a);
        assertEquals(34, maksimum);
    }

    @org.junit.jupiter.api.Test
    void ombyttinger() {
        int[] a = {1, 2, 3, 5, 4};
        int[] b = {9, 8, 7};
        int[] c = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        int ombyttinger = Oblig1.ombyttinger(c);
        assertEquals(9, ombyttinger);
    }

    @org.junit.jupiter.api.Test
    void antallUlikeSortert() {
        assertEquals(true, false, "Implementer antallUlikeSortert og denne testen");
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