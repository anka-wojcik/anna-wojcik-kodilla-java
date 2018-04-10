package com.kodilla.rps;

public abstract class Player {

    private final String name;
    private int numberOfWonRounds = 0;

    public Player(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfWonRounds() {
        return numberOfWonRounds;
    }

    public abstract Weapon chooseWeapon();

    public void wonRound(Weapon playerChosenWeapon, String verb, Weapon opponentChosenWeapon) {
        System.out.println("\n" + playerChosenWeapon + verb + opponentChosenWeapon);
        System.out.println(getName() + " wins this round!");
        numberOfWonRounds++;
    }
}
