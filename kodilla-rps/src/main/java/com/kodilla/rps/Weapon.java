package com.kodilla.rps;

import java.util.HashMap;
import java.util.Map;

public enum Weapon {
    ROCK, PAPER, SCISSORS, LIZARD, SPOCK;

    static {
        ROCK.willBeat(SCISSORS, " crushes ");
        ROCK.willBeat(LIZARD, " crushes ");
        PAPER.willBeat(ROCK, " covers ");
        PAPER.willBeat(SPOCK, " disproves ");
        SCISSORS.willBeat(PAPER, " cuts ");
        SCISSORS.willBeat(LIZARD, " decapitate ");
        LIZARD.willBeat(PAPER, " eats ");
        LIZARD.willBeat(SPOCK, " poisons ");
        SPOCK.willBeat(SCISSORS, " smashes ");
        SPOCK.willBeat(ROCK, " vaporizes ");
    }

    private final Map<Weapon, String> verbsAndMovesMap = new HashMap<>();

    private void willBeat(Weapon move, String verb) {
        verbsAndMovesMap.put(move, verb);
    }

    public String beats(Weapon move) {
        return verbsAndMovesMap.get(move);
    }

}
