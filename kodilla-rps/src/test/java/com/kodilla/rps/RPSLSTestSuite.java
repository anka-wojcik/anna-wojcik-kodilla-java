package com.kodilla.rps;

import junitparams.JUnitParamsRunner;
import org.junit.Assert;
import org.junit.Test;
import junitparams.Parameters;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class RPSLSTestSuite {

    @Test
    @Parameters({ "ROCK,SCISSORS" , "SCISSORS,PAPER", "PAPER,ROCK", "LIZARD,SPOCK", "SPOCK,ROCK" })
    public void testComputerWinsRound(Weapon s1, Weapon s2) {
        ComputerPlayer computerPlayer = new ComputerPlayer();
        String verb = s1.beats(s2);
        computerPlayer.wonRound(s1, verb, s2);
        Assert.assertEquals(1, computerPlayer.getNumberOfWonRounds());
    }

    @Test
    @Parameters({ "ROCK,SCISSORS" , "SCISSORS,PAPER", "PAPER,ROCK", "LIZARD,SPOCK", "SPOCK,ROCK" })
    public void testHumanWinsRound(Weapon s1, Weapon s2) {
        ConsoleInteractions humanInput = new ConsoleInteractions();
        HumanPlayer humanPlayer = new HumanPlayer("Anna", humanInput);
        String verb = s1.beats(s2);
        humanPlayer.wonRound(s1, verb, s2);
        Assert.assertEquals(1, humanPlayer.getNumberOfWonRounds());
    }
}
