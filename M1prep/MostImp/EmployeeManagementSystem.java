package M1prep.MostImp;

import java.util.Objects;
import java.util.Scanner;

 class Employee {

    private int id;
    private String name;
    private String department;
    private double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getDepartment() {
        return department;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee[ID=" + id +
                ", Name=" + name +
                ", Department=" + department +
                ", Salary=" + salary + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Employee)) return false;
        Employee other = (Employee) obj;
        return this.id == other.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

public class EmployeeManagementSystem {

    private Employee[] employees = new Employee[20];
    private int count = 0;

    public static void main(String[] args) {
        EmployeeManagementSystem system = new EmployeeManagementSystem();
        system.start();
    }

    public void start() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nWelcome to Employee Management System");
            System.out.println("1. Add Employee");
            System.out.println("2. Display All Employees");
            System.out.println("3. Update Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Search Employee by ID");
            System.out.println("6. Count Employees by Department");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1: addEmployee(sc); break;
                case 2: displayEmployees(); break;
                case 3: updateEmployee(sc); break;
                case 4: deleteEmployee(sc); break;
                case 5: searchEmployee(sc); break;
                case 6: countByDepartment(sc); break;
                case 7: System.out.println("Exiting..."); return;
                default: System.out.println("Invalid choice!");
            }
        }
    }

    private void addEmployee(Scanner sc) {
        if (count >= employees.length) {
            System.out.println("Employee limit reached!");
            return;
        }

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        Employee newEmp = new Employee(id, "", "", 0);

        for (int i = 0; i < count; i++) {
            if (employees[i].equals(newEmp)) {
                System.out.println("Employee with ID " + id + " already exists! Cannot add duplicate.");
                return;
            }
        }

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Department: ");
        String dept = sc.nextLine();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        employees[count++] = new Employee(id, name, dept, salary);

        System.out.println("Employee added successfully!");
        displayEmployees();
    }

    private void displayEmployees() {
        if (count == 0) {
            System.out.println("No employees to display.");
            return;
        }

        System.out.println("\nCurrent Employees:");
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + employees[i]);
        }
    }

    private void updateEmployee(Scanner sc) {
        System.out.print("Enter Employee ID to update: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < count; i++) {
            if (employees[i].getId() == id) {

                System.out.print("Enter new Name: ");
                employees[i].setName(sc.nextLine());

                System.out.print("Enter new Department: ");
                employees[i].setDepartment(sc.nextLine());

                System.out.print("Enter new Salary: ");
                employees[i].setSalary(sc.nextDouble());

                System.out.println("Employee updated successfully!");
                return;
            }
        }

        System.out.println("Employee not found.");
    }

    private void deleteEmployee(Scanner sc) {
        System.out.print("Enter Employee ID to delete: ");
        int id = sc.nextInt();

        for (int i = 0; i < count; i++) {
            if (employees[i].getId() == id) {

                for (int j = i; j < count - 1; j++) {
                    employees[j] = employees[j + 1];
                }

                employees[--count] = null;
                System.out.println("Employee deleted successfully!");
                return;
            }
        }

        System.out.println("Employee not found.");
    }

    private void searchEmployee(Scanner sc) {
        System.out.print("Enter Employee ID to search: ");
        int id = sc.nextInt();

        for (int i = 0; i < count; i++) {
            if (employees[i].getId() == id) {
                System.out.println("Found Employee:");
                System.out.println(employees[i]);
                return;
            }
        }

        System.out.println("Employee not found.");
    }

    private void countByDepartment(Scanner sc) {
        sc.nextLine();
        System.out.print("Enter department to count: ");
        String dept = sc.nextLine();

        int deptCount = 0;

        for (int i = 0; i < count; i++) {
            if (employees[i].getDepartment().equalsIgnoreCase(dept)) {
                deptCount++;
            }
        }

        System.out.println("Number of employees in " + dept + ": " + deptCount);
    }
}
