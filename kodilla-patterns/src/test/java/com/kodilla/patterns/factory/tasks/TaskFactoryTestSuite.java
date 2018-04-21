package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    TaskFactory factory = new TaskFactory();


    @Test
    public void testFactoryShoppingTask() {
        //Given & When
        Tasks shopping = factory.makeTask(TaskFactory.SHOPPING);
        shopping.executeTask();
        //Then
        Assert.assertEquals(true, shopping.isTaskExecuted());
        Assert.assertEquals("Shopping list", shopping.getTaskName());
    }

    @Test
    public void testFactoryPaintingTask() {
        //Given & When
        Tasks painting = factory.makeTask(TaskFactory.PAINTING);
        painting.executeTask();
        //Then
        Assert.assertEquals(true, painting.isTaskExecuted());
        Assert.assertEquals("Paint the wall", painting.getTaskName());
    }

    @Test
    public void testFactoryDrivingTask() {
        //Given & When
        Tasks driving = factory.makeTask(TaskFactory.DRIVING);
        driving.executeTask();
        //Then
        Assert.assertEquals(true, driving.isTaskExecuted());
        Assert.assertEquals("Driving to relatives", driving.getTaskName());
    }
}
