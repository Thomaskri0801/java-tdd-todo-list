package com.booleanuk.core;

import java.util.ArrayList;

public class TodoList {
    ArrayList<Task> tasks = new ArrayList<>();

    public boolean add(Task task) {
        if(tasks.contains(task)) {
            return false;
        } else {
            tasks.add(task);
            return true;
        }
    }

    public ArrayList<Task> viewTasks() {
        return tasks;
    }

    public ArrayList<Task> viewIncompleteTasks() {
        return tasks;
    }
}
