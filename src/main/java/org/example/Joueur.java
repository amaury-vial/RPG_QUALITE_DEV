package org.example;

public class Joueur extends Personnage{
    public Joueur(String nom, String sexe, int age, int taille, int PV, int moral, int niveau) {
        super(nom, sexe, age, taille, PV, moral, niveau);
    }



    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public int getAgilite() {
        return agilite;
    }

    public void setAgilite(int agilite) {
        this.agilite = agilite;
    }

    public int getChance() {
        return chance;
    }

    public void setChance(int chance) {
        this.chance = chance;
    }

    public int getEndurance() {
        return endurance;
    }

    public void setEndurance(int endurance) {
        this.endurance = endurance;
    }
    int force = 1;
    int agilite = 1;
    int chance = 1;
    int endurance = 1;

}
