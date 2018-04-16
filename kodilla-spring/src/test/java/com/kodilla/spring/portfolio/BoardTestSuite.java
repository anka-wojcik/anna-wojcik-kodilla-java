package com.kodilla.spring.portfolio;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {

    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        String toDoTask = "task 1";
        String inProgressTask = "task 2";
        String doneTask = "task 3";

        //When & Then
        board.addTaskToToDoList(toDoTask);
        board.addTaskToInProgressList(inProgressTask);
        board.addTaskToDoneList(doneTask);
        System.out.println("Tasks to do: " + board.getToDoList());
        System.out.println("Tasks in progress: " + board.getInProgressList());
        System.out.println("Tasks done: " + board.getDoneList());
    }
}
