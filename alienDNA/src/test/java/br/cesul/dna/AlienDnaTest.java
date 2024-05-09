package br.cesul.dna;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlienDnaTest {
    private AlienDna dna;
    private AlienDna dna2;

    @BeforeEach
    public void setup() {
        this.dna = new AlienDna("BaaB");
        this.dna2 = new AlienDna("BAAA");
    }

    @Test
    public void createsAlienDnaWithCorrectAttributes() {
        assertEquals("BaaB", dna.getDna());
        assertEquals("BAAA", dna2.getDna());
    }

    @Test
    public void getsTheLargestSequenceBetweenTwoDnasCorrectly() {
        assertEquals(4, AlienDna.getLargestSequenceOfDna(dna.getDna(), dna2.getDna()));
    }

    @AfterEach
    public void tearDown() {
        this.dna = null;
        this.dna2 = null;
    }
}
