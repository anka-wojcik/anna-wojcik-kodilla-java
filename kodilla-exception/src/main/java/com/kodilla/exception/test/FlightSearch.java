package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FlightSearch {

    public void findFlight(Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> airportsDestinations = new HashMap<>();
        airportsDestinations.put("OSAKA KANSAI", true);
        airportsDestinations.put("TOKYO NARITA", true);
        airportsDestinations.put("WARSAW CHOPIN", false);
        airportsDestinations.put("TOKYO HANEDA", false);

        boolean checkIfDestinationExists = airportsDestinations.keySet().stream().anyMatch(checkDestination -> checkDestination.startsWith(flight.getArrivalAirport()));
        Map<String, Boolean> checkIfYouCanGoThere = airportsDestinations.entrySet().stream()
                .filter(e -> e.getKey().startsWith(flight.getArrivalAirport()))
                .filter(e -> e.getValue() == true)
                .collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue()));

        if(checkIfDestinationExists == false || checkIfYouCanGoThere.size() == 0){
            throw new RouteNotFoundException();
        }

        for (Map.Entry<String, Boolean> e : airportsDestinations.entrySet()) {
            if(e.getKey().startsWith(flight.getArrivalAirport()) & e.getValue()) {
                System.out.println("Flight possible to: " + e.getKey() + "\n");
            }
        }
    }
}

