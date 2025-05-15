package com.example.model;

/**
 * Represents a task with an ID, description, and priority.
 */
public class Task {
    private String id;
    private String description;
    private int priority;

    /**
     * Constructs a Task with the given ID, description, and priority.
     * @param id the task ID
     * @param description the task description
     * @param priority the task priority (1=high, 5=low)
     */
    public Task(String id, String description, int priority) {
        this.id = id;
        this.description = description;
        this.priority = priority;
    }

    /**
     * Gets the task ID.
     * @return the ID
     */
    public String getId() {
        return id;
    }

    /**
     * Gets the task description.
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Gets the task priority.
     * @return the priority
     */
    public int getPriority() {
        return priority;
    }

    /**
     * Returns a string representation of the task.
     * @return the task details
     */
    @Override
    public String toString() {
        return "Task{id='" + id + "', description='" + description + "', priority=" + priority + "}";
    }
}

