package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {

    static double getAverage(int[] numbers) {
        System.out.println("Array elements are as follows:");
        IntStream.rangeClosed(numbers[0], numbers.length)
              .forEach(System.out::println);

        System.out.println("Average value from elements above is: ");
        double average = IntStream.rangeClosed(numbers[0], numbers.length)
                .average()
                .getAsDouble();
        System.out.println(average);
        return average;

    }

}
