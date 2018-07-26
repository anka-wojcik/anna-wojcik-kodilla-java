package com.kodilla.kodillapatterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class HomeworkQueue implements HomeworkObservable{
    private final String studentName;
    private final List<String> homeworkList;
    private final List<HomeworkObserver> homeworkObservers;

    public HomeworkQueue(String studentName) {
        this.studentName = studentName;
        homeworkList = new ArrayList<>();
        homeworkObservers = new ArrayList<>();
    }

    public String getStudentName() {
        return studentName;
    }

    public List<String> getHomework() {
        return homeworkList;
    }

    public void addHomework(String homework) {
        homeworkList.add(homework);
        sendHomeworkNotice();
    }

    @Override
    public void registerObserver(HomeworkObserver homeworkObserver) {
        homeworkObservers.add(homeworkObserver);
    }

    @Override
    public void sendHomeworkNotice() {
        for(HomeworkObserver homeworkObserver : homeworkObservers) {
            homeworkObserver.homeworkUpdate(this);
        }
    }

    @Override
    public void removeObserver(HomeworkObserver homeworkObserver) {
        homeworkObservers.remove(homeworkObserver);
    }
}
