package com.kodilla.testing.shape;

import org.junit.*;
import com.kodilla.testing.shape.Circle;
import com.kodilla.testing.shape.Square;
import com.kodilla.testing.shape.Triangle;
import com.kodilla.testing.shape.ShapeCollector;

import java.util.ArrayList;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests(){
        System.out.println("Initializing ShapeCollector tests.");
    }

    @AfterClass
    public static void afterAllTests(){
        System.out.println("ShapeCollector tests completed.");
    }

    @Before
    public void beforeEveryTest(){
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure(){
        //Given
        Shape circle = new Circle("circle", 4);
        ShapeCollector shapeCollector = new ShapeCollector();

        //When
        shapeCollector.addFigure(circle);
        Shape retrievedShape = shapeCollector.getFigure(0);

        //Then
        Assert.assertEquals(circle,retrievedShape);
    }

    @Test
    public void testRemoveFigure(){
        //Given
        Shape circle = new Circle("circle", 4);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(circle);

        //When
        boolean result = shapeCollector.removeFigure(circle);

        //Then
        Assert.assertTrue(result);
    }

    @Test
    public void testGetFigure(){
        //Given
        Shape circle = new Circle("circle", 4);
        Shape square = new Square("square", 4);
        ShapeCollector shapeCollector = new ShapeCollector();

        //When
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(square);
        Shape retrievedShape = shapeCollector.getFigure(1);
        //Then
        Assert.assertEquals(square, retrievedShape);
    }

    @Test
    public void testShowFigures(){
        //Given
        Shape circle = new Circle("circle", 4);
        Shape square = new Square("square", 4);
        Shape triangle = new Triangle("triangle", 4, 3);
        ShapeCollector shapeCollector = new ShapeCollector();

        //When
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(triangle);
        ArrayList<Shape> expected = new ArrayList<>();
        expected.add(circle);
        expected.add(square);
        expected.add(triangle);
        ArrayList<Shape> retrievedList = shapeCollector.showFigures();

        //Then
        Assert.assertArrayEquals(expected.toArray(), retrievedList.toArray());
    }
}
