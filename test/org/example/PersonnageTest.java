package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class PersonnageTest {
    @Test
    public void whenPersonnageCreated_thenShouldHaveCorrectName() {
        String name = "Lara Croft";
        Personnage personnage = new Personnage(name);
        assertEquals(name, personnage.getNom());
    }

    @Test
    public void whenPersonnageCreated_thenShouldHave100Health() {
        Personnage personnage = new Personnage("Lara Croft");
        assertEquals(100, personnage.getSante());
    }

    @Test
    public void whenPersonnageCreated_thenShouldHaveCorrectForce() {
        int force = 10;
        Personnage personnage = new Personnage("Lara Croft");
        personnage.setForce(force);
        assertEquals(force, personnage.getForce());
    }

    @Test
    public void whenPersonnageCreated_thenShouldHaveCorrectResistance() {
        int resistance = 5;
        Personnage personnage = new Personnage("Lara Croft");
        personnage.setResistance(resistance);
        assertEquals(resistance, personnage.getResistance());
    }

    @Test
    public void whenPersonnageSubirDegat_thenShouldHaveLessHealth() {
        int degatRecu = 10;
        Personnage personnage = new Personnage("Lara Croft");
        personnage.subirDegat(degatRecu);
        assertEquals(90, personnage.getSante());
    }

}