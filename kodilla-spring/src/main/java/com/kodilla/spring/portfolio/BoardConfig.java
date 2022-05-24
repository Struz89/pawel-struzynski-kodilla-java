package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {

    private TaskList toDoList;
    private TaskList inProgressList;
    private TaskList doneList;

    @Bean("toDoList")
    public TaskList toDoList() {
        TaskList taskList = new TaskList(TypeTaskList.TODO);
        toDoList = taskList;
        return taskList;
    }

    @Bean("inProgressList")
    public TaskList inProgressList() {
        TaskList taskList = new TaskList(TypeTaskList.INPROGRESS);
        inProgressList = taskList;
        return taskList;
    }

    @Bean("doneList")
    public TaskList doneList() {
        TaskList taskList = new TaskList(TypeTaskList.DONE);
        doneList = taskList;
        return taskList;
    }

    @Bean
    @Autowired
    public Board board(TaskList toDoList, TaskList inProgressList, TaskList doneList) {
        return new Board(toDoList, inProgressList, doneList);
    }
}
