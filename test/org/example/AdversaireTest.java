package org.example;

import org.testng.annotations.Test;

import static org.junit.Assert.*;

public class AdversaireTest {
    @Test
    void testAdversaire() {
        Adversaire adv = new Adversaire("Bob", 10, 5);
        assertEquals("Bob", adv.getNom());
        assertEquals(10, adv.getForce());
        assertEquals(5, adv.getResistance());
    }

}