package org.example;


/**
 * La classe Personnage permet de créer un personnage avec un nom et des points de santé, de force et de résistance.
 * @author Ramdani DJibril, Sarti Alex, Vial Amaury
 * @version 1.0
 *
 */
 public class Personnage {
    /**
     * Nom du personnage
     */
    private String nom;
    /**
     * Points de santé du personnage
     */
    private int sante;
    /**
     * Force du personnage
     */
    private int force ;
    /**
     * Résistance du personnage
     */
    private int resistance;

    /**
     * Constructeur de la classe Personnage
     * @param nom Nom du personnage
     */

    public Personnage(String nom  ) {
        this.nom = nom;
        this.sante = 100;

    }

    /**
     * Récupère le nom du personnage
     * @return String
     */

     public String getNom() {
        return nom;
    }

    /**
     * Récupère les points de santé du personnage
     * @return int
     */
    public int getSante() {
        return sante;
    }

    /**
     * Récupère la force du personnage
     * @return int
     */
    public int getForce() {

        return force;
    }

    /**
     * Récupère la résistance du personnage
     * @return int
     */

    public int getResistance() {
        return resistance;
    }
    /**
     * Définit le nom du personnage
     * @param nom Nom du personnage
     */
     public void setNom(String nom) {
         this.nom = nom;
     }

    /**
     * Définit les points de santé du personnage
     * @param sante Points de santé du personnage
     */
     public void setSante(int sante) {
         this.sante = sante;
     }

    /**
     * Définit la force du personnage
     * @param force Force du personnage
     */
     public void setForce(int force) {
         this.force = force;
     }

    /**
     * Définit la résistance du personnage
     * @param resistance Résistance du personnage
     */
     public void setResistance(int resistance) {
         this.resistance = resistance;
     }

    /**
     * Fait subir des dégats à un personnage
     * @param degatRecu Dégats subis par le personnage
     */
     public void subirDegat(int degatRecu) {
        this.sante -= degatRecu;
     }

}
