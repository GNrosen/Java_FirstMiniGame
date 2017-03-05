package com.grantrosen;

public class Main {

    public static void main(String[] args) {

        int playerCount = 0;

        Player playerOne = new Player();

        Player playerTwo = new Player();



        playerOne.playerName(playerCount);
        playerCount++;
        playerTwo.playerName(playerCount);
        playerCount++;

        System.out.println("Players: " + playerOne.getName() + " and " + playerTwo.getName() + ".");


        while ((playerOne.getHealth() != 0) || (playerTwo.getHealth() != 0)) {
            System.out.println("****************************");
            playerOneAttack(playerOne, playerTwo);
            if (playerOne.getHealth() == 0) {
                System.out.println("Game Over " + playerTwo.getName() + " wins!");
                break;
            } else if (playerTwo.getHealth() == 0) {
                System.out.println("Game Over " +playerOne.getName() + " wins!");
                break;
            }
            System.out.println("****************************");
            playerTwoAttack(playerOne, playerTwo);
            if (playerOne.getHealth() == 0) {
                System.out.println("Game Over " + playerTwo.getName() + " wins!");
                break;
            } else if (playerTwo.getHealth() == 0) {
                System.out.println("Game Over " +playerOne.getName() + " wins!");
                break;
            }
        }

    }

    public static void playerOneAttack(Player playerOne, Player playerTwo) {
        playerOne.playerAttack();

        playerTwo.playerDefense();

        System.out.println(playerOne.getName() + "'s attack choice is " + playerOne.getAttack() + ".");
        System.out.println(playerTwo.getName() + "'s defense choice is " + playerTwo.getDefense() +".");

        playerTwo.playerHealthCalculations(playerOne.getAttack(), playerTwo.getDefense(), playerTwo.getHealth(), playerOne.getName(), playerTwo.getName());

        System.out.println(playerOne.getName() + "'s health is now " + playerOne.getHealth());
        System.out.println(playerTwo.getName() + "'s health is now " + playerTwo.getHealth());
    }

    public static void playerTwoAttack(Player playerOne, Player playerTwo) {
        playerTwo.playerAttack();

        playerOne.playerDefense();

        System.out.println(playerTwo.getName() + "'s attack choice is " + playerTwo.getAttack() + ".");
        System.out.println(playerOne.getName() + "'s defense choice is " + playerOne.getDefense() +".");

        playerOne.playerHealthCalculations(playerTwo.getAttack(), playerOne.getDefense(), playerOne.getHealth(), playerTwo.getName(), playerOne.getName());

        System.out.println(playerOne.getName() + "'s health is now " + playerOne.getHealth());
        System.out.println(playerTwo.getName() + "'s health is now " + playerTwo.getHealth());
    }
}


