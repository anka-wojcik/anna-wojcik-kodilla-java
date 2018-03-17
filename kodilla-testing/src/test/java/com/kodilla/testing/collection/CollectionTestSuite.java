package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import java.util.*;
import org.junit.*;

import javax.print.attribute.IntegerSyntax;

public class CollectionTestSuite {

    @Before
    public void before(){
        System.out.println("Test case: begin");
    }
    @After
    public void after(){
        System.out.println("Test case: end");
    }
    @BeforeClass
    public static void beforeClass(){
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("Test Suite: end");
    }

    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        OddNumbersExterminator numbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(4);
        numbers.add(3);
        numbers.add(2);
        numbers.add(1);
        //When
        System.out.println("Testing OddNumbersExterminator list's expected size.");
        ArrayList data = numbersExterminator.exterminate(numbers);
        //Then
        Assert.assertEquals(data.size(), 2);
    }
    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //Given
        OddNumbersExterminator numbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(null);
        //When
        System.out.println("Testing OddNumbersExterminator list while empty.");
        ArrayList data = numbersExterminator.exterminate(numbers);
        //Then
        Assert.assertNotNull(numbers);
    }

}
