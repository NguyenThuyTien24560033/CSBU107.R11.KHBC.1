# Exercise 2: Test Cases (Input -> Output)

## Test Case 1: Standard Ideal Case (Happy path covering all 6 functions with suggested sample values: FullTime 11,400,000 VND, PartTime 2,000,000 VND, Total 13,400,000 VND)

### Input
```text
1
2
1
FT01
Alice Nguyen
IT
10400000
1000000
26
2
PT01
Bob Tran
HR
40
50000
2
3
1
FT01
4
5
6
```

### Output
```text
=== MENU ===
1. Input a mixed employee list
2. Display payroll
3. Find employees
4. Calculate the total payroll
5. Find the employee with the highest salary
6. Exit
============
Your choice: 1

--- Input Mixed Employee List ---
Enter number of employees (n > 0): 2

Employee #1
Choose Employee type (1. FullTimeEmployee / 2. PartTimeEmployee): 1
Employee ID: FT01
Full Name: Alice Nguyen
Department: IT
Base Salary (>= 0): 10400000
Allowance (>= 0): 1000000
Workdays (0 - 31): 26

Employee #2
Choose Employee type (1. FullTimeEmployee / 2. PartTimeEmployee): 2
Employee ID: PT01
Full Name: Bob Tran
Department: HR
Hours Worked (>= 0): 40
Hourly Rate (>= 0): 50000
Added 2 employee(s) successfully.

=== MENU ===
1. Input a mixed employee list
2. Display payroll
3. Find employees
4. Calculate the total payroll
5. Find the employee with the highest salary
6. Exit
============
Your choice: 2

--- Display Payroll ---
--------------------
Type: FullTimeEmployee
Employee ID: FT01
Full Name: Alice Nguyen
Department: IT
Base Salary: 10,400,000 VND
Allowance: 1,000,000 VND
Workdays: 26
Computed Salary: 11,400,000 VND
--------------------
Type: PartTimeEmployee
Employee ID: PT01
Full Name: Bob Tran
Department: HR
Hours Worked: 40
Hourly Rate: 50,000 VND
Computed Salary: 2,000,000 VND

=== MENU ===
1. Input a mixed employee list
2. Display payroll
3. Find employees
4. Calculate the total payroll
5. Find the employee with the highest salary
6. Exit
============
Your choice: 3

--- Find Employees ---
Choose search option (1. By ID / 2. By Name and Department / 3. By Department): 1
Enter Search ID: FT01
--------------------
Type: FullTimeEmployee
Employee ID: FT01
Full Name: Alice Nguyen
Department: IT
Base Salary: 10,400,000 VND
Allowance: 1,000,000 VND
Workdays: 26
Computed Salary: 11,400,000 VND

=== MENU ===
1. Input a mixed employee list
2. Display payroll
3. Find employees
4. Calculate the total payroll
5. Find the employee with the highest salary
6. Exit
============
Your choice: 4

--- Total Payroll ---
Total payroll: 13,400,000 VND

=== MENU ===
1. Input a mixed employee list
2. Display payroll
3. Find employees
4. Calculate the total payroll
5. Find the employee with the highest salary
6. Exit
============
Your choice: 5

--- Highest Salary Employee ---
Employee with the highest salary (11,400,000 VND):
Type: FullTimeEmployee
Employee ID: FT01
Full Name: Alice Nguyen
Department: IT
Base Salary: 10,400,000 VND
Allowance: 1,000,000 VND
Workdays: 26
Computed Salary: 11,400,000 VND

=== MENU ===
1. Input a mixed employee list
2. Display payroll
3. Find employees
4. Calculate the total payroll
5. Find the employee with the highest salary
6. Exit
============
Your choice: 6
Goodbye!
```

---

## Test Case 2: Boundary Value Testing (Workdays at limits: workdays = 0 and workdays = 31 capping at 26; Search by Department returning multiple employees)

### Input
```text
1
2
1
FT02
Carol Le
Finance
13000000
500000
0
1
FT03
David Pham
Finance
13000000
2000000
31
2
3
3
finance
4
5
6
```

