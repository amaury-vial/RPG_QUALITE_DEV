package org.example;

import java.util.Scanner;

public class Commencer {

    public static void creationJoueur (Joueur Perso )
    {
        System.out.println("Bonjour cher joueur !");
        System.out.println("Vous allez créer votre personnage");
        System.out.println("Quel est votre nom ?");
        Scanner sc = new Scanner(System.in);
        Scanner points = new Scanner(System.in);
        String prenom = sc.nextLine();
        System.out.println("Très bien " + prenom + ". C'est un très beau nom . Quel est votre age ?");
        int age = sc.nextInt();
        while (age < 13)
        {
            System.out.println("Tu es trop jeune pour ce jeu");
            age = sc.nextInt();

        }
        System.out.println("De quel sexe es-tu ? H pour Homme et F pour Femme (n'oublie pas la majuscule)");
        Scanner sc1 = new Scanner(System.in);
        char sexe = sc1.next().charAt(0);
        while (sexe !='H' && sexe !='F')
        {
            System.out.println("Soit H soit F");
            sexe = sc1.next().charAt(0);
        }

        System.out.println("On est presque bon. Quelle est ta taille ? (en cm)");
        int taille = sc.nextInt();
        if (taille < 130)
            System.out.println("Ok le nain");
        else if (taille > 190)
            System.out.println("Tu as déja songé au basket ?");
        System.out.println("Pour finir, quelle classe veux tu choisir ? G pour Guerrier , M pour Magicien , R pour Rodeur et V pour  Voleur (n'oublie pas la majuscule)");

        char classe = sc.next().charAt(0);
        while (classe != 'G' && classe != 'M' && classe != 'R' && classe != 'V')
        {
            System.out.println("Veuillez choisir une classe proposée!");
            classe = sc.next().charAt(0);
        }
        switch (classe) {
            case 'G' :
                Perso = new Guerrier(prenom , sexe , age , taille , classe);
                break;
            case 'M' :
                Perso = new Magicien(prenom , sexe , age , taille , classe);
                break;

            case 'R' :
                Perso = new Rôdeurs(prenom , sexe , age , taille , classe);
                break;



            default:
                Perso = new Voleurs(prenom , sexe , age , taille , classe);
        }
        System.out.println("Ok tout est bon pour nous");
        System.out.println("Place à l'attribution des points");
        System.out.println("Lorsque tu choisiras ou mettre tes points , 5 points seront attribués");



        while (Perso.pointsRestantsAAtribuer()) {
            System.out.println("Ou mettre tes points ? 1 pour agilité  , 2 pour chance , 3 pour force");
            System.out.println("Il te reste  " +Perso.pointsAAttribuer+" points");
            int statChoisi = sc.nextInt();


            switch (statChoisi) {
                case 1:
                    Perso.ajouterAgilite();
                    break;
                case 2:
                    Perso.ajouterChance();
                    break;
                case 3:
                    Perso.ajouterForce();

            }
        }

        System.out.println("Voici tes stats");
        System.out.println("Agilité " +Perso.agilite);
        System.out.println("Force " +Perso.force);
        System.out.println("Chance " +Perso.chance);
        System.out.println("");
        System.out.println("Félicitation tu as crée ton personnage");
        System.out.println("Place au jeu !");
        System.out.println(Perso.nom);

    }




}