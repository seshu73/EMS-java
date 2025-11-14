# :page_with_curl: EMPLOYEE MANAGEMENT SYSTEM #
 A simple Java console application to manage employee records.
 This system allows users to add, view, update, and delete 
 employee information usimg a menu-driven interface.


## :file_folder: Project Structure ##
```
 Employee-Management-System/
├── src/
│   ├── Employee.java
│   ├── EmployeeManager.java
│   └── Main.java
 ```

## :package: Features ##

- :heavy_plus_sign: Add new employees with ID, name, department, and salary
- :mag: View details of a specific employee by ID
- :pencil2: Update employee information
- :x: Delete employee by ID
- :clipboard: View all employees in the system
- :no_entry_sign: Prevent duplicate employees IDs


## 🛠  Technologies Used
- Java (JDK 8 or higher)
- Console-based input/output
- ArrayList for dynamic data stogare


## 🚀 How to Compile and Run
### 1. :compass: Navigate to the project directory: ###

``` Bash

cd Employee-Management-System
```

### 2. :gear: Compile the source files:
``` Bash

javac -d out src/*.java
```

### 3. :arrow_forward:  Run the application:

``` Bash

java -cp out src.Main
```

## :pushpin: Sample Menu

``` Bash

1. Add Employee
2. View Employee
3. Update Employee
4. Delete Employee
5. View All Employees
6. Exit
```

## :books: Future Enhancements
-  :floppy_disk: Save/load employee data to/from  file
- :mag: Add search and sort functionality
- :card_file_box:  Integrate with a database (e.g., MySQL)
- :desktop_computer: Build a GUI using JavaFX or Swing
