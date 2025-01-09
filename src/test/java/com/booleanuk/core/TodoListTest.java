package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TodoListTest {
    @Test
    public void exampleTest() {
        String hello = "Hello";
        Assertions.assertEquals("Hello", hello);
        Assertions.assertNotEquals("Goodbye", hello);
    }

    @Test
    public void addingTask() {
        TodoList todoList = new TodoList();
        Task task = new Task();
        String name = "Take out the garbage";
        boolean complete = false;


    }
}
