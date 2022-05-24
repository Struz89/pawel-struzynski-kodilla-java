package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    private TypeTaskList typeTaskList;
    private final List<String> tasks;

    public TaskList(TypeTaskList typeTaskList) {
        this.typeTaskList = typeTaskList;
        tasks = new ArrayList<>();
    }

    public TypeTaskList getTypeTaskList() {
        return typeTaskList;
    }

    public List<String> getTasks() {
        return tasks;
    }

    public List<String> addTaskToList() {
        tasks.add("New task");
        return tasks;
    }
}
