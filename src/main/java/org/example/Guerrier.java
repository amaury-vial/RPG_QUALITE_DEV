package org.example;

public class Guerrier extends Joueur{
    public Guerrier(String nom ) {
        super(nom);
        this.setForce(30);
        this.setResistance(10);
    }

    @Override
    public void attaquespe() {
        System.out.println("Attaque spéciale !!");
        this.setForce(getForce()*2);

    }
}
