package org.example;

public class Joueur extends Personnage {

    int pointsAAttribuer = 20;
    public Joueur(String nom, char sexe, int age, int taille,  char classe) {
        super(nom,sexe,age,taille,classe);

    }



    public void ajouterAgilite() {
        setAgilite(agilite + 5);
        pointsAAttribuer -= 5;
    }
    public void ajouterForce() {
        setForce(force + 5);
        pointsAAttribuer -= 5;
    }
    public void ajouterChance() {
        setChance(chance + 5);
        pointsAAttribuer -= 5;
    }
    public void ajouterVitesse() {
        setVitesse(vitesse + 5);
        pointsAAttribuer -= 5;
    }

    public boolean pointsRestantsAAtribuer() {
        return pointsAAttribuer > 0;
    }
}
