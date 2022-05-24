package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class BoardTestSuite {

    @Test
    void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        List<String> exampleList = new ArrayList<>();
        exampleList.add("New task");

        //When
        board.addTaskToListToDo();
        board.addTaskToListInProgress();
        board.addTaskToListInDone();

        //Then
        Assertions.assertEquals(exampleList, board.getToDoList());
        Assertions.assertEquals(exampleList, board.getInProgressList());
        Assertions.assertEquals(exampleList, board.getDoneList());

    }
}
