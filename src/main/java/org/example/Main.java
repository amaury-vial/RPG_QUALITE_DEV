package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Player player = new Player("John");
        Game game = new Game(player);
        game.addMonster(new Monster("Goblin"));
        game.addMonster(new Monster("Troll"));
        game.start();
    }
}