### Output
```text
=== MENU ===
1. Input a mixed employee list
2. Display payroll
3. Find employees
4. Calculate the total payroll
5. Find the employee with the highest salary
6. Exit
============
Your choice: 1

--- Input Mixed Employee List ---
Enter number of employees (n > 0): 2

Employee #1
Choose Employee type (1. FullTimeEmployee / 2. PartTimeEmployee): 1
Employee ID: FT02
Full Name: Carol Le
Department: Finance
Base Salary (>= 0): 13000000
Allowance (>= 0): 500000
Workdays (0 - 31): 0

Employee #2
Choose Employee type (1. FullTimeEmployee / 2. PartTimeEmployee): 1
Employee ID: FT03
Full Name: David Pham
Department: Finance
Base Salary (>= 0): 13000000
Allowance (>= 0): 2000000
Workdays (0 - 31): 31
Added 2 employee(s) successfully.

=== MENU ===
1. Input a mixed employee list
2. Display payroll
3. Find employees
4. Calculate the total payroll
5. Find the employee with the highest salary
6. Exit
============
Your choice: 2

--- Display Payroll ---
--------------------
Type: FullTimeEmployee
Employee ID: FT02
Full Name: Carol Le
Department: Finance
Base Salary: 13,000,000 VND
Allowance: 500,000 VND
Workdays: 0
Computed Salary: 500,000 VND
--------------------
Type: FullTimeEmployee
Employee ID: FT03
Full Name: David Pham
Department: Finance
Base Salary: 13,000,000 VND
Allowance: 2,000,000 VND
Workdays: 31
Computed Salary: 15,000,000 VND

=== MENU ===
1. Input a mixed employee list
2. Display payroll
3. Find employees
4. Calculate the total payroll
5. Find the employee with the highest salary
6. Exit
============
Your choice: 3

--- Find Employees ---
Choose search option (1. By ID / 2. By Name and Department / 3. By Department): 3
Enter Search Department: finance
--------------------
Type: FullTimeEmployee
Employee ID: FT02
Full Name: Carol Le
Department: Finance
Base Salary: 13,000,000 VND
Allowance: 500,000 VND
Workdays: 0
Computed Salary: 500,000 VND
--------------------
Type: FullTimeEmployee
Employee ID: FT03
Full Name: David Pham
Department: Finance
Base Salary: 13,000,000 VND
Allowance: 2,000,000 VND
Workdays: 31
Computed Salary: 15,000,000 VND

=== MENU ===
1. Input a mixed employee list
2. Display payroll
3. Find employees
4. Calculate the total payroll
5. Find the employee with the highest salary
6. Exit
============
Your choice: 4

--- Total Payroll ---
Total payroll: 15,500,000 VND

=== MENU ===
1. Input a mixed employee list
2. Display payroll
3. Find employees
4. Calculate the total payroll
5. Find the employee with the highest salary
6. Exit
============
Your choice: 5

--- Highest Salary Employee ---
Employee with the highest salary (15,000,000 VND):
Type: FullTimeEmployee
Employee ID: FT03
Full Name: David Pham
Department: Finance
Base Salary: 13,000,000 VND
Allowance: 2,000,000 VND
Workdays: 31
Computed Salary: 15,000,000 VND

=== MENU ===
1. Input a mixed employee list
2. Display payroll
3. Find employees
4. Calculate the total payroll
5. Find the employee with the highest salary
6. Exit
============
Your choice: 6
Goodbye!
```

---

## Test Case 3: Numerical Field Violations (Invalid menu 9, n <= 0, invalid type 5, negative salary/allowance/hours/rate, workdays < 0 and > 31, invalid searchType, search not found)

### Input
```text
9
1
0
-1
2
5
1
FT10
Emma Watson
Marketing
-1000
8000000
-500
1000000
-5
35
20
2
PT10
Frank Castle
Security
-10
50
-20000
40000
2
3
0
4
2
Ghost
Unknown
4
5
6
```

