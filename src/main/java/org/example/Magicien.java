package org.example;

public class Magicien extends Joueur implements Voler {

    public Magicien(String nom, char sexe, int age, int taille, char classe) {
        super(nom, sexe, age, taille, classe);
        chance += 10;
    }

    @Override
    public void Voler() {

    }
}