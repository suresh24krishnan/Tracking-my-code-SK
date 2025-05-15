package com.example.service;

import com.example.exception.TaskException;
import com.example.model.Task;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Manages tasks using lambda expressions for filtering and processing.
 */
public class TaskManager {
    private List<Task> tasks;
    private int processedCount; // Accessible in lambdas

    /**
     * Constructs an empty TaskManager.
     */
    public TaskManager() {
        this.tasks = new ArrayList<>();
        this.processedCount = 0;
    }

    /**
     * Adds a task to the manager.
     * @param id the task ID
     * @param description the task description
     * @param priority the task priority
     * @throws TaskException if inputs are invalid
     */
    public void addTask(String id, String description, int priority) throws TaskException {
        if (id == null || id.trim().isEmpty() || description == null || description.trim().isEmpty()) {
            throw new TaskException("ID and description must not be empty");
        }
        if (priority < 1 || priority > 5) {
            throw new TaskException("Priority must be between 1 and 5");
        }
        tasks.add(new Task(id, description, priority));
    }

    /**
     * Filters tasks using a lambda expression.
     * @param filter the lambda to filter tasks
     * @return the filtered tasks
     */
    public List<Task> filterTasks(Predicate<Task> filter) {
        List<Task> result = new ArrayList<>();
        for (Task task : tasks) {
            if (filter.test(task)) {
                result.add(task);
            }
        }
        return result;
    }

    /**
     * Processes tasks using a lambda expression, updating processed count.
     * @param processor the lambda to process tasks
     */
    public void processTasks(java.util.function.Consumer<Task> processor) {
        for (Task task : tasks) {
            processor.accept(task);
            processedCount++; // Demonstrates scope access
        }
    }

    /**
     * Gets the number of processed tasks.
     * @return the processed count
     */
    public int getProcessedCount() {
        return processedCount;
    }

    /**
     * Gets the list of tasks.
     * @return the tasks
     */
    public List<Task> getTasks() {
        return new ArrayList<>(tasks);
    }
}

