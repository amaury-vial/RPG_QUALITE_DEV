package org.example;

abstract public class Personnage {

    String nom;
    String sexe;
    int Age;
    int taille;
    int PV = 100;
    int Moral = 100;
    int Niveau = 1;

    public Personnage(String nom, String sexe, int age, int taille, int PV, int moral, int niveau) {
        this.nom = nom;
        this.sexe = sexe;
        Age = age;
        this.taille = taille;
        this.PV = PV;
        Moral = moral;
        Niveau = niveau;
    }
    int force = 1;
    int agilite = 1;
    int chance = 1;
    int endurance = 1;


    public void attaquer ()
    {

    }

    public void seSoigner ()
    {
        if (PV < 100)
            while (PV <100)
                PV ++;
        else
            System.out.println("Ta barre de santé est déja au max !");
    }


    abstract public void attaqueSpé ();


}