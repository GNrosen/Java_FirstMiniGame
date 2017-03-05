package com.grantrosen;

import java.util.Scanner;

/**
 * Created by lilgbebe on 2/7/17.
 */
public class Player {

    private String name;
    private double health;
    private int attack;
    private int defense;




    public Player(){
        this("Default Name", 5, 1, 1);
    }


    public Player(String name, double health, int attack, int defense){
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.defense = defense;

    }

    public void playerName(int playerCount) {
        if (playerCount == 0) {
            Scanner inputName = new Scanner(System.in);
            System.out.println("Player One, please enter your name: ");
            String playerName = inputName.next();
            this.name = playerName;
        } else {
            Scanner inputName = new Scanner(System.in);
            System.out.println("Player Two, please enter your name: ");
            String playerName = inputName.next();
            this.name = playerName;
        }
    }


    public void playerAttack() {
        Scanner playerAttackChoice = new Scanner(System.in);
        System.out.println(getName() + " enter an attack number between 1 and 3: ");
        int playerChoice = playerAttackChoice.nextInt();
        if ((playerChoice > 3) || (playerChoice < 1)){
            playerAttack();
        } else {
            this.attack = playerChoice;

        }


    }

    public void playerDefense() {
        Scanner playerDefenseChoice = new Scanner(System.in);
        System.out.println(getName() + " enter a defense number between 1 and 3: ");
        int playerChoice = playerDefenseChoice.nextInt();
        if ((playerChoice > 3) || (playerChoice < 1)){
            playerDefense();
        } else {
            this.defense = playerChoice;
        }
    }

    public void playerHealthCalculations(int attack, int defense, double health, String attackerName, String defenderName) {
        if (attack == defense){
            System.out.println(attackerName + " did no damage to " + defenderName);
        } else {
            System.out.println(attackerName + " did 1 point of damage to " + defenderName);
            this.health -= 1;
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }
}
