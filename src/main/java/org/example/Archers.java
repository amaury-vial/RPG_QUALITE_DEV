package org.example;


/**
 * Classe Archers qui hérite de la classe Joueur
 *
 * @author Ramdani DJibril, Sarti Alex, Vial Amaury
 * @version 1.0
 */
public class Archers extends Joueur {
    /**
     * Constructeur de la classe Archers
     *
     * @param nom  Le nom du joueur
     */
    public Archers(String nom ) {
        super(nom);
        this.setForce(5);
        this.setResistance(35);
    }

    /**
     * Redéfinition de la méthode attaquespe()
     */
    @Override
    public void attaqueSpe() {
        System.out.println("Attaque spéciale !!");
        this.setResistance(getResistance()*2);
    }
}
