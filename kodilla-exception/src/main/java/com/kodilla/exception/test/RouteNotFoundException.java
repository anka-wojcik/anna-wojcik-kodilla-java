package com.kodilla.exception.test;

public class RouteNotFoundException extends Exception {

    public RouteNotFoundException () {
        System.out.println("Route not found.\n ");
    }

}
