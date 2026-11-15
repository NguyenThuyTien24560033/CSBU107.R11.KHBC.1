import java.util.ArrayList;
import java.util.Scanner;

abstract class Employee {
    private String employeeID;
    private String fullName;
    private String department;

    public Employee(String employeeID, String fullName, String department) {
        if (employeeID == null || employeeID.trim().isEmpty()) {
            throw new IllegalArgumentException("Employee ID cannot be empty.");
        }
        if (fullName == null || fullName.trim().isEmpty()) {
            throw new IllegalArgumentException("Full name cannot be empty.");
        }
        if (department == null || department.trim().isEmpty()) {
            throw new IllegalArgumentException("Department cannot be empty.");
        }
        this.employeeID = employeeID.trim();
        this.fullName = fullName.trim();
        this.department = department.trim();
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public String getFullName() {
        return fullName;
    }

    public String getDepartment() {
        return department;
    }

    public abstract double calculateSalary();

    public void displayPayroll() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Full Name: " + fullName);
        System.out.println("Department: " + department);
    }
}

class FullTimeEmployee extends Employee {
    private double baseSalary;
    private double allowance;
    private int workdays;

    public FullTimeEmployee(String employeeID, String fullName, String department,
                            double baseSalary, double allowance, int workdays) {
        super(employeeID, fullName, department);
        if (baseSalary < 0 || allowance < 0 || workdays < 0 || workdays > 31) {
            throw new IllegalArgumentException("Invalid salary, allowance, or workdays.");
        }
        this.baseSalary = baseSalary;
        this.allowance = allowance;
        this.workdays = workdays;
    }

    @Override
    public double calculateSalary() {
        return (baseSalary * Math.min(workdays, 26) / 26.0) + allowance;
    }

    @Override
    public void displayPayroll() {
        System.out.println("Type: FullTimeEmployee");
        super.displayPayroll();
        System.out.println("Base Salary: " + String.format("%,.0f", baseSalary) + " VND");
        System.out.println("Allowance: " + String.format("%,.0f", allowance) + " VND");
        System.out.println("Workdays: " + workdays);
        System.out.println("Computed Salary: " + String.format("%,.0f", this.calculateSalary()) + 
        " VND");
    }
}

class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(String employeeID, String fullName, String department,
                            int hoursWorked, double hourlyRate) {
        super(employeeID, fullName, department);
        if (hoursWorked < 0 || hourlyRate < 0) {
            throw new IllegalArgumentException("Hours worked and hourly rate must be non-negative.");
        }
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }

    @Override
    public void displayPayroll() {
        System.out.println("Type: PartTimeEmployee");
        super.displayPayroll();
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Hourly Rate: " + String.format("%,.0f", hourlyRate) + " VND");
        System.out.println("Computed Salary: " + String.format("%,.0f", this.calculateSalary()) + " VND");
    }
}

class Main {
    public static void findEmployee(String id, ArrayList<Employee> employees) {
        boolean found = false;
        for (Employee employee : employees) {
            if (id.trim().equalsIgnoreCase(employee.getEmployeeID())) {
                found = true;
                System.out.println("--------------------");
                employee.displayPayroll();
            }
        }
        if (!found) {
            System.out.println("Employee does not exist.");
        }
    }

