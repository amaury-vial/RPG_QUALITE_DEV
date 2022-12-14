package personnage;

import org.example.Joueur;
import org.example.Marcher;
import org.example.Metier;

public class Guerrier extends Joueur implements Marcher, Metier {

    public Guerrier(String nom, char sexe, int age, int taille, char classe) {
        super(nom, sexe, age, taille, classe);
        force +=10;
    }


    @Override
    public void appliquerStatsSpecifiques() {

    }
}
