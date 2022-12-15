package org.example;
import java.util.*;
import java.util.Collections;


//Classe afin de lancer le jeu
public class Game {
    private Joueur joueur;
    private List<Adversaire> adversaires;

    public List<Adversaire> getAdversaires() {
        return adversaires;
    }

    public Game(Joueur joueur){
        this.joueur = joueur;
        this.adversaires = new ArrayList<>();
    }

    public void trierMechant (List <Adversaire> adversaires) {
        for (int i = 0; i < adversaires.size(); i++) {
            for (int j = 0; j < adversaires.size() - i - 1; j++) {
                if (adversaires.get(j).getForce() > adversaires.get(j + 1).getForce()) {
                    Collections.swap(adversaires, j, j + 1);
                }
            }
        }

    }

    public Game(List<Adversaire> adversaires) {
        this.adversaires = adversaires;
    }

    public void ajouterMonstre (List <Adversaire> test, Adversaire mechant1 ,Adversaire mechant2 , Adversaire mechant3 , Adversaire mechant4 ,Adversaire mechant5  )
    {
        test.add(mechant1);
        test.add(mechant2);
        test.add(mechant3);
        test.add(mechant4);
        test.add(mechant5);

    }


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