package com.kodilla.patterns.factory.tasks;

public final class DrivingTask implements Tasks {
    final String taskName;
    final String where;
    final String using;
    ExecutedTasksRepository repository = new ExecutedTasksRepository();

    public DrivingTask(final String taskName, final String where, final String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public void executeTask() {
        repository.addTaskToList(getTaskName());
        System.out.println("Driving task of driving from " + where + " by " + using + " has been executed and added to the repository");
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        if(repository.listOfExecutedTasks.contains(getTaskName())) {
            return true;
        }
        return false;
    }
}
