package dataS;

/**
 * The ToDoList class represents a list of tasks.
 * It provides methods to add tasks, mark tasks as completed,
 * and view the list of tasks.
 */
public class ToDoList {
    private Node head;

    /**
     * Adds a new task to the to-do list.
     * 
     * @param task The task to be added.
     */
    public void addToDo(Task task) {
        Node newNode = new Node(task);

        // If the list is empty, set the new node as the head
        if (head == null) {
            head = newNode;
        } else {
            // Traverse the list to find the last node
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            // Append the new node to the end of the list
            current.setNext(newNode);
        }
    }

    /**
     * Marks a task with the specified title as completed.
     * If the task is not found, a message is displayed.
     * 
     * @param title The title of the task to be marked as completed.
     */
    public void markToDoAsCompleted(String title) {
        if (head == null) {
            System.out.println("The to-do list is empty.");
            return;
        }

        // If the head task is the one to be marked completed
        if (head.getTask().getTitle().equals(title)) {
            head.getTask().markCompleted();
            // Remove the head task if it's completed
            if (head.getTask().isCompleted()) {
                head = head.getNext();
            }
            return;
        }

        Node current = head;
        // Traverse through the list to find the task with the given title
        while (current.getNext() != null) {
            // If the next task's title matches the given title
            if (current.getNext().getTask().getTitle().equals(title)) {
                // Mark the next task as completed
                current.getNext().getTask().markCompleted();
                // Remove the next task if it's completed
                if (current.getNext().getTask().isCompleted()) {
                    current.setNext(current.getNext().getNext());
                }
                return;
            }
            current = current.getNext();
        }

        System.out.println("Task not found.");
    }

    
    /**
     * Displays the list of tasks in the to-do list.
     * If the list is empty, a message is displayed.
     */
    public void viewToDoList() {
        if (head == null) {
            System.out.println("The to-do list is empty.");
            return;
        }

        Node current = head;
        while (current != null) {
            System.out.println("Title: " + current.getTask().getTitle() +
                    ", Description: " + current.getTask().getDescription() +
                    ", Completed: " + current.getTask().isCompleted());
            current = current.getNext();
        }
    }
}