### Output
```text
=== MENU ===
1. Input a mixed employee list
2. Display payroll
3. Find employees
4. Calculate the total payroll
5. Find the employee with the highest salary
6. Exit
============
Your choice: 9
Invalid choice.

=== MENU ===
1. Input a mixed employee list
2. Display payroll
3. Find employees
4. Calculate the total payroll
5. Find the employee with the highest salary
6. Exit
============
Your choice: 1

--- Input Mixed Employee List ---
Enter number of employees (n > 0): 0
Invalid number of employees (n > 0). Enter again: -1
Invalid number of employees (n > 0). Enter again: 2

Employee #1
Choose Employee type (1. FullTimeEmployee / 2. PartTimeEmployee): 5
Invalid type. Enter again (1 or 2): 1
Employee ID: FT10
Full Name: Emma Watson
Department: Marketing
Base Salary (>= 0): -1000
Invalid base salary (>= 0). Enter again: 8000000
Allowance (>= 0): -500
Invalid allowance (>= 0). Enter again: 1000000
Workdays (0 - 31): -5
Invalid workdays (0 - 31). Enter again: 35
Invalid workdays (0 - 31). Enter again: 20

Employee #2
Choose Employee type (1. FullTimeEmployee / 2. PartTimeEmployee): 2
Employee ID: PT10
Full Name: Frank Castle
Department: Security
Hours Worked (>= 0): -10
Invalid hours worked (>= 0). Enter again: 50
Hourly Rate (>= 0): -20000
Invalid hourly rate (>= 0). Enter again: 40000
Added 2 employee(s) successfully.

=== MENU ===
1. Input a mixed employee list
2. Display payroll
3. Find employees
4. Calculate the total payroll
5. Find the employee with the highest salary
6. Exit
============
Your choice: 2

--- Display Payroll ---
--------------------
Type: FullTimeEmployee
Employee ID: FT10
Full Name: Emma Watson
Department: Marketing
Base Salary: 8,000,000 VND
Allowance: 1,000,000 VND
Workdays: 20
Computed Salary: 7,153,846 VND
--------------------
Type: PartTimeEmployee
Employee ID: PT10
Full Name: Frank Castle
Department: Security
Hours Worked: 50
Hourly Rate: 40,000 VND
Computed Salary: 2,000,000 VND

=== MENU ===
1. Input a mixed employee list
2. Display payroll
3. Find employees
4. Calculate the total payroll
5. Find the employee with the highest salary
6. Exit
============
Your choice: 3

--- Find Employees ---
Choose search option (1. By ID / 2. By Name and Department / 3. By Department): 0
Invalid option. Enter again (1 - 3): 4
Invalid option. Enter again (1 - 3): 2
Enter Search Name: Ghost
Enter Search Department: Unknown
Employee does not exist.

=== MENU ===
1. Input a mixed employee list
2. Display payroll
3. Find employees
4. Calculate the total payroll
5. Find the employee with the highest salary
6. Exit
============
Your choice: 4

--- Total Payroll ---
Total payroll: 9,153,846 VND

=== MENU ===
1. Input a mixed employee list
2. Display payroll
3. Find employees
4. Calculate the total payroll
5. Find the employee with the highest salary
6. Exit
============
Your choice: 5

--- Highest Salary Employee ---
Employee with the highest salary (7,153,846 VND):
Type: FullTimeEmployee
Employee ID: FT10
Full Name: Emma Watson
Department: Marketing
Base Salary: 8,000,000 VND
Allowance: 1,000,000 VND
Workdays: 20
Computed Salary: 7,153,846 VND

=== MENU ===
1. Input a mixed employee list
2. Display payroll
3. Find employees
4. Calculate the total payroll
5. Find the employee with the highest salary
6. Exit
============
Your choice: 6
Goodbye!
```

---

## Test Case 4: String Violations & Duplicate ID Constraints (Empty ID/Name/Department rejection, case-insensitive duplicate ID rejection, search by Name and Department)

### Input
```text
1
2
1

EMP01

George Clark

Engineering
15000000
3000000
26
2
emp01
EMP02
Hannah Abbott
Engineering
60
100000
2
3
2
george clark
engineering
4
5
6
```

### Output
```text
=== MENU ===
1. Input a mixed employee list
2. Display payroll
3. Find employees
4. Calculate the total payroll
5. Find the employee with the highest salary
6. Exit
============
Your choice: 1

--- Input Mixed Employee List ---
Enter number of employees (n > 0): 2

Employee #1
Choose Employee type (1. FullTimeEmployee / 2. PartTimeEmployee): 1
Employee ID: 
ID must not be empty. Enter again: EMP01
Full Name: 
Full name must not be empty. Enter again: George Clark
Department: 
Department must not be empty. Enter again: Engineering
Base Salary (>= 0): 15000000
Allowance (>= 0): 3000000
Workdays (0 - 31): 26

Employee #2
Choose Employee type (1. FullTimeEmployee / 2. PartTimeEmployee): 2
Employee ID: emp01
Duplicate employee ID. Enter again: EMP02
Full Name: Hannah Abbott
Department: Engineering
Hours Worked (>= 0): 60
Hourly Rate (>= 0): 100000
Added 2 employee(s) successfully.

=== MENU ===
1. Input a mixed employee list
2. Display payroll
3. Find employees
4. Calculate the total payroll
5. Find the employee with the highest salary
6. Exit
============
Your choice: 2

--- Display Payroll ---
--------------------
Type: FullTimeEmployee
Employee ID: EMP01
Full Name: George Clark
Department: Engineering
Base Salary: 15,000,000 VND
Allowance: 3,000,000 VND
Workdays: 26
Computed Salary: 18,000,000 VND
--------------------
Type: PartTimeEmployee
Employee ID: EMP02
Full Name: Hannah Abbott
Department: Engineering
Hours Worked: 60
Hourly Rate: 100,000 VND
Computed Salary: 6,000,000 VND

=== MENU ===
1. Input a mixed employee list
2. Display payroll
3. Find employees
4. Calculate the total payroll
5. Find the employee with the highest salary
6. Exit
============
Your choice: 3

--- Find Employees ---
Choose search option (1. By ID / 2. By Name and Department / 3. By Department): 2
Enter Search Name: george clark
Enter Search Department: engineering
--------------------
Type: FullTimeEmployee
Employee ID: EMP01
Full Name: George Clark
Department: Engineering
Base Salary: 15,000,000 VND
Allowance: 3,000,000 VND
Workdays: 26
Computed Salary: 18,000,000 VND

=== MENU ===
1. Input a mixed employee list
2. Display payroll
3. Find employees
4. Calculate the total payroll
5. Find the employee with the highest salary
6. Exit
============
Your choice: 4

--- Total Payroll ---
Total payroll: 24,000,000 VND

=== MENU ===
1. Input a mixed employee list
2. Display payroll
3. Find employees
4. Calculate the total payroll
5. Find the employee with the highest salary
6. Exit
============
Your choice: 5

--- Highest Salary Employee ---
Employee with the highest salary (18,000,000 VND):
Type: FullTimeEmployee
Employee ID: EMP01
Full Name: George Clark
Department: Engineering
Base Salary: 15,000,000 VND
Allowance: 3,000,000 VND
Workdays: 26
Computed Salary: 18,000,000 VND

=== MENU ===
1. Input a mixed employee list
2. Display payroll
3. Find employees
4. Calculate the total payroll
5. Find the employee with the highest salary
6. Exit
============
Your choice: 6
Goodbye!
```

