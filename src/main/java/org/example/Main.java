package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Joueur Perso ;
        System.out.println("Salut jeune aventurier!");
        System.out.println("Quel est ton nom ?");
        Scanner sc = new Scanner(System.in);
        String prenom = sc.nextLine();
        System.out.println("Quelle classe veux tu ?");
        char classe = sc.next().charAt(0);
        while (classe != 'G' && classe != 'A' )
        {
            System.out.println("Veuillez choisir une classe proposée ! A pour Archer et G pour guerrier ( Attention aux majuscules ! )");
            classe = sc.next().charAt(0);
        }
        switch (classe) {
            case 'G':
                Perso = new Guerrier(prenom);
                break;
            default:
                Perso = new Archers(prenom);
                break;

        }

        Game game = new Game(Perso);
        Adversaire mechant1 = new Adversaire("Sephiroth");
        Adversaire mechant2 = new Adversaire("Thanatos");
        Adversaire mechant3 = new Adversaire("Vader");
        Adversaire mechant4 = new Adversaire("Sauron");
        Adversaire mechant5 = new Adversaire("Adam Smasher");
        game.ajouterMonstre( mechant1 , mechant2 ,  mechant3 ,  mechant4 , mechant5 );


        game.start();
    }


}