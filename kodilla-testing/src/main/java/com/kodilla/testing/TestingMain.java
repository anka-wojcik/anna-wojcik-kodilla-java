package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        System.out.println("Test - pierwszy test jednostkowy: ");

        Calculator calculator = new Calculator();
        int add = calculator.add(6, 2);
        if (add != 8) {
            System.out.println("Calculator add method: Error!");
        }else {
            System.out.println("Calculator add method: OK");
        }

        int subtract = calculator.subtract(6, 2);
        if (subtract != 4) {
            System.out.println("Calculator subtract method: Error!");
        }else {
            System.out.println("Calculator subtract method: OK");
        }
    }
}
