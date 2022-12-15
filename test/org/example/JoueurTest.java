package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class JoueurTest {
    @Test
    public void testJoueur() {
        Joueur joueur = new Joueur("Joueur1");
        assertEquals("Joueur1", joueur.getNom());
        assertEquals(0, joueur.getOr());
        assertEquals(1, joueur.getNiveau());
        assertEquals(0, joueur.getExperience());
    }

    @Test
    public void testSetOr() {
        Joueur joueur = new Joueur("Joueur2");
        joueur.setOr(50);
        assertEquals(50, joueur.getOr());
    }

    @Test
    public void testSetNiveau() {
        Joueur joueur = new Joueur("Joueur3");
        joueur.setNiveau(2);
        assertEquals(2, joueur.getNiveau());
    }

    @Test
    public void testSetExperience() {
        Joueur joueur = new Joueur("Joueur4");
        joueur.setExperience(20);
        assertEquals(20, joueur.getExperience());
    }

    @Test
    public void testSetNbPetitePotion() {
        Joueur joueur = new Joueur("Joueur5");
        joueur.setNbPetitePotion(3);
        assertEquals(3, joueur.getNbPetitePotion());
    }

    @Test
    public void testSetNbMoyennePotion() {
        Joueur joueur = new Joueur("Joueur6");
        joueur.setNbMoyennePotion(4);
        assertEquals(4, joueur.getNbMoyennePotion());
    }

    @Test
    public void testSetNbGrandePotion() {
        Joueur joueur = new Joueur("Joueur7");
        joueur.setNbGrandePotion(5);
        assertEquals(5, joueur.getNbGrandePotion());
    }

}