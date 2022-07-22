package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class User implements ObservableTasks{

    private final List<ObserverTasks> observers;

    private final String username;

    private final List<String> tasks;

    public User (String username) {
        observers = new ArrayList<>();
        tasks = new ArrayList<>();
        this.username = username;
    }

    public void addTask(String task) {
        tasks.add(task);
        notifyObservers();
    }

    @Override
    public void registerObserver(ObserverTasks observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for(ObserverTasks observerTasks: observers) {
            observerTasks.update(this);
        }
    }

    @Override
    public void removeObserver(ObserverTasks observer) {
        observers.remove(observer);
    }

    public String getUsername() {
        return username;
    }

    public List<String> getTasks() {
        return tasks;
    }
}
