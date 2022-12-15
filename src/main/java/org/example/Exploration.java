package org.example;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Exploration {

    public static void explore(Joueur joueur, List<Adversaire> adversaires){
        int min = 1;
        int max = 3;
        Random random = new Random();
        int nb;
        nb = random.nextInt(max + min) + min;
        if(nb == 1){
            System.out.println("Il n'y a pas de monstres dans les environs!");
            System.out.println("Cependant , tu as récupré de l'or");
            joueur.setOr(joueur.getOr() + 10);
        }
        else if (nb ==2) {
            int choix1 = 0;
            int choix2 = adversaires.size()-1;
            int choixAdversaire = random.nextInt(choix2 + choix1) +choix1;
            Adversaire adversaire = adversaires.get(choixAdversaire);
            System.out.println("Vous êtes tombé sur " + adversaire.getNom() + "!");
            while (true) {
                System.out.println("Veuillez choisir une action:");
                System.out.println("1. Attaquer");
                System.out.println("2. Fuir");
                System.out.println("3. Prendre potion");
                Scanner in = new Scanner(System.in);
                int choice = in.nextInt();
                if (choice == 1) {
                    System.out.println("1. Attaque classique");
                    System.out.println("2. Attaque spéciale");
                    Scanner sc = new Scanner(System.in);
                    int choix_attaque = sc.nextInt();
                    if(choix_attaque == 1){
                        System.out.println("Vous avez attaqué le monstre!");
                        int degat = joueur.getForce() - adversaire.getResistance();
                        if (degat < 0) {
                            degat = 0;
                        }
                    } else if (choix_attaque == 2) {
                        joueur.attaquespe();
                        System.out.println("Vous avez attaqué le monstre avec une attaque spéciale");
                        int degat = joueur.getForce() - adversaire.getResistance();
                        if (degat < 0) {
                            degat = 0;
                        }
                    }
                    else {
                        System.out.println("Veuillez entrer une option valide!");
                    }

                    System.out.println("Vous avez attaqué le monstre!");
                    int degat = joueur.getForce() - adversaire.getResistance();
                    if (degat < 0) {
                        degat = 0;
                    }
                    adversaire.subirDegat(degat);
                    joueur.subirDegat(degat);
                    if (adversaire.getSante() <= 0) {
                        System.out.println("Vous avez vaincu le monstre!");
                        joueur.gainExperience(10);
                        joueur.setOr(joueur.getOr()+20);

                        break;
                    } else {
                        System.out.println("Le monstre est toujours en vie!");
                        System.out.println("Votre adversaire a " + adversaire.getSante() + " PV");
                        System.out.println("Vous avez "+joueur.getSante());
                        degat = adversaire.getForce() - joueur.getResistance();
                        if (degat < 0) {
                            degat = 0;
                        }
                       joueur.subirDegat(degat);
                        if (joueur.getSante() <= 0) {
                            System.out.println("Vous êtes mort!");
                            System.out.println("Votre aventure est terminée!");
                            System.exit(0);
                        }
                    }
                } else if (choice == 2) {
                    System.out.println("Vous avez fait fuire le monstre!");
                    break;
                }
                else if (choice == 3){
                    if (joueur.getSante()==100)
                    {
                        System.out.println("Tu as déja tout tes PV");
                    }
                    else
                        System.out.println("Que veux tu ?");
                    System.out.println("1. Petite potion "+ joueur.getNbPetitePotion());
                    System.out.println("2. Moyenne potion "+ joueur.getNbMoyennePotion());
                    System.out.println("3. Grande potion "+ joueur.getNbGrandePotion());
                    Scanner sc = new Scanner(System.in);
                    int choixPotion = sc.nextInt();
                    if (choixPotion == 1) {
                        if (joueur.getNbPetitePotion() > 0)
                            joueur.setSante(joueur.getSante() + 10);
                        if(joueur.getSante()>100) {
                            joueur.setSante(100);
                        }
                        else
                            System.out.println("Tu n'as pas de petite potion !");
                    }
                    else if (choixPotion == 2) {
                        if (joueur.getNbMoyennePotion() > 0)
                            joueur.setSante(joueur.getSante() + 50);
                        if (joueur.getSante() > 100){
                            joueur.setSante(100);
                            break;}

                        else{
                            System.out.println("Tu n'as pas de petite potion !");
                            break;}
                    }
                    else if (choixPotion== 3){
                        if(joueur.getNbGrandePotion() > 0)
                            joueur.setSante(joueur.getSante()+90);
                        if(joueur.getSante()>100)
                            joueur.setSante(100);
                        else System.out.println("Tu n'as pas de grande potion");
                        break;}


                }

                else {
                    System.out.println("Veuillez entrer une option valide!");
                }
            }

        }
        else

            System.out.println("Tu n'as rien trouvé ici");


    }
}
