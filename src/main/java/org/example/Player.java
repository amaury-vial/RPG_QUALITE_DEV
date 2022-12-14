package org.example;
import java.util.*;

//Classe pour gérer le joueur
public class Player {
    private String name;
    private int health;
    private int attack;
    private int defense;
    private int gold;
    private int experience;
    private int level;

    public Player(String name){
        this.name = name;
        this.health = 100;
        this.attack = 50;
        this.defense = 10;
        this.gold = 0;
        this.experience = 0;
        this.level = 1;
    }

    public void gainExperience(int amount){
        this.experience += amount;
        if(this.experience >= 100){
            this.level++;
            this.experience = 0;
            this.attack += 5;
            this.defense += 5;
        }
    }

    public void gainGold(int amount){
        this.gold += amount;
    }

    public void takeDamage(int amount){
        this.health -= amount;
    }

    public String getName(){
        return this.name;
    }

    public int getHealth(){
        return this.health;
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

    public int getExperience(){
        return this.experience;
    }

    public int getLevel(){
        return this.level;
    }
}

