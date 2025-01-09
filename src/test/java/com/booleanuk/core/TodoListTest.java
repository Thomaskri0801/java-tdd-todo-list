package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class TodoListTest {

    @Test
    public void addingTask() {
        TodoList todoList = new TodoList();
        Task task = new Task("Take out the garbage");

        Assertions.assertTrue(todoList.add(task));
        Assertions.assertFalse(todoList.add(task));
    }

    @Test
    public void viewAllTasks() {
        TodoList todoList = new TodoList();
        ArrayList<Task> empty = new ArrayList<>();
        Assertions.assertIterableEquals(empty, todoList.viewTasks());

        Task task = new Task("Take out the garbage");
        todoList.add(task);
        empty.add(task);

        Assertions.assertIterableEquals(empty, todoList.viewTasks());
    }

    @Test
    public void checkViewAllIncompleteTasks() {
        TodoList todoList = new TodoList();
        ArrayList<Task> empty = new ArrayList<>();
        Assertions.assertIterableEquals(empty, todoList.viewIncompleteTasks());

        Task task = new Task("Take out the garbage");
        Task taskComplete = new Task("Take out the garbage");
        task.complete = true;
        todoList.add(task);
        todoList.add(taskComplete);
        empty.add(task);

        Assertions.assertIterableEquals(empty, todoList.viewIncompleteTasks());
    }
}
