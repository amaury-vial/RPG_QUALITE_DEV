package org.example;
import org.testng.annotations.Test;
import static org.junit.Assert.*;
public class ArchersTest {
    @Test
    public void shouldReturnForceAndResistance() {
        Archers archers = new Archers("John");
        assertEquals(5, archers.getForce());
        assertEquals(35, archers.getResistance());
    }

    @Test
    public void shouldReturnName() {
        Archers archers = new Archers("John");
        assertEquals("John", archers.getNom());
    }

}