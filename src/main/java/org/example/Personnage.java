package org.example;

 public class Personnage {
    private String nom;


    private int sante;
    private int force ;
    private int resistance;


    public Personnage(String nom  ) {
        this.nom = nom;
        this.sante = 100;


    }




     public String getNom() {
        return nom;
    }

    public int getSante() {
        return sante;
    }

    public int getForce() {

        return force;
    }

    public int getResistance() {
        return resistance;
    }

     public void setNom(String nom) {
         this.nom = nom;
     }

     public void setSante(int sante) {
         this.sante = sante;
     }

     public void setForce(int force) {
         this.force = force;
     }

     public void setResistance(int resistance) {
         this.resistance = resistance;
     }

     public void subirDegat(int degatRecu) {
        this.sante -= degatRecu;
     }



}
