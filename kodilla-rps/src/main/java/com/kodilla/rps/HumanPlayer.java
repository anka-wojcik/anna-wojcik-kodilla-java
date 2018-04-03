package com.kodilla.rps;

public class HumanPlayer extends Player {

    private ConsoleInteractions humanInput;

    public HumanPlayer(String name, ConsoleInteractions humanInput) {
        super(name);
        this.humanInput = humanInput;
    }

    @Override
    public Weapon chooseWeapon() {
        return humanInput.getWeapon();
    }
}
