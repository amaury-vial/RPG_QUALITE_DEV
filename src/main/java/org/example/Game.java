package org.example;
import java.util.*;

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



    public Game(List<Adversaire> adversaires) {
        this.adversaires = adversaires;
    }

    public void ajouterMonstre (Adversaire mechant1 ,Adversaire mechant2 , Adversaire mechant3 , Adversaire mechant4 ,Adversaire mechant5  )
    {
        this.adversaires.add(mechant1);
        this.adversaires.add(mechant2);
        this.adversaires.add(mechant3);
        this.adversaires.add(mechant4);
        this.adversaires.add(mechant5);

    }


    public void start(){
        System.out.println("Bienvenue dans L'Âme des Ténèbres "+joueur.getNom());
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
        int min = 1;
        int max = 3;
        Random random = new Random();
        int nb;
        nb = random.nextInt(max + min) + min;
        if(nb == 1){
            System.out.println("Il n'y a pas de monstres dans les environs!");
            System.out.println("Cepedant , tu as récupré de l'or");
            joueur.setOr(joueur.getOr() + 10);
            return;
        }
        else if (nb ==2) {
            Adversaire adversaire = this.adversaires.get(0);
            System.out.println("Vous êtes tombé sur un " + adversaire.getNom() + "!");
            while (true) {
                System.out.println("Veuillez choisir une action:");
                System.out.println("1. Attaquer");
                System.out.println("2. Fuir");
                System.out.println("3. Prendre potion");
                Scanner in = new Scanner(System.in);
                int choice = in.nextInt();
                if (choice == 1) {
                    System.out.println("Vous avez attaqué le monstre!");
                    int degat = this.joueur.getForce() - adversaire.getResistance();
                    if (degat < 0) {
                        degat = 0;
                    }
                    adversaire.subirDegat(degat);
                    if (adversaire.getSante() <= 0) {
                        System.out.println("Vous avez vaincu le monstre!");
                        this.joueur.gainExperience(10);
                        this.adversaires.remove(adversaire);
                        break;
                    } else {
                        System.out.println("Le monstre est toujours en vie!");
                        System.out.println("Votre adversaire a " + adversaire.getSante() + " PV");
                        degat = adversaire.getForce() - this.joueur.getResistance();
                        if (degat < 0) {
                            degat = 0;
                        }
                        this.joueur.subirDegat(degat);
                        if (this.joueur.getSante() <= 0) {
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
                        System.out.println("Tu as déja tout tes Pv");
                    }
                    else
                        System.out.println("Tes PV ont augmentés");
                        joueur.setSante(joueur.getSante()+10);
                }

                else {
                    System.out.println("Veuillez entrer une option valide!");
                }
                }

        }
        else

                System.out.println("Tu n'as rien trouvé ici");


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