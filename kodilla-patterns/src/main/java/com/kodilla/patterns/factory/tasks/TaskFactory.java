package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Tasks makeTask(final String tasksClass) {
        switch (tasksClass) {
            case SHOPPING:
                return new ShoppingTask("Shopping list", "carrots", 5.0);
            case PAINTING:
                return new PaintingTask("Paint the wall", "blue", "wall");
            case DRIVING:
                return new DrivingTask("Driving to relatives", "Warsaw", "car");
            default:
                return null;
        }
    }
}
