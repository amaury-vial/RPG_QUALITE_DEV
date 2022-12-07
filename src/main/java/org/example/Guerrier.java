package org.example;

public class Guerrier extends Joueur implements Marcher, Metier{

    public Guerrier(String nom, String sexe, int age, int taille, String classe) {
        super(nom, sexe, age, taille, classe);
    }

    @Override
    public void appliquerStatsSpecifiques() {

    }
}
