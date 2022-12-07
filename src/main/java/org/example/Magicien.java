package org.example;

public class Magicien extends Joueur implements Voler {

    public Magicien(String nom, String sexe, int age, int taille, String classe) {
        super(nom, sexe, age, taille, classe);
    }

    @Override
    public void Voler() {

    }
}