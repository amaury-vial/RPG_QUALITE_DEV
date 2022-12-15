package org.example;

public class Archers extends Joueur {
    public Archers(String nom ) {
        super(nom);
        this.setForce(5);
        this.setResistance(35);
    }

    @Override
    public void attaquespe() {
        System.out.println("Attaque spéciale !!");
        this.setResistance(getResistance()*2);
    }
}
