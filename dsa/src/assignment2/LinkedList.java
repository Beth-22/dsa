package assignment2;

/**
 * The class represents a singly linked list data structure.
 * It provides methods to insert, delete, and search for nodes within the list.
 */


class LinkedList {
    Node head;
    
    
    /**
     * Inserts a new node with the specified data value at the given position in the list.
     * If the position is 1, the new node becomes the new head of the list.
     * 
     * @param data The data value to be stored in the new node.
     * @param position The position at which to insert the new node.
     */

    // Method to insert a node at a specified position
    public void insertAtPos(int data, int position) {
        Node newNode = new Node(data);
        if (position == 1) {
            newNode.next = head;
            head = newNode;
        } else {
            Node temp = head;
            for (int i = 1; i < position - 1 && temp != null; i++) {
                temp = temp.next;
            }
            if (temp == null) {
                System.out.println("Invalid position");
                return;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }
    
    
    
    /**
     * Deletes the node at the specified position in the list.
     * If the position is 1, the head of the list is updated to the next node.
     * 
     * @param position The position of the node to be deleted.
     */

    // Method to delete a node at a specified position
    public void deleteAtPosition(int position) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (position == 1) {
            head = head.next;
        } else {
            Node temp = head;
            for (int i = 1; i < position - 1 && temp != null; i++) {
                temp = temp.next;
            }
            if (temp == null || temp.next == null) {
                System.out.println("Invalid position");
                return;
            }
            temp.next = temp.next.next;
        }
    }

    /**
     * Deletes the node after the specified previous node.
     * 
     * @param prevNode The node preceding the node to be deleted.
     */
    
    // Method to delete the node after a given node
    public void deleteAfterNode(Node prevNode) {
        if (prevNode == null || prevNode.next == null) {
            System.out.println("Cannot delete. Previous node is null or last node.");
            return;
        }
        prevNode.next = prevNode.next.next;
    }

    
    /**
     * Searches for a node with the specified data value in the list.
     * 
     * @param key The data value to search for.
     * @return true if a node with the specified data value is found, false otherwise.
     */
    
    // Method to search for a node with a specific value
    public boolean searchNode(int key) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
}








