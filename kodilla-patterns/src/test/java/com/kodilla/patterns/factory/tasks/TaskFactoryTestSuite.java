package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskFactoryTestSuite {

    @Test
    void testFactoryShoppingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task shoppingTask = taskFactory.informationAboutTask(TaskFactory.SHOPPINGTASK);

        //Then
        Assertions.assertEquals(true, shoppingTask.isTaskExecuted());
        Assertions.assertEquals("Shop", shoppingTask.getTaskName());
    }

    @Test
    void testFactoryDrivingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task drivingTask = taskFactory.informationAboutTask(TaskFactory.DRIVINGTASK);

        //Then
        Assertions.assertEquals(false,drivingTask.isTaskExecuted());
        Assertions.assertEquals("Drive", drivingTask.getTaskName());
    }

    @Test
    void testFactoryPaintingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task paintingTask = taskFactory.informationAboutTask(TaskFactory.PAINTINGTASK);

        //Then
        Assertions.assertEquals(false, paintingTask.isTaskExecuted());
        Assertions.assertEquals("Paint", paintingTask.getTaskName());
    }

}
