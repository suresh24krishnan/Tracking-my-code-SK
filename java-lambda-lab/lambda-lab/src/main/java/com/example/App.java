package com.example;

import com.example.exception.TaskException;
import com.example.service.TaskManager;

/**
 * Demonstrates lambda expressions with task management.
 */
public class App {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        try {
            // Add tasks (Day 1 OOP, Day 2 collections)
            manager.addTask("T1", "Write code", 1);
            manager.addTask("T2", "Test app", 3);
            manager.addTask("T3", "Deploy app", 5);

            // Filter high-priority tasks (lambda syntax: (param) -> expression)
            System.out.println("High-priority tasks (priority <= 2):");
            manager.filterTasks(task -> task.getPriority() <= 2)
                   .forEach(task -> System.out.println(task));

            // Process tasks with logging (lambda scope: accessing processedCount implicitly)
            System.out.println("\nProcessing all tasks:");
            manager.processTasks(task -> System.out.println("Processed: " + task));

            // Show processed count (demonstrates lambda accessing outer variable)
            System.out.println("Processed tasks: " + manager.getProcessedCount());

        } catch (TaskException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}

