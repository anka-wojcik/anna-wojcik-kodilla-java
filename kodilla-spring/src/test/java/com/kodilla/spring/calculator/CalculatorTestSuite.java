package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CalculatorTestSuite {
    @Test
    public void testCalculations() {
        //When
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //Given
        double sum = calculator.add(4, 4);
        double sub = calculator.sub(4, 4);
        double mul = calculator.mul(4, 4);
        double div = calculator.div(4, 4);
        //Then
        Assert.assertEquals(8.0, sum, 0.00001);
        Assert.assertEquals(0.0, sub, 0.00001);
        Assert.assertEquals(16.0, mul, 0.00001);
        Assert.assertEquals(1.0, div, 0.00001);
    }
}
