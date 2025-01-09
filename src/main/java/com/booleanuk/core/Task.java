package com.booleanuk.core;

public class Task {
    public String name;
    public boolean complete;

    public Task(String name) {
        this.name = name;
        this.complete = false;
    }

    public void changeStatus(boolean status) {
        complete = status;
    }
}
