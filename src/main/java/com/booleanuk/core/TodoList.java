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
        ArrayList<Task> result = new ArrayList<>();
        for (int i = 0; i < tasks.size(); i++) {
            if(!tasks.get(i).complete) {
                result.add(tasks.get(i));
            }
        }
        return result;
    }

    public ArrayList<Task> viewCompleteTasks() {
        ArrayList<Task> result = new ArrayList<>();
        for (int i = 0; i < tasks.size(); i++) {
            if(tasks.get(i).complete) {
                result.add(tasks.get(i));
            }
        }
        return result;
    }

}
