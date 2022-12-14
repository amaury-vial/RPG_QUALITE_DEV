package org.example;

import java.util.Scanner;

public class Combat {

    public void attaquer (Joueur test , Adversaire mechant)
    {
        int compteur = 0;
        while (test.PV != 0 && mechant.PV !=0)
        {
            if (compteur  % 2 == 0)
            {
                System.out.println("C'est à votre tour d'attaquer");
                System.out.println("Que voulez vous faire ?");
                Scanner sc = new Scanner(System.in);
                int choix = sc.nextInt();
                if (test.classe == 'G')
                {
                    System.out.println("1 pour un coup simple et 2 pour un coup puissant");
                    if (choix == 1)
                    {
                        mechant.PV -= mechant.PV;
                    } else if (choix == 2)
                    {
                        mechant.PV = mechant.PV - 5;
                    }
                }
                else if (test.classe == 'M')
                {
                    System.out.println("1 pour un coup de magie simple et 2 pour un coup de magie puissant");
                    if (choix == 1)
                    {
                        mechant.PV -= mechant.PV;
                    } else if (choix == 2)
                    {
                        mechant.PV = mechant.PV - 5;
                    }
                }
                else if (test.classe == 'V')
                {
                    System.out.println("1 pour un vol simple et 2 pour un vol puissant");
                    if (choix == 1)
                    {
                        mechant.PV -= mechant.PV;
                    } else if (choix == 2)
                    {
                        mechant.PV = mechant.PV - 5;
                    }
                }
                else if (test.classe == 'R')
                {
                    System.out.println("1 pour une attaque simple et 2 pour une attaque puissante");
                    if (choix == 1)
                    {
                        mechant.PV -= mechant.PV;
                    } else if (choix == 2)
                    {
                        mechant.PV = mechant.PV - 5;
                    }
                }
            else
                {
                    System.out.println("C'est au tour de l'adervsaire d'attaquer");
                    test.PV -= test.PV;
                }


            }
        }
    }

    public void utiliseObjet (Joueur test)
    {
        if(test.PV != 95)
        test.PV = test.PV +5;
    }


}
