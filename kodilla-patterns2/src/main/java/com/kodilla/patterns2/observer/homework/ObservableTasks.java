package com.kodilla.patterns2.observer.homework;


public interface ObservableTasks {

    void registerObserver(ObserverTasks observer);
    void notifyObservers();
    void removeObserver(ObserverTasks observer);
}
