package org.example;

public class Voleurs extends Joueur implements Marcher{

    public Voleurs(String nom, char sexe, int age, int taille, char classe) {
        super(nom, sexe, age, taille, classe);

        agilite += 5;
        chance += 5;
    }
}
