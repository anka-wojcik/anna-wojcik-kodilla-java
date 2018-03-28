package com.kodilla.exception.test;


public class ExceptionHandling {

    public static void main(String[] args) {

        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            System.out.println(secondChallenge.probablyIWillThrowException(2.0, 2.0));
        } catch (Exception e) {
            System.out.println("Error, you cannot use numbers from ranges: x >= 2, x < 1, y = 1.5");
        } finally {
            System.out.println("\nEnd of program.");
        }
    }
}
