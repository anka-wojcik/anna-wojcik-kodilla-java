package com.kodilla.exception.test;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean end = false;
        while(!end) {
            System.out.println("Enter destination - city name.");
            Scanner scanner = new Scanner(System.in);
            String chosenDestination = scanner.nextLine().toUpperCase();
            System.out.println("\nSearching for possible airports in this location. Please wait.\n ");

            Flight flight1 = new Flight("Warsaw Chopin", chosenDestination);
            FlightSearch flightSearch = new FlightSearch();
            try {
                flightSearch.findFlight(flight1);
            } catch (RouteNotFoundException e) {

            }finally {
                System.out.println("Search finished. Do you wish to begin the new search? [y/n]");
                Scanner scanner1 = new Scanner(System.in);
                String choice = scanner1.nextLine().toLowerCase();
                if(choice.equals("n")){
                    end = true;
                }
            }
        }
        System.out.println("End of search.");
    }
}
