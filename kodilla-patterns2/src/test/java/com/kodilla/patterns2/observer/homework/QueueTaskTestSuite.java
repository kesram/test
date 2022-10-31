package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QueueTaskTestSuite {

    @Test
    public void testUpdate(){
        //Given

        QueueTask student1 = new QueueTask("student1");
        QueueTask student2 = new QueueTask("student2");
        QueueTask student3 = new QueueTask("student3");
        QueueTask student4 = new QueueTask("student4");

        Mentor mentor1 = new Mentor("Mentor 1");
        Mentor mentor2 = new Mentor("Mentor 2");

        student1.registerObserver(mentor1);
        student2.registerObserver(mentor1);
        student3.registerObserver(mentor2);
        student4.registerObserver(mentor2);

        //When
        student1.sendTaskToCheck("Task 1");
        student1.sendTaskToCheck("Task 2");
        student2.sendTaskToCheck("Task 3");
        student2.sendTaskToCheck("Task 4");
        student2.sendTaskToCheck("Task 5");
        student3.sendTaskToCheck("Task 6");
        student3.sendTaskToCheck("Task 7");
        student4.sendTaskToCheck("Task 8");
        student4.sendTaskToCheck("Task 9");
        student4.sendTaskToCheck("Task 10");
        student4.sendTaskToCheck("Task 11");

        //Then
        Assertions.assertEquals(5, mentor1.getUpdateMentorCount());
        Assertions.assertEquals(6, mentor2.getUpdateMentorCount());
    }
}
