package org.example;

public class Magicien extends Joueur implements Voler {
    public Magicien(String nom, String sexe, int age, int taille, int PV, int moral, int niveau) {
        super(nom, sexe, age, taille, PV, moral, niveau);
    }

    @Override
    public void Voler() {


    }
}