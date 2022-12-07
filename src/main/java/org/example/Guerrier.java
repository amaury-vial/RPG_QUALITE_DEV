package org.example;

public class Guerrier extends Joueur implements Marcher{
    public Guerrier(String nom, String sexe, int age, int taille, int PV, int moral, int niveau) {
        super(nom, sexe, age, taille, PV, moral, niveau);
    }

    @Override
    public void attaqueSpé() {
        System.out.println("Attaque spéciale ");
    }





}
