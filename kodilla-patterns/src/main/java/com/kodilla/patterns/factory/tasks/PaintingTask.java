package com.kodilla.patterns.factory.tasks;

public final class PaintingTask implements Tasks {
    final String taskName;
    final String colour;
    final String whatToPaint;
    ExecutedTasksRepository repository = new ExecutedTasksRepository();

    public PaintingTask(final String taskName, final String colour, final String whatToPaint) {
        this.taskName = taskName;
        this.colour = colour;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public void executeTask() {
        repository.addTaskToList(getTaskName());
        System.out.println("Painting task for painting the " + whatToPaint + " " + colour + " has been executed and added to the repository");
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
