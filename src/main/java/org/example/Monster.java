package org.example;
import java.util.*;

//Classe pour gérer un monstre
public class Monster {
    private String name;
    private int health;
    private int attack;
    private int defense;
    private int gold;

    public Monster(String name){
        this.name = name;
        this.health = 100;
        this.attack = 10;
        // SI le montre a 10 de defense et que le joueur a 10 d'attaque, aucun dégâts ne sera subit
        this.defense = 5;
        this.gold = 5;
    }

    public void takeDamage(int amount){
        this.health -= amount;
    }

    public int getHealth(){
        return this.health;
    }

    public String getName() {
        return name;
    }

    public int getAttack(){
        return this.attack;
    }

    public int getDefense(){
        return this.defense;
    }

    public int getGold(){
        return this.gold;
    }
}