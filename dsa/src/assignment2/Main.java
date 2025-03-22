package assignment2;

/**
 * The Main class contains the main method to test Linked List and Stack operations
 */
public class Main {

    /**
     * Main method to test LinkedList and Stack operations.
     * @param args The command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // Testing the LinkedList operations
        LinkedList linkedList = new LinkedList(); // Creating a new LinkedList instance
        linkedList.insertAtPos(89, 1); // Inserting 89 at position 1
        linkedList.insertAtPos(34, 2); // Inserting 34 at position 2
        linkedList.insertAtPos(23, 2); // Inserting 90 at position 2
        linkedList.deleteAtPosition(1); // Deleting node at position 1
        linkedList.deleteAfterNode(linkedList.head); // Deleting node after head
        System.out.println("Is 23 present? " + linkedList.searchNode(23)); // Searching for 23

        // Testing the Stack operations
        Stack stack = new Stack(); // Creating a new Stack instance
        stack.push(60); // Pushing 60 onto the stack
        stack.push(45); // Pushing 45 onto the stack
        stack.push(23); // Pushing 23 onto the stack
        stack.pop(); // Popping from the stack
        System.out.println("Top element of stack: " + stack.peek()); // Peeking at the top element
    }
}
//comment 