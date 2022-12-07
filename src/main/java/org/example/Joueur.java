package org.example;

public class Joueur extends Personnage {

    public Joueur(String nom, String sexe, int age, int taille, int PV, int moral, int niveau) {
        super(nom, sexe, age, taille, PV, moral, niveau);
    }

    @Override
    public void attaqueSpé() {

    }

    public int pointsAttribuer = 20;

    public int getPointsAttribuer() {
        return pointsAttribuer;
    }

    public void setPointsAttribuer(int pointsAttribuer) {
        this.pointsAttribuer = pointsAttribuer;
    }

    String classe;

    public Joueur(String nom, String sexe, int age, int taille, int PV, int moral, int niveau, int pointsAttribuer, String classe, int force, int agilite, int chance, int vitesse) {
        super(nom, sexe, age, taille, PV, moral, niveau);
        this.pointsAttribuer = pointsAttribuer;
        this.classe = classe;
        this.force = force;
        this.agilite = agilite;
        this.chance = chance;
        this.vitesse = vitesse;
    }

    int force;
    int agilite;
    int chance;

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
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

    public int getVitesse() {
        return vitesse;
    }

    public void setVitesse(int vitesse) {
        this.vitesse = vitesse;
    }

    int vitesse;




}
