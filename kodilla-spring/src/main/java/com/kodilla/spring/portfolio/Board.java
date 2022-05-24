package com.kodilla.spring.portfolio;

import java.util.List;

public class Board {
    private TaskList toDoList;
    private TaskList inProgressList;
    private TaskList doneList;

    public Board(TaskList todoList, TaskList inProgressList, TaskList doneList) {
        this.toDoList = todoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public List<String> getToDoList() {
        return toDoList.getTasks();
    }

    public List<String> getInProgressList() {
        return inProgressList.getTasks();
    }

    public List<String> getDoneList() {
        return doneList.getTasks();
    }

    public void addTaskToListToDo() {
        getToDoList();
        toDoList.addTaskToList();
    }

    public void addTaskToListInProgress() {
        getInProgressList();
        inProgressList.addTaskToList();
    }

    public void addTaskToListInDone() {
        getDoneList();
        doneList.addTaskToList();
    }
}
