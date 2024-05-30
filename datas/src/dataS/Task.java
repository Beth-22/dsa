package dataS;

/**
 * The Task class represents a task with a title, description, and completion status.
 * Tasks can be marked as completed, and their title and description can be retrieved.
 */
class Task {
    private String title; 
    private String description; // The description of the task
    private boolean completed; // The completion status of the task

    /**
     * Constructs a new task with the specified title and description.
     * By default, the task is initialized as not completed.
     * 
     * @param title The title of the task.
     * @param description The description of the task.
     */
    public Task(String title, String description) {
        this.title = title;
        this.description = description;
        this.completed = false; // Initialize completion status as false
    }

    /**
     * Gets the title of the task.
     * 
     * @return The title of the task.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Gets the description of the task.
     * 
     * @return The description of the task.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Checks if the task is completed.
     * 
     * @return true if the task is completed, false otherwise.
     */
    public boolean isCompleted() {
        return completed;
    }

    /**
     * Marks the task as completed.
     * Sets the completion status of the task to true.
     */
    public void markCompleted() {
        this.completed = true;
    }
}

