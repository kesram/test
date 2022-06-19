package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String DRIVINGTASK = "DRIVINGTASK";
    public static final String PAINTINGTASK = "PAINTINGTASK";
    public static final String SHOPPINGTASK = "SHOPPINGTASK";

    public final Task makeTask(final String taskClass){
        switch (taskClass){
            case DRIVINGTASK:
                return new DrivingTask("Task1", "NY","car");
            case PAINTINGTASK:
                return new PaintingTask("Task2", "Black","Sun");
            case SHOPPINGTASK:
                return new ShoppingTask("Task3", "Potato [kg]",2.5);
            default:
                return null;
        }
    }

}
