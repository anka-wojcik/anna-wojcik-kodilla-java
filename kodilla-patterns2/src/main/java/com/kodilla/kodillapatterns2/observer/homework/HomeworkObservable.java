package com.kodilla.kodillapatterns2.observer.homework;

public interface HomeworkObservable {
    void registerObserver(HomeworkObserver homeworkObserver);
    void sendHomeworkNotice();
    void removeObserver(HomeworkObserver homeworkObserver);
}