    public static void findEmployee(String name, String department, ArrayList<Employee> employees) {
        boolean found = false;
        for (Employee employee : employees) {
            if (name.trim().equalsIgnoreCase(employee.getFullName())
                    && department.trim().equalsIgnoreCase(employee.getDepartment())) {
                found = true;
                System.out.println("--------------------");
                employee.displayPayroll();
            }
        }
        if (!found) {
            System.out.println("Employee does not exist.");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();
        int choice;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Input a mixed employee list");
            System.out.println("2. Display payroll");
            System.out.println("3. Find employees");
            System.out.println("4. Calculate the total payroll");
            System.out.println("5. Find the employee with the highest salary");
            System.out.println("6. Exit");
            System.out.println("============");
            System.out.print("Your choice: ");
            choice = Integer.parseInt(input.nextLine().trim());

            switch (choice) {
                case 1: {
                    System.out.println("\n--- Input Mixed Employee List ---");
                    System.out.print("Enter number of employees (n > 0): ");
                    int n = Integer.parseInt(input.nextLine().trim());
                    while (n < 1) {
                        System.out.print("Invalid number of employees (n > 0). Enter again: ");
                        n = Integer.parseInt(input.nextLine().trim());
                    }

                    for (int i = 0; i < n; i++) {
                        System.out.println("\nEmployee #" + (i + 1));
                        System.out.print("Choose Employee type (1. FullTimeEmployee / 2. PartTimeEmployee): ");
                        int type = Integer.parseInt(input.nextLine().trim());
                        while (type != 1 && type != 2) {
                            System.out.print("Invalid type. Enter again (1 or 2): ");
                            type = Integer.parseInt(input.nextLine().trim());
                        }

                        System.out.print("Employee ID: ");
                        String employeeID = input.nextLine().trim();
                        while (true) {
                            boolean duplicate = false;
                            for (Employee employee : employees) {
                                if (employee.getEmployeeID().equalsIgnoreCase(employeeID)) {
                                    duplicate = true;
                                }
                            }
                            if (employeeID.isEmpty()) {
                                System.out.print("ID must not be empty. Enter again: ");
                                employeeID = input.nextLine().trim();
                            } else if (duplicate) {
                                System.out.print("Duplicate employee ID. Enter again: ");
                                employeeID = input.nextLine().trim();
                            } else {
                                break;
                            }
                        }

                        System.out.print("Full Name: ");
                        String fullName = input.nextLine().trim();
                        while (fullName.isEmpty()) {
                            System.out.print("Full name must not be empty. Enter again: ");
                            fullName = input.nextLine().trim();
                        }

                        System.out.print("Department: ");
                        String department = input.nextLine().trim();
                        while (department.isEmpty()) {
                            System.out.print("Department must not be empty. Enter again: ");
                            department = input.nextLine().trim();
                        }

                        if (type == 1) {
                            System.out.print("Base Salary (>= 0): ");
                            double baseSalary = Double.parseDouble(input.nextLine().trim());
                            while (baseSalary < 0) {
                                System.out.print("Invalid base salary (>= 0). Enter again: ");
                                baseSalary = Double.parseDouble(input.nextLine().trim());
                            }

                            System.out.print("Allowance (>= 0): ");
                            double allowance = Double.parseDouble(input.nextLine().trim());
                            while (allowance < 0) {
                                System.out.print("Invalid allowance (>= 0). Enter again: ");
                                allowance = Double.parseDouble(input.nextLine().trim());
                            }

                            System.out.print("Workdays (0 - 31): ");
                            int workdays = Integer.parseInt(input.nextLine().trim());
                            while (workdays < 0 || workdays > 31) {
                                System.out.print("Invalid workdays (0 - 31). Enter again: ");
                                workdays = Integer.parseInt(input.nextLine().trim());
                            }

                            employees.add(new FullTimeEmployee(employeeID, fullName, department, baseSalary, allowance, workdays));
                        } else {
                            System.out.print("Hours Worked (>= 0): ");
                            int hoursWorked = Integer.parseInt(input.nextLine().trim());
                            while (hoursWorked < 0) {
                                System.out.print("Invalid hours worked (>= 0). Enter again: ");
                                hoursWorked = Integer.parseInt(input.nextLine().trim());
                            }

                            System.out.print("Hourly Rate (>= 0): ");
                            double hourlyRate = Double.parseDouble(input.nextLine().trim());
                            while (hourlyRate < 0) {
                                System.out.print("Invalid hourly rate (>= 0). Enter again: ");
                                hourlyRate = Double.parseDouble(input.nextLine().trim());
                            }

                            employees.add(new PartTimeEmployee(employeeID, fullName, department, hoursWorked, hourlyRate));
                        }
                    }
                    System.out.println("Added " + n + " employee(s) successfully.");
                    break;
                }

                case 2: {
                    System.out.println("\n--- Display Payroll ---");
                    if (employees.isEmpty()) {
                        System.out.println("The employee list is empty.");
                    } else {
                        for (Employee employee : employees) {
                            System.out.println("--------------------");
                            employee.displayPayroll();
                        }
                    }
                    break;
                }

                case 3: {
                    System.out.println("\n--- Find Employees ---");
                    if (employees.isEmpty()) {
                        System.out.println("The employee list is empty.");
                    } else {
                        System.out.print("Choose search option (1. By ID / 2. By Name and Department / 3. By Department): ");
                        int searchType = Integer.parseInt(input.nextLine().trim());
                        while (searchType < 1 || searchType > 3) {
                            System.out.print("Invalid option. Enter again (1 - 3): ");
                            searchType = Integer.parseInt(input.nextLine().trim());
                        }

                        if (searchType == 1) {
                            System.out.print("Enter Search ID: ");
                            String searchID = input.nextLine().trim();
                            findEmployee(searchID, employees);
                        } else if (searchType == 2) {
                            System.out.print("Enter Search Name: ");
                            String name = input.nextLine().trim();
                            System.out.print("Enter Search Department: ");
                            String depart = input.nextLine().trim();
                            findEmployee(name, depart, employees);
                        } else {
                            System.out.print("Enter Search Department: ");
                            String depart = input.nextLine().trim();
                            boolean found = false;
                            for (Employee employee : employees) {
                                if (depart.equalsIgnoreCase(employee.getDepartment())) {
                                    found = true;
                                    System.out.println("--------------------");
                                    employee.displayPayroll();
                                }
                            }
                            if (!found) {
                                System.out.println("No employee found in this department.");
                            }
                        }
                    }
                    break;
                }

                case 4: {
                    System.out.println("\n--- Total Payroll ---");
                    if (employees.isEmpty()) {
                        System.out.println("The employee list is empty.");
                    } else {
                        double total = 0;
                        for (Employee employee : employees) {
                            total += employee.calculateSalary();
                        }
                        System.out.println("Total payroll: " + String.format("%,.0f", total) + " VND");
                    }
                    break;
                }

                case 5: {
                    System.out.println("\n--- Highest Salary Employee ---");
                    if (employees.isEmpty()) {
                        System.out.println("The employee list is empty.");
                    } else {
                        Employee highest = employees.get(0);
                        for (Employee employee : employees) {
                            if (employee.calculateSalary() > highest.calculateSalary()) {
                                highest = employee;
                            }
                        }
                        System.out.println("Employee with the highest salary ("
                                + String.format("%,.0f", highest.calculateSalary()) + " VND):");
                        highest.displayPayroll();
                    }
                    break;
                }

                case 6:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 6);
        input.close();
    }
}