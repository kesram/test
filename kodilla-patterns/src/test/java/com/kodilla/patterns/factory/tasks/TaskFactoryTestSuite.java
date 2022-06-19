package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskFactoryTestSuite {

    @Test
    void testFactoryDrivingTask(){
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task DrivingTask = taskFactory.makeTask(TaskFactory.DRIVINGTASK);
        boolean before = DrivingTask.isTaskExecuted();
        DrivingTask.executeTask();
        boolean after = DrivingTask.isTaskExecuted();
        //Then
        assertEquals("Task1",DrivingTask.getTaskName());
        assertFalse(before);
        assertTrue(after);
    }

    @Test
    void testFactoryPaintingTask(){
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task PaintingTask = taskFactory.makeTask(TaskFactory.PAINTINGTASK);
        boolean before = PaintingTask.isTaskExecuted();
        PaintingTask.executeTask();
        boolean after = PaintingTask.isTaskExecuted();
        //Then
        assertEquals("Task2",PaintingTask.getTaskName());
        assertFalse(before);
        assertTrue(after);
    }

    @Test
    void testFactoryShoppingTask(){
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task ShoppingTask = taskFactory.makeTask(TaskFactory.SHOPPINGTASK);
        boolean before = ShoppingTask.isTaskExecuted();
        ShoppingTask.executeTask();
        boolean after = ShoppingTask.isTaskExecuted();
        //Then
        assertEquals("Task3",ShoppingTask.getTaskName());
        assertFalse(before);
        assertTrue(after);
    }
}
