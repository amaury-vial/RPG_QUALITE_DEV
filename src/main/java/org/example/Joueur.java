package org.example;

//Classe pour initialiser le joueur
public class Joueur extends  Personnage {


    private int or ;
    private int niveau;
    private int experience;

    private int nbPetitePotion;
    private int nbMoyennePotion;
    private int nbGrandePotion;


    public void setNbPetitePotion(int nbPetitePotion) {
        this.nbPetitePotion = nbPetitePotion;
    }

    public void setNbMoyennePotion(int nbMoyennePotion) {
        this.nbMoyennePotion = nbMoyennePotion;
    }

    public void setNbGrandePotion(int nbGrandePotion) {
        this.nbGrandePotion = nbGrandePotion;
    }

    public int getNbPetitePotion() {
        return nbPetitePotion;
    }

    public int getNbMoyennePotion() {
        return nbMoyennePotion;
    }

    public int getNbGrandePotion() {
        return nbGrandePotion;
    }

    public Joueur(String nom ) {
        super(nom );

        this.or = 0;
        this.niveau = 1;
        this.experience = 0;

    }





    public void setOr(int or) {
        this.or = or;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getOr() {
        return or;
    }

    public int getNiveau() {
        return niveau;
    }

    public int getExperience() {
        return experience;
    }



    public void gainExperience(int nbNiveau){
        experience += nbNiveau;
        //si son expèrience atteint 100//
        if(this.experience >= 100){
            // il augmente de niveau  //
            this.niveau++;
            // et les stats avec //
            this.experience = 0;
            setForce(getForce() + 5);
            setResistance(getForce() + 5);

        }
        else
            System.out.println("Ne perd pas espoir. Tu augmenteras bientot de niveau");
    }

    public void printStatus(){
        System.out.println("Nom: " +getNom());
        System.out.println("Santé: " + getSante());
        System.out.println("Attaque: " + getForce());
        System.out.println("Défense: " + getResistance());
        System.out.println("Or: " + getOr());
        System.out.println("Expérience: " + getExperience());
        System.out.println("Niveau: " + getNiveau());
    }

}