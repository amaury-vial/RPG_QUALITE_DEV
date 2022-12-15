package org.example;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
/**
 * Description
 *
 * @author Ramdani DJibril, Sarti Alex, Vial Amaury
 *
 */


public class Main {
    public static void main(String[] args){
        Joueur Perso ;
        System.out.println("Salut jeune aventurier!");
        System.out.println("Quel est ton nom ?");
        Scanner sc = new Scanner(System.in);
        String prenom = sc.nextLine();
        System.out.println("Quelle classe veux tu ? " + prenom);
        System.out.println(" 'A' pour l'archer et 'G' pour le Guerrier (attention aux majuscules)");

        char classe = sc.next().charAt(0);
        while (classe != 'G' && classe != 'A' )
        {
            System.out.println("Veuillez choisir une classe proposée! ");
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


        Adversaire mechant1 = new Adversaire("Sephiroth" ,  15, 2);
        Adversaire mechant2 = new Adversaire("Thanatos" , 30 , 0);
        Adversaire mechant3 = new Adversaire("Vader" , 0 , 5);
        Adversaire mechant4 = new Adversaire("Sauron" , 14 , 6);
        Adversaire mechant5 = new Adversaire("Adam Smasher" , 20 , 20);
         ArrayList<Adversaire> test =new ArrayList<Adversaire>();
         test.add(mechant1);
            Game game = new Game(Perso);
            game.ajouterMonstre(test, mechant1 , mechant2 ,  mechant3 ,  mechant4 , mechant5 );
            game.trierMechant(test);


        game.start();
    }


}