package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Joueur perso = new Joueur("Djibril" , 'H' , 17 , 156 , 'G');
        Commencer.creationJoueur(perso);
        Adversaire Dragon = new Adversaire("Dragonard", 'H', 150000, 1000, 'D' , (perso.force)/2 , perso.chance/2, perso.agilite/5 );

        System.out.println("Que veux tu faire ? 1 pour lancer un combat 2 pour quitter le jeu (ton personnage sera supprimé)");
        Scanner sc = new Scanner(System.in);
        int choix = sc.nextInt();
        if (choix == 1)
        {
            Combat.attaquer(perso , Dragon);

        }


    }
}