package src;
import java.util.*;


/**
 * The Employee class represents an employee with basic details
 * such as ID, name, department, and salary.
 */
public class Employee{
    //Instance variables (fields) to store employee details
    private int id;
    private String name;
    private String department;
    private double salary;

    public Employee(int id,String name,String department,double salary){
        //Constructor to initialize an Employee object
        this.id=id;
        this.name=name;
        this.department=department;
        this.salary=salary;
    }
    //Getter methods (used to retrive private variable values)
    public int getId(){return id;}
    public String getName(){return name;}
    public String getDepartment(){return department;}
    public double getSalary(){return salary;}

    //Setter methods (used to modify private variable values)
    public void setName(String name){this.name=name;}
    public void setDepartment(String department){this.department=department;}
    public void setSalary(double salary){this.salary=salary;}
    public  double getDeductedSalary(){
        return salary-(salary*0.10);//Calculates and returns the salary after a 10% deduction.
    }
    /** Returns a string representation of the Employee object,
     * including both original and deducted salary.
     */
    @Override
    public String toString(){
        return "ID:"+id+
                "\nName:"+name+
                "\nDepartment:"+department+
                "\nOriginal Salary:RS:"+salary+
                "\nSalary after 10% Deduction:RS:"+String.format("%.2f",getDeductedSalary());
    }
}