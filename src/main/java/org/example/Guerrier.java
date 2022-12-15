package org.example;

/**
 * La classe Guerrier étend la classe Joueur et définit le personnage Guerrier.
 * Il a une force supérieure à celle du Joueur et une résistance moindre.
 *
 * @author Ramdani DJibril, Sarti Alex, Vial Amaury
 */
public class Guerrier extends Joueur{

    /**
     * Constructeur de la classe Guerrier prenant en paramètre le nom du Guerrier.
     * @param nom Nom du Guerrier.
     */
    public Guerrier(String nom ) {
        super(nom);
        this.setForce(30);
        this.setResistance(10);
    }

    /**
     * Méthode permettant à un Guerrier d'effectuer une attaque spéciale.
     * La force du Guerrier est alors doublée.
     */
    @Override
    public void attaqueSpe() {
        System.out.println("Attaque spéciale !!");
        this.setForce(getForce()*2);

    }
}
