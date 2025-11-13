package src;

import java.util.*;

/**
 * The Main class provides a console-based interface
 */
public class Main {

    /**
     * Entry point of the Employee Management System.
     * Displays a menu-driven console interface for user interaction.
     */
    public static void main(String[] args){
        EmployeeManager manager = new EmployeeManager();
        Scanner scanner = new Scanner(System.in);
        int choice;

        //Main menu loop
        do {
            System.out.println("\n=== Employee Mangement System ===");
            System.out.println("1. Add Employee");
            System.out.println("2. view Employee");
            System.out.println("3. Update Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. View All Employees");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            //Validate input type
            while(!scanner.hasNextInt()) {
                System.out.print("Invalid input. Enter a number: ");
                scanner.next();
            }
            choice = scanner.nextInt();
            scanner.nextLine();// consume newline

            switch (choice) {
                case 1:
                    // Add a new employee
                    System.out.print("Enter ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                     System.out.print("Enter Department: ");
                    String dept = scanner.nextLine();
                     System.out.print("Enter Salary: ");
                    double salary = scanner.nextDouble();
                    manager.addEmployee(new Employee(id, name, dept, salary));
                    break;
                    case 2:
                        // View a specific employee
                        System.out.print("Enter Employee ID to view: ");
                        manager.viewEmployee(scanner.nextInt());
                        break;

                    case 3:
                    // Update an existing employee
                    System.out.print("Enter Emplyee ID to update: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter New Name: ");
                    String newName = scanner.nextLine();
                     System.out.print("Enter New Department: ");
                    String newDept = scanner.nextLine();
                     System.out.print("Enter New Salary: ");
                    double newSalary = scanner.nextDouble();
                    manager.updateEmployee(updateId, newName, newDept, newSalary);
                    break;

                    case 4:
                        //Delete an employee
                        System.out.print("Enter Employee ID to delete");
                        manager.deleteEmployee(scanner.nextInt());
                        break;

                    case 5:
                        //View all employees
                        manager.viewALLEmployees();
                        break;

                    case 6:
                        // Exit the program
                        System.out.println("Exiting... Goodbye!");
                        break;

                    default:
                        System.out.println("Invalid choice. Please try again.");
            }
        }while(choice != 6);

        scanner.close();
    }
}