---

## Test Case 5: Empty Collection & Single-Type Operations (All operations on empty list first, then single-type PartTime add & search non-existent department)

### Input
```text
2
3
4
5
1
1
2
PT99
Ian Wright
Sales
25
60000
2
3
3
IT
4
5
6
```

### Output
```text
=== MENU ===
1. Input a mixed employee list
2. Display payroll
3. Find employees
4. Calculate the total payroll
5. Find the employee with the highest salary
6. Exit
============
Your choice: 2

--- Display Payroll ---
The employee list is empty.

=== MENU ===
1. Input a mixed employee list
2. Display payroll
3. Find employees
4. Calculate the total payroll
5. Find the employee with the highest salary
6. Exit
============
Your choice: 3

--- Find Employees ---
The employee list is empty.

=== MENU ===
1. Input a mixed employee list
2. Display payroll
3. Find employees
4. Calculate the total payroll
5. Find the employee with the highest salary
6. Exit
============
Your choice: 4

--- Total Payroll ---
The employee list is empty.

=== MENU ===
1. Input a mixed employee list
2. Display payroll
3. Find employees
4. Calculate the total payroll
5. Find the employee with the highest salary
6. Exit
============
Your choice: 5

--- Highest Salary Employee ---
The employee list is empty.

=== MENU ===
1. Input a mixed employee list
2. Display payroll
3. Find employees
4. Calculate the total payroll
5. Find the employee with the highest salary
6. Exit
============
Your choice: 1

--- Input Mixed Employee List ---
Enter number of employees (n > 0): 1

Employee #1
Choose Employee type (1. FullTimeEmployee / 2. PartTimeEmployee): 2
Employee ID: PT99
Full Name: Ian Wright
Department: Sales
Hours Worked (>= 0): 25
Hourly Rate (>= 0): 60000
Added 1 employee(s) successfully.

=== MENU ===
1. Input a mixed employee list
2. Display payroll
3. Find employees
4. Calculate the total payroll
5. Find the employee with the highest salary
6. Exit
============
Your choice: 2

--- Display Payroll ---
--------------------
Type: PartTimeEmployee
Employee ID: PT99
Full Name: Ian Wright
Department: Sales
Hours Worked: 25
Hourly Rate: 60,000 VND
Computed Salary: 1,500,000 VND

=== MENU ===
1. Input a mixed employee list
2. Display payroll
3. Find employees
4. Calculate the total payroll
5. Find the employee with the highest salary
6. Exit
============
Your choice: 3

--- Find Employees ---
Choose search option (1. By ID / 2. By Name and Department / 3. By Department): 3
Enter Search Department: IT
No employee found in this department.

=== MENU ===
1. Input a mixed employee list
2. Display payroll
3. Find employees
4. Calculate the total payroll
5. Find the employee with the highest salary
6. Exit
============
Your choice: 4

--- Total Payroll ---
Total payroll: 1,500,000 VND

=== MENU ===
1. Input a mixed employee list
2. Display payroll
3. Find employees
4. Calculate the total payroll
5. Find the employee with the highest salary
6. Exit
============
Your choice: 5

--- Highest Salary Employee ---
Employee with the highest salary (1,500,000 VND):
Type: PartTimeEmployee
Employee ID: PT99
Full Name: Ian Wright
Department: Sales
Hours Worked: 25
Hourly Rate: 60,000 VND
Computed Salary: 1,500,000 VND

=== MENU ===
1. Input a mixed employee list
2. Display payroll
3. Find employees
4. Calculate the total payroll
5. Find the employee with the highest salary
6. Exit
============
Your choice: 6
Goodbye!
```
