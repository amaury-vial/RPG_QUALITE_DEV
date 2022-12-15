package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class GuerrierTest {
    @Test
    void testConstructor() {
        Guerrier g = new Guerrier("Test_Guerrier");
        assertEquals(30, g.getForce());
        assertEquals(10, g.getResistance());
        assertEquals("Test_Guerrier", g.getNom());
    }

}