package assignment2;

/**
 * The Stack class represents a stack data structure implemented using a linked list.
 */
public class Stack {
    private LinkedList list; // The linked list used to implement the stack

    /**
     * Constructs an empty stack.
     */
    Stack() {
        list = new LinkedList(); // Initialize the linked list
    }

    /**
     * Pushes an element onto the top of the stack.
     * @param data The element to be pushed onto the stack.
     */
    public void push(int data) {
        list.insertAtPos(data, 1); // Insert at the beginning of the linked list (top of the stack)
    }

    /**
     * Removes and returns the element at the top of the stack.
     */
    public void pop() {
        list.deleteAtPosition(1); // Delete the first element of the linked list (top of the stack)
    }

    /**
     * Returns the element at the top of the stack without removing it.
     * @return The element at the top of the stack, or -1 if the stack is empty.
     */
    public int peek() {
        if (list.head != null) { // Check if the stack is not empty
            return list.head.data; // Return the data of the first node (top of the stack)
        }
        return -1; // Return -1 if the stack is empty
    }
}

