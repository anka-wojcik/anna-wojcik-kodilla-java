package com.kodilla.patterns.factory.tasks;


public final class ShoppingTask implements Tasks {
    final String taskName;
    final String whatToBuy;
    final double quantity;
    ExecutedTasksRepository repository = new ExecutedTasksRepository();

    public ShoppingTask(final String taskName, final String whatToBuy, final double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public void executeTask() {
        repository.addTaskToList(getTaskName());
        System.out.println("Shopping task for " + quantity + " of " + whatToBuy + " has been executed and added to the repository");
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
