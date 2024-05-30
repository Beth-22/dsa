package dataS;

/**
 * The Node class represents a node in a linked list.
 * Each node contains a Task object and a reference to the next node.
 */

//Node Class
class Node {
private Task task; //the task object stored in the node
private Node next; // referencing the next node



/**
 * Constructs a new node with the specified Task object.
 * 
 * @param task The Task object to be stored in the node.
 */
public Node(Task task) {
   this.task = task; 
   this.next = null; // initialize next reference to null
}


/**
 * Gets the Task object stored in the node.
 * 
 * @return The Task object stored in the node.
 */
public Task getTask() {
   return task;
}


/**
 * Gets the reference to the next node in the linked list.
 * 
 * @return The reference to the next node.
 */
public Node getNext() {
   return next;
}


/**
 * Sets the reference to the next node in the linked list.
 * 
 * @param next The reference to the next node.
 */
public void setNext(Node next) {
   this.next = next;
}
}


