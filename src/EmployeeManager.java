package src;
import java.util.*;

/**
 * Manages a list of Employee objects.
 * Provides operations to add, view, update, delete, and list all employees.
 */
public class EmployeeManager{
    /** List that stores all employee records */
    private List<Employee> employees = new ArrayList<>();

    //Adds a new employee to the list if the ID is unique.
    public void addEmployee(Employee emp){
        //Checks if an employee with the same ID already exists
        for (Employee e : employees){
            if(e.getId()== emp.getId()){
                System.out.println("Employee with ID "+emp.getId()+"already exists.");
                return;

            }

        }
        employees.add(emp);
        System.out.println("Employee added successfully.");
    }

    public void viewEmployee(int id){
        //loop through all employees to find amatch
        for(Employee emp : employees){
            if (emp.getId() == id){
                System.out.println(emp);//Displays details of a specific employee by ID.
                return;
            }
        }
        System.out.println("Employee not found.");
    }
    /**Updates the details of an existing employee */
    public void updateEmployee(int id, String name, String dept, double salary){
        //Find the employee and update details
        for(Employee emp : employees) {
            if (emp.getId() == id) {
                emp.setName(name);
                emp.setDepartment(dept);
                emp.setSalary(salary);
                System.out.println("Employee updated successfully.");
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    /** Deletes an employee record by ID. */
    public void deleteEmployee(int id){
        // Use iterator to safely remove while looping
        Iterator<Employee> iterator = employees.iterator();
        while (iterator.hasNext()){
            if (iterator.next().getId() == id) {
                iterator.remove();
                System.out.println("Employee deleted successfully.");
                return;
            }
        }
        System.out.println("Employee not found.");
    }
    /** 
     * Displays all employee records.
     * Prints a message if there are no employees.
     */
    public void viewALLEmployees() {
        // Check if list is empty before printing
        if (employees.isEmpty()) {
            System.out.println("No employees to display.");
        }else {
            for(Employee emp : employees) {
                System.out.println(emp);
            }
        }
    }

}