package com.kodilla.rps;

import java.util.Random;

public class ComputerPlayer extends Player {

    private Weapon weaponList[] = Weapon.values();
    private Random listNumber = new Random();

    public ComputerPlayer() {
        super("Computer");
    }

    @Override
    public Weapon chooseWeapon() {
        return weaponList[listNumber.nextInt(weaponList.length)];
    }

}
