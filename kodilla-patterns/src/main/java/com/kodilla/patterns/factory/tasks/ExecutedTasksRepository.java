package com.kodilla.patterns.factory.tasks;

import java.util.ArrayList;
import java.util.List;

public class ExecutedTasksRepository {
    List<String> listOfExecutedTasks = new ArrayList<>();

    public void addTaskToList(String taskName) {
        listOfExecutedTasks.add(taskName);
    }
}
