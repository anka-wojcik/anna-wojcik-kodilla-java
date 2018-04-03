package com.kodilla.rps;

public class Game {

    public void gameRunner() {

        System.out.println("Hello mighty warrior. You're about to engage in a challenging game of Rock-Scissors-Paper-Lizard-Spock. \nPlease enter your name.");
        final Player computerPlayer = new ComputerPlayer();
        final ConsoleInteractions consoleInteractions = new ConsoleInteractions();
        final Player humanPlayer1 = new HumanPlayer(consoleInteractions.getHumanName(), consoleInteractions);


        System.out.println("Please choose number of game rounds.");
        final int numberOfGameRounds = consoleInteractions.chooseNumberOfRounds();


        System.out.println("Possible weapon choices - type number from 1 to 5: " +
                "\n1 - Rock" +
                "\n2 - Paper" +
                "\n3 - Scissors" +
                "\n4 - Lizard" +
                "\n5 - Spock");
        int number = 0;
        while(number < numberOfGameRounds) {
            Weapon humanChosenWeapon = humanPlayer1.chooseWeapon();
            System.out.println(humanPlayer1.getName() + ", your chosen weapon is: " + humanChosenWeapon);

            Weapon computerChosenWeapon = computerPlayer.chooseWeapon();
            System.out.println("Your opponent's chosen weapon is: " + computerChosenWeapon);

            String verb;

            if((verb = humanChosenWeapon.beats(computerChosenWeapon)) != null) {
                humanPlayer1.wonRound(humanChosenWeapon, verb, computerChosenWeapon);
                number++;
            } else if((verb = computerChosenWeapon.beats(humanChosenWeapon)) != null) {
                computerPlayer.wonRound(computerChosenWeapon, verb, humanChosenWeapon);
                number++;
            } else {
                System.out.println("It's a tie!");
                number++;
            }
            System.out.println("\nCurrent scores at the end of round no. " + number + ":\n" + humanPlayer1.getName() + ": " + humanPlayer1.getNumberOfWonRounds());
            System.out.println(computerPlayer.getName() + ": " + computerPlayer.getNumberOfWonRounds());
        }

        System.out.println("\n" + humanPlayer1.getName() + "'s final score is: " + humanPlayer1.getNumberOfWonRounds());
        System.out.println(computerPlayer.getName() + "'s final score is: " + computerPlayer.getNumberOfWonRounds());
        if(humanPlayer1.getNumberOfWonRounds() > computerPlayer.getNumberOfWonRounds()) {
            System.out.println("Congratulations! You've won the game!");
        } else if(computerPlayer.getNumberOfWonRounds() > humanPlayer1.getNumberOfWonRounds()) {
            System.out.println("Unfortunately you've lost the game. Good luck next time!");
        }else {
            System.out.println("It's a tie!");
        }
        System.out.println("For exiting game press 'x'. For starting a new game press 'n'.");
    }
}
