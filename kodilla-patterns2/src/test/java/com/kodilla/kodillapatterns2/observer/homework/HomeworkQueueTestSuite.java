package com.kodilla.kodillapatterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HomeworkQueueTestSuite {
    @Test
    public void testUpdate() {
        //Given
        HomeworkQueue annaWojcikHomeworkQueue = new HomeworkQueue("Anna Wojcik");
        HomeworkQueue johnSmithHomeworkQueue = new HomeworkQueue("John Smith");
        HomeworkQueue janKowalskiHomeworkQueue = new HomeworkQueue("Jan Kowalski");
        Mentor jT = new Mentor("J.T.");
        Mentor aB = new Mentor("A.B.");
        annaWojcikHomeworkQueue.registerObserver(jT);
        johnSmithHomeworkQueue.registerObserver(aB);
        janKowalskiHomeworkQueue.registerObserver(aB);
        //When
        annaWojcikHomeworkQueue.addHomework("Task from Module 20.3");
        annaWojcikHomeworkQueue.addHomework("Task from Module 20.4");
        janKowalskiHomeworkQueue.addHomework("Task from Module 21.1");
        johnSmithHomeworkQueue.addHomework("Task from Module 20.3");
        johnSmithHomeworkQueue.addHomework("Task from Module 20.4");
        johnSmithHomeworkQueue.addHomework("Task from Module 21.1");
        //Then
        assertEquals(2, jT.getUpdateCount());
        assertEquals(4, aB.getUpdateCount());
    }
}
