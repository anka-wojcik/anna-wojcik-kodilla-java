package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class BoardTestSuite {

    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        String toDoTask = "task 1";
        String inProgressTask = "task 2";
        String doneTask = "task 3";

        //When
        board.addTaskToToDoList(toDoTask);
        board.addTaskToInProgressList(inProgressTask);
        board.addTaskToDoneList(doneTask);

        //Then
        System.out.println("Tasks to do: " + board.getToDoList());
        System.out.println("Tasks in progress: " + board.getInProgressList());
        System.out.println("Tasks done: " + board.getDoneList());

        Assert.assertEquals(1, board.getToDoList().getTasks().size());
        Assert.assertEquals(1, board.getInProgressList().getTasks().size());
        Assert.assertEquals(1, board.getDoneList().getTasks().size());

        Assert.assertEquals("task 1", board.getToDoList().getTasks().get(0));
        Assert.assertEquals("task 2", board.getInProgressList().getTasks().get(0));
        Assert.assertEquals("task 3", board.getDoneList().getTasks().get(0));
    }
}
