package org.example;

public class Main {
    public static void main(String[] args){
        Joueur joueur = new Joueur("John");
        Game game = new Game(joueur);
        game.addMonster(new Adversaire("Goblin"));
        game.addMonster(new Adversaire("Troll"));
        game.start();
    }


}