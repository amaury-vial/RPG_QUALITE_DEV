package org.example;

import java.util.Scanner;

public class Boutique {

    public static void boutique(Joueur joueur)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Que voulez vous acheter ?");
        System.out.println("1 pour armes");
        System.out.println("2 pour armure");
        System.out.println("3 pour potion");
        int choix = sc.nextInt();
        if (choix ==1)
        {
            System.out.println("Quels types d'armes veux tu ?");
            System.out.println("1 :  épée en bois ( 10 or )");
            System.out.println("2 :  épée en fer ( 50 or )");
            System.out.println("3 :  épée en or ( 200 or )");
            int choixArmes = sc.nextInt();
            switch (choixArmes) {
                case 1:
                    if (joueur.getOr() >=10)
                    {
                        System.out.println("Vous avez désormais une épée en bois");
                        joueur.setOr(joueur.getOr() - 10);
                        joueur.setForce(joueur.getForce()+10);
                        break;

                    }
                    else
                        System.out.println("Vous n'avez pas assez d'or ");
                    break;
                case 2:
                    if (joueur.getOr() >=50)
                    {
                        System.out.println("Vous avez désormais une épée en argent");
                        joueur.setOr(joueur.getOr() - 50);
                        joueur.setForce(joueur.getForce()+20);
                        break;


                    }
                    else {
                        System.out.println("Vous n'avez pas assez d'or ");
                        break;

                    }
                case 3:

                    if (joueur.getOr() >=200)
                    {
                        System.out.println("Vous avez désormais une épée en or");
                        joueur.setOr(joueur.getOr() - 200);
                        joueur.setForce(joueur.getForce()+50);
                        break;

                    }
                    else
                        System.out.println("Vous n'avez pas assez d'or ");
                    break;

            }

        }
        else if (choix ==2)
        {
            System.out.println("Quels types d'armures veux tu ?");
            System.out.println("1 :  armure en bois");
            System.out.println("2 :  armure en fer");
            System.out.println("3 :  armure en or");
            int choixArmure = sc.nextInt();
            switch (choixArmure) {
                case 1:
                    if (joueur.getOr() >=10)
                    {
                        System.out.println("Vous avez désormais une armure en bois");
                        joueur.setOr(joueur.getOr() - 10);
                        joueur.setForce(joueur.getResistance()+10);
                        break;

                    }
                    else
                        System.out.println("Vous n'avez pas assez d'or ");
                    break;
                case 2:
                    if (joueur.getOr() >=50)
                    {
                        System.out.println("Vous avez désormais une amure en argent");
                        joueur.setOr(joueur.getOr() - 50);
                        joueur.setForce(joueur.getResistance()+20);
                        break;


                    }
                    else
                        System.out.println("Vous n'avez pas assez d'or ");
                    break;
                case 3:
                    if (joueur.getOr() >=200)
                    {
                        System.out.println("Vous avez désormais une armure en or");
                        joueur.setOr(joueur.getOr() - 200);
                        joueur.setForce(joueur.getResistance()+50);
                        break;

                    }
                    else
                        System.out.println("Vous n'avez pas assez d'or ");
                    break;
                default:
                    System.out.println("Veuimmez mettre une saisie correcte");
            }
        }
        else if(choix==3)
        {
            System.out.println("Quels types de potion veux tu ?");
            System.out.println("1 :  petite potion ");
            System.out.println("2 :  moyenne potion");
            System.out.println("3 :  grande potion");
            int choixPotion = sc.nextInt();
            switch (choixPotion) {
                case 1:
                    if (joueur.getOr() >=10)
                    {
                        System.out.println("Vous avez désormais une petite potion ");
                        joueur.setOr(joueur.getOr() - 10);
                        joueur.setNbPetitePotion(joueur.getNbPetitePotion()+1);
                        break;

                    }
                    else
                        System.out.println("Vous n'avez pas assez d'or ");
                    break;
                case 2:
                    if (joueur.getOr() >=50)
                    {
                        System.out.println("Vous avez désormais une moyenne potion");
                        joueur.setOr(joueur.getOr() - 50);
                        joueur.setNbMoyennePotion(joueur.getNbMoyennePotion()+1);
                        break;
                    }
                    else {
                        System.out.println("Vous n'avez pas assez d'or ");
                        break;

                    }
                case 3:

                    if (joueur.getOr() >=200)
                    {
                        System.out.println("Vous avez désormais une grande potion");
                        joueur.setOr(joueur.getOr() - 200);
                        joueur.setNbGrandePotion(joueur.getNbGrandePotion()+1);
                        break;

                    }
                    else
                        System.out.println("Vous n'avez pas assez d'or ");
                    break;

            }
        }

    }

}
