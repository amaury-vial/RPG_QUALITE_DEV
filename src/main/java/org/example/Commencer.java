package org.example;

import java.util.Scanner;

public class Commencer {

    public static void creationJoueur ()
    {
        System.out.println("Bonjour cher joueur !");
        System.out.println("Vous allez créer votre personnage");
        System.out.println("Quel est votre nom ?");
        Scanner sc = new Scanner(System.in);
        Scanner points = new Scanner(System.in);
        String nom = sc.nextLine();
        System.out.println("Très bien " + nom + ". C'est un très beau nom . Quel est votre age ?");
        int age = sc.nextInt();
        while (age < 13)
        {
                System.out.println("Tu es trop jeune pour ce jeu");
                 age = sc.nextInt();

        }
        System.out.println("De quel sexe es-tu ? H pour Homme et F pour Femme");
        Scanner sc1 = new Scanner(System.in);

        String sexe = sc1.nextLine();
        do
        {
            System.out.println("Soit H soit F !");
            sexe = sc1.nextLine();
        }
            while (sexe != "H"  || sexe !="F");

        System.out.println("On est presque bon. Quelle est ta taille ? (en cm)");
        int taille = sc.nextInt();
        if (taille < 130)
            System.out.println("Ok le nain");
        else if (taille > 190)
            System.out.println("Tu as déja songé au basket ?");
        System.out.println("Pour finir, quelle classe veux tu choisir ? G pour Guerrier , M pour Magicien , R pour Rodeur et V pour  Voleur");
        String classe = sc.nextLine();
        while (classe !="G" || classe !="M" || classe !="R" || classe!="V" )
        {
            System.out.println("Veuillez choisir une classe proposée!");
            classe = sc.nextLine();
        }
        System.out.println("Ok tout est bon pour nous");
        System.out.println("Place à l'attribution des points");
        System.out.println("Lorsque tu choisiras ou mettre tes points , 5 points seront attribués");

        Joueur test = new Joueur(nom , sexe , age , taille , classe);

        while (test.pointsRestantsAAtribuer()) {
            System.out.println("Ou mettre tes points ? 1 pour agilité  , 2 pour chance , 3 pour force");
            System.out.println("Il te reste 0 " +test.pointsRestantsAAtribuer());
            int statChoisi = sc.nextInt();


            switch (statChoisi) {
                case 1:
                    test.ajouterAgilite();
                    break;
                case 2:
                    test.ajouterChance();
                    break;
                case 3:
                    test.ajouterForce();

            }
        }
    }


}
