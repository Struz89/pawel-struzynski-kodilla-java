package com.kodilla.patterns2.observer.homework;

public class Mentor implements ObserverTasks{

    private final String username;

    private int updateCount;

    public Mentor(String username) {
        this.username = username;
    }

    @Override
    public void update(User user) {
        String task = user.getTasks().size()>1?"tasks":"task";
        System.out.println(username + " - New task from " + user.getUsername() + "\n" +
                "Total: " + user.getTasks().size() + " " + task);
        updateCount++;
    }

    public String getUsername() {
        return username;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
