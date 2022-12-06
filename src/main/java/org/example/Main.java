package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        while (test.pointsAttribuer != 0)
        {
            System.out.println("Combien de points pour l'endurance ?");
            int pointsEndurance = sc.nextInt();
            Djib.endurance += pointsEndurance;
            Djib.pointsAttribuer -= pointsEndurance;

            System.out.println("Combien de points pour la force ?");
            int pointsForce= sc.nextInt();
            Djib.force += pointsForce;
            Djib.pointsAttribuer -= pointsForce;

            System.out.println("Combien de points pour la chance ?");
            int pointsChance = sc.nextInt();
            Djib.chance += pointsChance;
            Djib.pointsAttribuer -= pointsChance;

            System.out.println("Combien de points pour l'agilité ?");
            int pointsA = sc.nextInt();
            Djib.endurance += pointsEndurance;
            Djib.pointsAttribuer -= pointsEndurance;
            if ( Djib.pointsAttribuer == 0)
                break;

        }

    }
}