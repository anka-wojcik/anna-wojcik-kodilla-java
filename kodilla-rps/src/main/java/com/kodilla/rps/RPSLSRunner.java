package com.kodilla.rps;

public class RPSLSRunner {

    public static void main(String[] args) {

        boolean end = false;
        Game game = new Game();
        ConsoleInteractions consoleInteractions = new ConsoleInteractions();

        while(!end) {
            game.gameRunner();
            end = consoleInteractions.exitGameOrStartNewGame();
        }
    }
}
