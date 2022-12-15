package org.example;
import java.util.*;
import java.util.Collections;

/**
 * La classe Game représente le jeu et comprend les informations sur le joueur et les adversaires.
 * Elle contient des méthodes pour lancer le jeu, ajouter des monstres et trier les méchants.
 */
//Classe afin de lancer le jeu
public class Game {
    private Joueur joueur;
    private List<Adversaire> adversaires;

    /**
     * Getter pour obtenir les adversaires.
     *
     * @return Liste des adversaires
     */
    public List<Adversaire> getAdversaires() {
        return adversaires;
    }


    public Game(Joueur joueur){
        this.joueur = joueur;
        this.adversaires = new ArrayList<>();
    }

    /**
     * La méthode trierMechant permet de trier les adversaires selon leur force.
     *
     * @param adversaires Liste des adversaires
     */
    public void trierMechant (List <Adversaire> adversaires) {
        for (int i = 0; i < adversaires.size(); i++) {
            for (int j = 0; j < adversaires.size() - i - 1; j++) {
                if (adversaires.get(j).getForce() > adversaires.get(j + 1).getForce()) {
                    Collections.swap(adversaires, j, j + 1);
                }
            }
        }

    }
    /**
     * Constructeur pour initialiser la liste des adversaires.
     *
     * @param adversaires Liste des adversaires
     */
    public Game(List<Adversaire> adversaires) {

        this.adversaires = adversaires;
    }

    /**
     * La méthode ajouterMonstre permet d'ajouter des monstres à la liste des adversaires.
     *
     * @param test Liste des adversaires
     * @param mechant1 Adversaire 1
     * @param mechant2 Adversaire 2
     * @param mechant3 Adversaire 3
     * @param mechant4 Adversaire 4
     * @param mechant5 Adversaire 5
     */
    public void ajouterMonstre (List <Adversaire> test, Adversaire mechant1 ,Adversaire mechant2 , Adversaire mechant3 , Adversaire mechant4 ,Adversaire mechant5  )
    {
        test.add(mechant1);
        test.add(mechant2);
        test.add(mechant3);
        test.add(mechant4);
        test.add(mechant5);

    }

    /**
     * La méthode start permet de lancer le jeu.
     */

    public void start(){
        System.out.println("Bienvenue dans L'Âme des Ténèbres "+joueur.getNom());
        while(true){
            System.out.println("Veuillez choisir une action:");
            System.out.println("1. Explorer");
            System.out.println("2. Afficher le statut du joueur");
            System.out.println("3. Boutique ");
            System.out.println("4. Quitter");
            Scanner in = new Scanner(System.in);
            int choice = in.nextInt();
            if(choice == 1){
                Exploration.explore(joueur , adversaires);
            } else if(choice == 2){
                joueur.printStatus();
            } else if(choice == 3){
                Boutique.boutique(joueur);
            }
            else if(choice==4)
            {
                break;
            }
            else {
                System.out.println("Veuillez entrer une option valide!");
            }
        }
    }






}