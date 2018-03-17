package com.kodilla.testing.collection;

import java.util.*;

public class OddNumbersExterminator {

    ArrayList<Integer> oddNumbersExterminated;

    public OddNumbersExterminator(){
        oddNumbersExterminated = new ArrayList<Integer>();
    }

    public ArrayList exterminate(ArrayList<Integer> numbers){
        ArrayList<Integer> oddNumbersExterminated = new ArrayList<Integer>();
        for(Integer checkNumber: numbers) {
            if (checkNumber != null) {
                if (checkNumber % 2 == 0) {
                    oddNumbersExterminated.add(checkNumber);
                }
            } else {
                System.out.println("The list is empty. Please add numbers to the list.");
            }

        }
        return oddNumbersExterminated;
    }
}
