package dataS;
import java.util.Scanner;


/** 
 * 
 * @author Bethlehem Woldekidan(sec 3. 1866/15)
 * @version 30/05/24
 */


public class Main {
	
	/**
	 * Initializing a to-do list and a scanner object to 
	 * handle user input. Then it presents a menu to the user
	 * and executes the chosen operation until the user decides
	 * to exit the application.
	 * 
	 * @param args The command-line arguments (not used in this application).
	 */

    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();
        Scanner scanner = new Scanner(System.in);

        boolean exit = false;
        while (!exit) {
        	System.out.println("Welcome to Task Organizer App! ");
        	System.out.println(" ");
            System.out.println("1. Add task");
            System.out.println("2. Mark task as completed");
            System.out.println("3. View to-do list");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter task title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine();
                    toDoList.addToDo(new Task(title, description));
                    break;
                case 2:
                    System.out.print("Enter task title to mark as completed: ");
                    title = scanner.nextLine();
                    toDoList.markToDoAsCompleted(title);
                    break;
                case 3:
                    toDoList.viewToDoList();
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }

        scanner.close();
    }
}


