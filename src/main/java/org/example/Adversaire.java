package org.example;

//Classe pour gérer un adversaire
public class Adversaire extends Personnage{

    public Adversaire(String nom , int force , int resistance ) {
        super(nom );
        this.setForce(force);
        this.setResistance(resistance);

    }

}