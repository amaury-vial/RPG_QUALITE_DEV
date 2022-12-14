package org.example;
import java.util.*;

//Classe pour gérer le jeu
public class Game {
    private Joueur joueur;
    private List<Adversaire> adversaires;

    public Game(Joueur joueur){
        this.joueur = joueur;
        this.adversaires = new ArrayList<>();
    }

    public void addMonster(Adversaire adversaire){
        this.adversaires.add(adversaire);
    }

    public void start(){
        System.out.println("Bienvenue dans L'Âme des Ténèbres!");
        while(true){
            System.out.println("Veuillez choisir une action:");
            System.out.println("1. Explorer");
            System.out.println("2. Afficher le status du joueur");
            System.out.println("3. Quitter");
            Scanner in = new Scanner(System.in);
            int choice = in.nextInt();
            if(choice == 1){
                explore();
            } else if(choice == 2){
                printStatus();
            } else if(choice == 3){
                break;
            } else {
                System.out.println("Veuillez entrer une option valide!");
            }
        }
    }

    public void explore(){
        if(this.adversaires.isEmpty()){
            System.out.println("Il n'y a pas de monstres dans les environs!");
            return;
        }

        Adversaire adversaire = this.adversaires.get(0);
        System.out.println("Vous êtes tombé sur un " + adversaire.getNom() + "!");
        while(true){
            System.out.println("Veuillez choisir une action:");
            System.out.println("1. Attaquer");
            System.out.println("2. Fuir");
            Scanner in = new Scanner(System.in);
            int choice = in.nextInt();
            if(choice == 1){
                System.out.println("Vous avez attaqué le monstre!");
                int degat = this.joueur.getForce() - adversaire.getResistance();
                if(degat < 0){
                    degat = 0;
                }
                adversaire.subirDegat(degat);
                if(adversaire.getSante() <= 0){
                    System.out.println("Vous avez vaincu le monstre!");
                    this.joueur.gainExperience(10);
                    this.adversaires.remove(adversaire);
                    break;
                } else {
                    System.out.println("Le monstre est toujours en vie!");
                    degat = adversaire.getForce() - this.joueur.getResistance();
                    if(degat < 0){
                        degat = 0;
                    }
                    this.joueur.subirDegat(degat);
                    if(this.joueur.getForce() <= 0){
                        System.out.println("Vous êtes mort!");
                        System.out.println("Votre aventure est terminée!");
                        System.exit(0);
                    }
                }
            } else if(choice == 2){
                System.out.println("Vous avez fait fuire le monstre!");
                break;
            } else {
                System.out.println("Veuillez entrer une option valide!");
            }
        }
    }

    public void printStatus(){
        System.out.println("Nom: " + this.joueur.getNom());
        System.out.println("Santé: " + this.joueur.getSante());
        System.out.println("Attaque: " + this.joueur.getForce());
        System.out.println("Défense: " + this.joueur.getResistance());
        System.out.println("Or: " + this.joueur.getOr());
        System.out.println("Expérience: " + this.joueur.getExperience());
        System.out.println("Niveau: " + this.joueur.getNiveau());
    }
}