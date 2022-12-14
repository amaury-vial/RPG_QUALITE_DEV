package personnage;

public abstract  class Personnage {

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

    public String getNom() {
        return nom;
    }

    public char getSexe() {
        return sexe;
    }

    public int getAge() {
        return Age;
    }

    public int getTaille() {
        return taille;
    }

    public int getPV() {
        return PV;
    }

    public int getMoral() {
        return Moral;
    }

    public int getNiveau() {
        return Niveau;
    }

    public float getVitesse() {
        return vitesse;
    }

    public float getForce() {
        return force;
    }

    public float getChance() {
        return chance;
    }

    public float getAgilite() {
        return agilite;
    }

    public char getClasse() {
        return classe;
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