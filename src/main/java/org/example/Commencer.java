package org.example;

import java.util.Scanner;

public class Commencer {

    public static void creationJoueur (String Test)
    {
        System.out.println("Bonjour cher joueur !");
        System.out.println("Vous allez créer votre personnage");
        System.out.println("Quel est votre nom ?");
        Scanner sc = new Scanner(System.in);
        Scanner points = new Scanner(System.in);
        String nom = sc.nextLine();
        System.out.println("Très bien " + nom + ". C'est un très beau nom . Quel est votre age ?");
        int age = sc.nextInt();
        if (age < 12)
        {
            System.out.println("Tu n'as pas l'âge nécéssaire pour jouer a ce jeu mais je vais faire une exception pour cette fois");
        }
        System.out.println("De quel sexe es-tu ?");
        Scanner sc1 = new Scanner(System.in);

        String sexe = sc1.nextLine();
        System.out.println("On est presque bon. Quelle est ta taille ? (en cm)");
        int taille = sc.nextInt();
        System.out.println("Pour finir, quelle classe veux tu choisir ?");
        System.out.println("Ok tout est bon pour nous");
        System.out.println("Place à l'attribution des points");
        Joueur test = new Joueur(Test , sexe , age , taille , 100 , 100 , 1);
    }


}
