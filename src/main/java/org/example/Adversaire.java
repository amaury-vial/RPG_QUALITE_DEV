package org.example;

/**
 * La classe Adversaire est une sous-classe de Personnage dont le but est de gérer un adversaire.
 *
 * @author Exemple
 * @version 1.0
 */

//Classe pour gérer un adversaire
public class Adversaire extends Personnage{


    /**
     * Constructeur Adversaire.
     * Initialise le nom, la force et la résistance de l'adversaire.
     *
     * @param nom Le nom de l'adversaire
     * @param force La force de l'adversaire
     * @param resistance La résistance de l'adversaire
     */
    public Adversaire(String nom , int force , int resistance ) {
        super(nom );
        this.setForce(force);
        this.setResistance(resistance);

    }

}