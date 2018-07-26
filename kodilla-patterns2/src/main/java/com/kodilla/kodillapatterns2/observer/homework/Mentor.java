package com.kodilla.kodillapatterns2.observer.homework;

public class Mentor implements HomeworkObserver {
    private final String name;
    private int updateCount;

    public Mentor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getUpdateCount() {
        return updateCount;
    }

    @Override
    public void homeworkUpdate(HomeworkQueue homeworkQueue) {
        long size = homeworkQueue.getHomework().size();
        System.out.printf("%s %s %s %s %s %s %d %s", name, ": ", homeworkQueue.getStudentName(), " has just sent you homework update", "\n",
                " total: ", size, size == 1 ? "message\n" : "messages\n");
        updateCount++;
    }
}
