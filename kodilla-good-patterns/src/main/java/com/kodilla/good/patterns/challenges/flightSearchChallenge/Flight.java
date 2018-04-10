package com.kodilla.good.patterns.challenges.flightSearchChallenge;

import java.time.LocalTime;

public class Flight {
    private String flightNumber;
    private String departureVenue;
    private LocalTime departureTime;
    private String arrivalVenue;
    private LocalTime arrivalTime;

    public Flight(String flightNumber, String departureVenue, LocalTime departureTime, String arrivalVenue, LocalTime arrivalTime) {
        this.flightNumber = flightNumber;
        this.departureVenue = departureVenue;
        this.departureTime = departureTime;
        this.arrivalVenue = arrivalVenue;
        this.arrivalTime = arrivalTime;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDepartureVenue() {
        return departureVenue;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public String getArrivalVenue() {
        return arrivalVenue;
    }

    public LocalTime getArrivalTime() {
        return arrivalTime;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightNumber='" + flightNumber + '\'' +
                ", departureVenue='" + departureVenue + '\'' +
                ", departureTime=" + departureTime +
                ", arrivalVenue='" + arrivalVenue + '\'' +
                ", arrivalTime=" + arrivalTime +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flight)) return false;
        Flight flight = (Flight) o;
        return flightNumber.equals(flight.flightNumber);
    }

    @Override
    public int hashCode() {
        return Integer.parseInt(flightNumber.substring(3, 5));
    }
}
