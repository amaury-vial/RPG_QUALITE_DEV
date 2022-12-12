package org.example;

public class Rôdeurs extends Joueur implements Marcher{

    public Rôdeurs(String nom, char sexe, int age, int taille, char classe) {
        super(nom, sexe, age, taille, classe);
         agilite += 10;
    }
}
