package org.example;

abstract public class Personnage {

    String nom;
    char sexe;
    int Age;
    int taille;
    int PV;

    public Personnage(String nom, char sexe, int age, int taille, char classe) {
        this.nom = nom;
        this.sexe = sexe;
        Age = age;
        this.taille = taille;
        this.PV = 100;
        Moral = 100;
        Niveau = 1;
        this.force = 1;
        this.chance = 1;
        this.agilite = 1;
        this.classe = classe;
    }

    protected int Moral;
    protected int Niveau;
    protected float vitesse;
    protected float force;
    protected float chance;
    protected float agilite;
    char classe;

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setSexe(char sexe) {
        this.sexe = sexe;
    }

    public void setAge(int age) {
        Age = age;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

    public void setPV(int PV) {
        this.PV = PV;
    }

    public void setMoral(int moral) {
        Moral = moral;
    }

    public void setNiveau(int niveau) {
        Niveau = niveau;
    }

    public void setVitesse(float vitesse) {
        this.vitesse = vitesse;
    }

    public void setForce(float force) {
        this.force = force;
    }

    public void setChance(float chance) {
        this.chance = chance;
    }

    public void setAgilite(float agilite) {
        this.agilite = agilite;
    }

    public void setClasse(char classe) {
        this.classe = classe;
    }

    @Override
    public String toString() {
        return "Personnage{" +
                "nom='" + nom + '\'' +
                ", sexe='" + sexe + '\'' +
                ", Age=" + Age +
                ", taille=" + taille +
                ", PV=" + PV +
                ", Moral=" + Moral +
                ", Niveau=" + Niveau +
                ", vitesse=" + vitesse +
                ", force=" + force +
                ", chance=" + chance +
                ", agilité=" + agilite +
                ", classe='" + classe + '\'' +
                '}';
    }
}