package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String SHOPPINGTASK = "SHOPPINGTASK";
    public static final String PAINTINGTASK = "PAINTINGTASK";
    public static final String DRIVINGTASK = "DRIVINGTASK";

    public final Task informationAboutTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPINGTASK:
                return new ShoppingTask("Shop", "Orange", 2);
            case PAINTINGTASK:
                return new PaintingTask("Paint", "Red", "House");
            case DRIVINGTASK:
                return new DrivingTask("Drive", "Airport", "Bus");
            default:
                return null;
        }
    }
}
