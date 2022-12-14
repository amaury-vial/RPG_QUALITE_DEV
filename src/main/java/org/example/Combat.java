package org.example;

import java.util.Scanner;

public class Combat {

    public static void attaquer (Joueur test , Adversaire  mechant)
    {
        Scanner sc = new Scanner(System.in);
        int compteur = 0;
        while (test.PV != 0 || mechant.PV !=0)
        {
            if (compteur  % 2 == 0)
            {
                System.out.println("C'est à votre tour d'attaquer");
                System.out.println("Que voulez vous faire ?");
                if (test.classe == 'G')
                {
                    System.out.println("1 pour un coup simple et 2 pour un coup puissant");


                    int choix = sc.nextInt();
                    if (choix == 1)
                    {
                        mechant.PV -= mechant.PV;
                        System.out.println("Ton adversaire à perdu 1 PV");

                        compteur ++;
                    } else if (choix == 2)
                    {
                        mechant.PV = mechant.PV - 5;
                        System.out.println("Ton adversaire à perdu 5 PV");
                        compteur ++;

                    }
                }
                else if (test.classe == 'M')
                {
                    System.out.println("1 pour un coup de magie simple et 2 pour un coup de magie puissant");

                    int choix = sc.nextInt();


                    if (choix == 1)
                    {
                        mechant.PV -= mechant.PV;
                        System.out.println("Ton adversaire à perdu 1 PV");

                        compteur ++;

                    } else if (choix == 2)
                    {
                        mechant.PV = mechant.PV - 5;
                        System.out.println("Ton adversaire à perdu 5 PV");

                        compteur ++;

                    }
                }
                else if (test.classe == 'V')
                {
                    System.out.println("1 pour un vol simple et 2 pour un vol puissant");

                    int choix = sc.nextInt();


                    if (choix == 1)
                    {
                        mechant.PV -= mechant.PV;
                        System.out.println("Ton adversaire à perdu 1 PV");

                        compteur ++;

                    } else if (choix == 2)
                    {
                        mechant.PV = mechant.PV - 5;
                        System.out.println("Ton adversaire à perdu 5 PV");

                        compteur ++;

                    }
                }
                else {
                    System.out.println("1 pour un coup de rod simple et 2 pour un coup de rod puissant");



                    int choix = sc.nextInt();


                    if (choix == 1) {
                        mechant.PV -= mechant.PV;
                        System.out.println("Ton adversaire à perdu 5 PV");

                        compteur++;

                    } else if (choix == 2) {
                        mechant.PV = mechant.PV - 5;
                        System.out.println("Ton adversaire à perdu 5 PV");

                        compteur++;

                    }
                }
            }
            else
            {
                System.out.println("C'est au tour de l'adervsaire d'attaquer");
                test.PV -= test.PV;
                compteur ++;

            }



        }

    }

    public void utiliseObjet (Joueur test)
    {
        if(test.PV != 95)
            test.PV = test.PV +5;
    }


}