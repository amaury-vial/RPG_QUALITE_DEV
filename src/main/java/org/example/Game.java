package org.example;
import java.util.*;

//Classe pour gérer le jeu
public class Game {
    private Player player;
    private List<Monster> monsters;

    public Game(Player player){
        this.player = player;
        this.monsters = new ArrayList<>();
    }

    public void addMonster(Monster monster){
        this.monsters.add(monster);
    }

    public void start(){
        System.out.println("Bienvenue dans mon jeu RPG!");
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
        if(this.monsters.isEmpty()){
            System.out.println("Il n'y a pas de monstres dans les environs!");
            return;
        }

        Monster monster = this.monsters.get(0);
        System.out.println("Vous êtes tombé sur un " + monster.getName() + "!");
        while(true){
            System.out.println("Veuillez choisir une action:");
            System.out.println("1. Attaquer");
            System.out.println("2. Fuir");
            Scanner in = new Scanner(System.in);
            int choice = in.nextInt();
            if(choice == 1){
                System.out.println("Vous avez attaqué le monstre!");
                int damage = this.player.getAttack() - monster.getDefense();
                if(damage < 0){
                    damage = 0;
                }
                monster.takeDamage(damage);
                if(monster.getHealth() <= 0){
                    System.out.println("Vous avez vaincu le monstre!");
                    this.player.gainExperience(10);
                    this.player.gainGold(monster.getGold());
                    this.monsters.remove(monster);
                    break;
                } else {
                    System.out.println("Le monstre est toujours en vie!");
                    damage = monster.getAttack() - this.player.getDefense();
                    if(damage < 0){
                        damage = 0;
                    }
                    this.player.takeDamage(damage);
                    if(this.player.getHealth() <= 0){
                        System.out.println("Vous êtes mort!");
                        System.out.println("Votre aventure est terminée!");
                        System.exit(0);
                    }
                }
            } else if(choice == 2){
                System.out.println("Vous avez fui le monstre!");
                break;
            } else {
                System.out.println("Veuillez entrer une option valide!");
            }
        }
    }

    public void printStatus(){
        System.out.println("Nom: " + this.player.getName());
        System.out.println("Santé: " + this.player.getHealth());
        System.out.println("Attaque: " + this.player.getAttack());
        System.out.println("Défense: " + this.player.getDefense());
        System.out.println("Or: " + this.player.getGold());
        System.out.println("Expérience: " + this.player.getExperience());
        System.out.println("Niveau: " + this.player.getLevel());
    }
}