package org.example;

/**
 * Classe abstraite pour initialiser le joueur.
 */
//Classe pour initialiser le joueur
abstract public class Joueur extends  Personnage {
    private int or ;
    private int niveau;
    private int experience;

    private int nbPetitePotion;
    private int nbMoyennePotion;
    private int nbGrandePotion;

    /**
     * Méthode pour définir le nombre de petites potions.
     *
     * @param nbPetitePotion Le nombre de petites potions.
     */

    public void setNbPetitePotion(int nbPetitePotion) {
        this.nbPetitePotion = nbPetitePotion;
    }

    /**
     * Méthode pour définir le nombre de moyennes potions.
     *
     * @param nbMoyennePotion Le nombre de moyennes potions.
     */
    public void setNbMoyennePotion(int nbMoyennePotion) {
        this.nbMoyennePotion = nbMoyennePotion;
    }

    /**
     * Méthode pour définir le nombre de grandes potions.
     *
     * @param nbGrandePotion Le nombre de grandes potions.
     */
    public void setNbGrandePotion(int nbGrandePotion) {
        this.nbGrandePotion = nbGrandePotion;
    }

    /**
     * Méthode pour récupérer le nombre de petites potions.
     *
     * @return Le nombre de petites potions.
     */
    public int getNbPetitePotion() {
        return nbPetitePotion;
    }

    /**
     * Méthode pour récupérer le nombre de moyennes potions.
     *
     * @return Le nombre de moyennes potions.
     */
    public int getNbMoyennePotion() {
        return nbMoyennePotion;
    }

    /**
     * Méthode pour récupérer le nombre de grandes potions.
     *
     * @return Le nombre de grandes potions.
     */
    public int getNbGrandePotion() {
        return nbGrandePotion;
    }

    /**
     * Constructeur qui prend en paramètre un nom.
     *
     * @param nom Le nom du joueur.
     */
    public Joueur(String nom ) {
        super(nom );

        this.or = 0;
        this.niveau = 1;
        this.experience = 0;

    }

    /**
     * Méthode pour définir l'or.
     *
     * @param or Le montant d'or.
     */
    public void setOr(int or) {
        this.or = or;
    }

    /**
     * Méthode pour définir le niveau.
     *
     * @param niveau Le niveau du joueur.
     */
    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    /**
     * Méthode pour définir l'expérience.
     *
     * @param experience L'expérience du joueur.
     */
    public void setExperience(int experience) {
        this.experience = experience;
    }

    /**
     * Méthode pour récupérer l'or.
     *
     * @return Le montant d'or.
     */
    public int getOr() {
        return or;
    }

    /**
     * Méthode pour récupérer le niveau.
     *
     * @return Le niveau du joueur.
     */
    public int getNiveau() {
        return niveau;
    }

    /**
     * Méthode pour récupérer l'expérience.
     *
     * @return L'expérience du joueur.
     */
    public int getExperience() {
        return experience;
    }


    /**
     * Méthode pour gagner de l'expérience.
     *
     * @param nbNiveau Le nombre de niveaux gagnés.
     */

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

    /**
     * Méthode pour afficher les informations du joueur.
     */
    public void printStatus(){
        System.out.println("Nom: " +getNom());
        System.out.println("Santé: " + getSante());
        System.out.println("Attaque: " + getForce());
        System.out.println("Défense: " + getResistance());
        System.out.println("Or: " + getOr());
        System.out.println("Expérience: " + getExperience());
        System.out.println("Niveau: " + getNiveau());
    }

    /**
     * Méthode abstraite pour définir l'attaque spéciale du joueur.
     */
    abstract public void attaqueSpe();




}