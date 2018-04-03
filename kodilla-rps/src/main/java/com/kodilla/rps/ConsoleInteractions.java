package com.kodilla.rps;

import java.util.*;

public class ConsoleInteractions {

    Scanner scanner = new Scanner(System.in);

    public String getHumanName() {
        String humanName;
        if(scanner.hasNextLine()) {
             humanName = scanner.nextLine();
        } else {
            System.out.println("You didn't enter your name. For this game you shall be called: Player1");
            humanName = "Player1";
        }
        return humanName;
    }

    public Weapon getWeapon() {

        Integer humanWeapon = 0;
        boolean wrongInput = true;

        Map<Integer, Weapon> buttonChoices = new HashMap<>();
        buttonChoices.put(1, Weapon.ROCK);
        buttonChoices.put(2, Weapon.PAPER);
        buttonChoices.put(3, Weapon.SCISSORS);
        buttonChoices.put(4, Weapon.LIZARD);
        buttonChoices.put(5, Weapon.SPOCK);

        do {
            System.out.println("\nChoose your weapon!");
            try {
                humanWeapon = scanner.nextInt();
                if(humanWeapon >= 1 && humanWeapon <= 5) {
                    wrongInput = false;
                }else {
                    System.out.println("Oh! You seem to have pressed the wrong key. Try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Oh! You seem to have pressed the wrong key. Try again.");
                scanner.next();
            }
        } while (wrongInput);
        return buttonChoices.get(humanWeapon);
    }

    public int chooseNumberOfRounds() {
        int numberOfGameRounds = 0;
        boolean wrongInput2 = true;

        do {
            try{
                numberOfGameRounds = scanner.nextInt();
                if(numberOfGameRounds <= 10) {
                    wrongInput2 = false;
                } else {
                    System.out.println("You'll get old playing so many rounds. Choose no more than 10.");
                }
            } catch (InputMismatchException e) {
                System.out.println("That's not a number! Choose again.");
                scanner.next();
            }
        } while (wrongInput2);
        return numberOfGameRounds;
    }

    public boolean exitGameOrStartNewGame() {
        String input = scanner.next().toLowerCase();
        if(input.equals("n")) {
            System.out.println("Are you sure you want to exit the current game and start a new one? [y/n]");
            input = scanner.next().toLowerCase();
            return !input.equals("y");
        }else {
            System.out.println("Are you sure you want to exit the game? [y/n]");
            input = scanner.next().toLowerCase();
            return input.equals("y");
        }
    }
}
