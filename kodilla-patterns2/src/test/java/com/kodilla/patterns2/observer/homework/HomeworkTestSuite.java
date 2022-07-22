package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HomeworkTestSuite {

    @Test
    public void testUpdate() {
        //Given
        User user1 = new User("Jan Kowalski");
        User user2 = new User("Marek Nowak");
        Mentor mentor1 = new Mentor("Adam Malinowski");
        Mentor mentor2 = new Mentor("Robert Kwiatkowski");
        user1.registerObserver(mentor1);
        user2.registerObserver(mentor2);
        //When
        user1.addTask("Task1");
        user2.addTask("Task1");
        user1.addTask("Task2");
        //Then
        assertEquals(2, mentor1.getUpdateCount());
        assertEquals(1, mentor2.getUpdateCount());
    }
}
