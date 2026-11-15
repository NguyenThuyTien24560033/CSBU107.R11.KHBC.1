# Exercise 5: Test Cases (Input -> Output)

## Test Case 1: Standard Ideal Case (Happy path covering all 8 functions with suggested sample values: Theory 27,000,000 VND, Lab 13,000,000 VND, Total 40,000,000 VND, Weighted Average 1,333,333.33 VND)

### Input
```text
1
2
1
IT001
Intro to Programming
3
20
2
IT002
OOP Lab
2
10
100000
2
3
IT001
4
5
6
7
8
```

### Output
```text
=== MENU ===
1. Add courses
2. Display all courses
3. Search by course code
4. Course with the largest expected collection
5. Total expected collection
6. Count Theory and Lab courses
7. Average tuition per student
8. Exit
============
Your choice: 1

--- Add Courses ---
Enter number of courses (n > 0): 2

Course 1/2
Choose course type (1. TheoryCourse / 2. LabCourse): 1
Course Code: IT001
Course Name: Intro to Programming
Credits (>= 1): 3
Registered Students (>= 0): 20

Course 2/2
Choose course type (1. TheoryCourse / 2. LabCourse): 2
Course Code: IT002
Course Name: OOP Lab
Credits (>= 1): 2
Registered Students (>= 0): 10
Equipment Fee Per Student (>= 0): 100000
Added 2 course(s) successfully.

=== MENU ===
1. Add courses
2. Display all courses
3. Search by course code
4. Course with the largest expected collection
5. Total expected collection
6. Count Theory and Lab courses
7. Average tuition per student
8. Exit
============
Your choice: 2

--- Display All Courses ---

Course 1
Type: TheoryCourse
Course Code: IT001
Course Name: Intro to Programming
Credits: 3
Registered Students: 20
Tuition Per Student: 1,350,000 VND
Expected Collection: 27,000,000 VND

Course 2
Type: LabCourse
Course Code: IT002
Course Name: OOP Lab
Credits: 2
Registered Students: 10
Equipment Fee Per Student: 100,000 VND
Tuition Per Student: 1,300,000 VND
Expected Collection: 13,000,000 VND

=== MENU ===
1. Add courses
2. Display all courses
3. Search by course code
4. Course with the largest expected collection
5. Total expected collection
6. Count Theory and Lab courses
7. Average tuition per student
8. Exit
============
Your choice: 3

--- Search By Course Code ---
Enter course code to search: IT001

Type: TheoryCourse
Course Code: IT001
Course Name: Intro to Programming
Credits: 3
Registered Students: 20
Tuition Per Student: 1,350,000 VND
Expected Collection: 27,000,000 VND

=== MENU ===
1. Add courses
2. Display all courses
3. Search by course code
4. Course with the largest expected collection
5. Total expected collection
6. Count Theory and Lab courses
7. Average tuition per student
8. Exit
============
Your choice: 4

--- Largest Expected Collection ---
The largest expected collection: 27,000,000 VND
Type: TheoryCourse
Course Code: IT001
Course Name: Intro to Programming
Credits: 3
Registered Students: 20
Tuition Per Student: 1,350,000 VND
Expected Collection: 27,000,000 VND

=== MENU ===
1. Add courses
2. Display all courses
3. Search by course code
4. Course with the largest expected collection
5. Total expected collection
6. Count Theory and Lab courses
7. Average tuition per student
8. Exit
============
Your choice: 5

--- Total Expected Collection ---
Total expected collection: 40,000,000 VND

=== MENU ===
1. Add courses
2. Display all courses
3. Search by course code
4. Course with the largest expected collection
5. Total expected collection
6. Count Theory and Lab courses
7. Average tuition per student
8. Exit
============
Your choice: 6

--- Count Theory And Lab Courses ---
TheoryCourse: 1
LabCourse: 1

=== MENU ===
1. Add courses
2. Display all courses
3. Search by course code
4. Course with the largest expected collection
5. Total expected collection
6. Count Theory and Lab courses
7. Average tuition per student
8. Exit
============
Your choice: 7

--- Average Tuition Per Student ---
Average tuition per student: 1,333,333.33 VND

=== MENU ===
1. Add courses
2. Display all courses
3. Search by course code
4. Course with the largest expected collection
5. Total expected collection
6. Count Theory and Lab courses
7. Average tuition per student
8. Exit
============
Your choice: 8
Goodbye!
```

---

## Test Case 2: Boundary Value Testing (0 registered students testing N/A weighted average, 1 minimum credit, 0 equipment fee, case-insensitive search)

### Input
```text
1
2
1
CS101
Discrete Math
1
0
2
CS102
Hardware Lab
1
0
0
2
3
cs102
4
5
6
7
8
```

### Output
```text
=== MENU ===
1. Add courses
2. Display all courses
3. Search by course code
4. Course with the largest expected collection
5. Total expected collection
6. Count Theory and Lab courses
7. Average tuition per student
8. Exit
============
Your choice: 1

--- Add Courses ---
Enter number of courses (n > 0): 2

Course 1/2
Choose course type (1. TheoryCourse / 2. LabCourse): 1
Course Code: CS101
Course Name: Discrete Math
Credits (>= 1): 1
Registered Students (>= 0): 0

Course 2/2
Choose course type (1. TheoryCourse / 2. LabCourse): 2
Course Code: CS102
Course Name: Hardware Lab
Credits (>= 1): 1
Registered Students (>= 0): 0
Equipment Fee Per Student (>= 0): 0
Added 2 course(s) successfully.

=== MENU ===
1. Add courses
2. Display all courses
3. Search by course code
4. Course with the largest expected collection
5. Total expected collection
6. Count Theory and Lab courses
7. Average tuition per student
8. Exit
============
Your choice: 2

--- Display All Courses ---

Course 1
Type: TheoryCourse
Course Code: CS101
Course Name: Discrete Math
Credits: 1
Registered Students: 0
Tuition Per Student: 450,000 VND
Expected Collection: 0 VND

Course 2
Type: LabCourse
Course Code: CS102
Course Name: Hardware Lab
Credits: 1
Registered Students: 0
Equipment Fee Per Student: 0 VND
Tuition Per Student: 600,000 VND
Expected Collection: 0 VND

=== MENU ===
1. Add courses
2. Display all courses
3. Search by course code
4. Course with the largest expected collection
5. Total expected collection
6. Count Theory and Lab courses
7. Average tuition per student
8. Exit
============
Your choice: 3

--- Search By Course Code ---
Enter course code to search: cs102

Type: LabCourse
Course Code: CS102
Course Name: Hardware Lab
Credits: 1
Registered Students: 0
Equipment Fee Per Student: 0 VND
Tuition Per Student: 600,000 VND
Expected Collection: 0 VND

=== MENU ===
1. Add courses
2. Display all courses
3. Search by course code
4. Course with the largest expected collection
5. Total expected collection
6. Count Theory and Lab courses
7. Average tuition per student
8. Exit
============
Your choice: 4

--- Largest Expected Collection ---
The largest expected collection: 0 VND
Type: TheoryCourse
Course Code: CS101
Course Name: Discrete Math
Credits: 1
Registered Students: 0
Tuition Per Student: 450,000 VND
Expected Collection: 0 VND

=== MENU ===
1. Add courses
2. Display all courses
3. Search by course code
4. Course with the largest expected collection
5. Total expected collection
6. Count Theory and Lab courses
7. Average tuition per student
8. Exit
============
Your choice: 5

--- Total Expected Collection ---
Total expected collection: 0 VND

=== MENU ===
1. Add courses
2. Display all courses
3. Search by course code
4. Course with the largest expected collection
5. Total expected collection
6. Count Theory and Lab courses
7. Average tuition per student
8. Exit
============
Your choice: 6

--- Count Theory And Lab Courses ---
TheoryCourse: 1
LabCourse: 1

=== MENU ===
1. Add courses
2. Display all courses
3. Search by course code
4. Course with the largest expected collection
5. Total expected collection
6. Count Theory and Lab courses
7. Average tuition per student
8. Exit
============
Your choice: 7

--- Average Tuition Per Student ---
Average tuition per student: N/A

=== MENU ===
1. Add courses
2. Display all courses
3. Search by course code
4. Course with the largest expected collection
5. Total expected collection
6. Count Theory and Lab courses
7. Average tuition per student
8. Exit
============
Your choice: 8
Goodbye!
```

---

## Test Case 3: Numerical Field Violations (Invalid menu 9, n <= 0, invalid course type 3, credits < 1, students < 0, equipment fee < 0, search course not found)

### Input
```text
9
1
0
-2
2
3
1
MATH01
Calculus
0
-1
4
-5
15
2
PHYS01
Physics Lab
0
3
-2
25
-50000
200000
2
3
BIO99
4
5
6
7
8
```

### Output
```text
=== MENU ===
1. Add courses
2. Display all courses
3. Search by course code
4. Course with the largest expected collection
5. Total expected collection
6. Count Theory and Lab courses
7. Average tuition per student
8. Exit
============
Your choice: 9
Invalid choice.

=== MENU ===
1. Add courses
2. Display all courses
3. Search by course code
4. Course with the largest expected collection
5. Total expected collection
6. Count Theory and Lab courses
7. Average tuition per student
8. Exit
============
Your choice: 1

--- Add Courses ---
Enter number of courses (n > 0): 0
Invalid number of courses (n > 0). Enter again: -2
Invalid number of courses (n > 0). Enter again: 2

Course 1/2
Choose course type (1. TheoryCourse / 2. LabCourse): 3
Invalid course type. Enter again (1 or 2): 1
Course Code: MATH01
Course Name: Calculus
Credits (>= 1): 0
Invalid credits (>= 1). Enter again: -1
Invalid credits (>= 1). Enter again: 4
Registered Students (>= 0): -5
Invalid registered students (>= 0). Enter again: 15

Course 2/2
Choose course type (1. TheoryCourse / 2. LabCourse): 2
Course Code: PHYS01
Course Name: Physics Lab
Credits (>= 1): 0
Invalid credits (>= 1). Enter again: 3
Registered Students (>= 0): -2
Invalid registered students (>= 0). Enter again: 25
Equipment Fee Per Student (>= 0): -50000
Invalid equipment fee (>= 0). Enter again: 200000
Added 2 course(s) successfully.

=== MENU ===
1. Add courses
2. Display all courses
3. Search by course code
4. Course with the largest expected collection
5. Total expected collection
6. Count Theory and Lab courses
7. Average tuition per student
8. Exit
============
Your choice: 2

--- Display All Courses ---

Course 1
Type: TheoryCourse
Course Code: MATH01
Course Name: Calculus
Credits: 4
Registered Students: 15
Tuition Per Student: 1,800,000 VND
Expected Collection: 27,000,000 VND

Course 2
Type: LabCourse
Course Code: PHYS01
Course Name: Physics Lab
Credits: 3
Registered Students: 25
Equipment Fee Per Student: 200,000 VND
Tuition Per Student: 2,000,000 VND
Expected Collection: 50,000,000 VND

=== MENU ===
1. Add courses
2. Display all courses
3. Search by course code
4. Course with the largest expected collection
5. Total expected collection
6. Count Theory and Lab courses
7. Average tuition per student
8. Exit
============
Your choice: 3

--- Search By Course Code ---
Enter course code to search: BIO99
The course does not exist.

=== MENU ===
1. Add courses
2. Display all courses
3. Search by course code
4. Course with the largest expected collection
5. Total expected collection
6. Count Theory and Lab courses
7. Average tuition per student
8. Exit
============
Your choice: 4

--- Largest Expected Collection ---
The largest expected collection: 50,000,000 VND
Type: LabCourse
Course Code: PHYS01
Course Name: Physics Lab
Credits: 3
Registered Students: 25
Equipment Fee Per Student: 200,000 VND
Tuition Per Student: 2,000,000 VND
Expected Collection: 50,000,000 VND

=== MENU ===
1. Add courses
2. Display all courses
3. Search by course code
4. Course with the largest expected collection
5. Total expected collection
6. Count Theory and Lab courses
7. Average tuition per student
8. Exit
============
Your choice: 5

--- Total Expected Collection ---
Total expected collection: 77,000,000 VND

=== MENU ===
1. Add courses
2. Display all courses
3. Search by course code
4. Course with the largest expected collection
5. Total expected collection
6. Count Theory and Lab courses
7. Average tuition per student
8. Exit
============
Your choice: 6

--- Count Theory And Lab Courses ---
TheoryCourse: 1
LabCourse: 1

=== MENU ===
1. Add courses
2. Display all courses
3. Search by course code
4. Course with the largest expected collection
5. Total expected collection
6. Count Theory and Lab courses
7. Average tuition per student
8. Exit
============
Your choice: 7

--- Average Tuition Per Student ---
Average tuition per student: 1,925,000.00 VND

=== MENU ===
1. Add courses
2. Display all courses
3. Search by course code
4. Course with the largest expected collection
5. Total expected collection
6. Count Theory and Lab courses
7. Average tuition per student
8. Exit
============
Your choice: 8
Goodbye!
```

---

## Test Case 4: String Violations & Duplicate Code Constraints (Empty Course Code/Name rejection, case-insensitive duplicate Code rejection, searching case-insensitively)

### Input
```text
1
2
1

ENG01

English for IT
2
40
2
eng01
ENG02
English Communication Lab
2
20
150000
2
3
eng02
4
5
6
7
8
```

### Output
```text
=== MENU ===
1. Add courses
2. Display all courses
3. Search by course code
4. Course with the largest expected collection
5. Total expected collection
6. Count Theory and Lab courses
7. Average tuition per student
8. Exit
============
Your choice: 1

--- Add Courses ---
Enter number of courses (n > 0): 2

Course 1/2
Choose course type (1. TheoryCourse / 2. LabCourse): 1
Course Code: 
Course code must not be empty. Enter again: ENG01
Course Name: 
Course name must not be empty. Enter again: English for IT
Credits (>= 1): 2
Registered Students (>= 0): 40

Course 2/2
Choose course type (1. TheoryCourse / 2. LabCourse): 2
Course Code: eng01
Duplicate course code. Enter again: ENG02
Course Name: English Communication Lab
Credits (>= 1): 2
Registered Students (>= 0): 20
Equipment Fee Per Student (>= 0): 150000
Added 2 course(s) successfully.

=== MENU ===
1. Add courses
2. Display all courses
3. Search by course code
4. Course with the largest expected collection
5. Total expected collection
6. Count Theory and Lab courses
7. Average tuition per student
8. Exit
============
Your choice: 2

--- Display All Courses ---

Course 1
Type: TheoryCourse
Course Code: ENG01
Course Name: English for IT
Credits: 2
Registered Students: 40
Tuition Per Student: 900,000 VND
Expected Collection: 36,000,000 VND

Course 2
Type: LabCourse
Course Code: ENG02
Course Name: English Communication Lab
Credits: 2
Registered Students: 20
Equipment Fee Per Student: 150,000 VND
Tuition Per Student: 1,350,000 VND
Expected Collection: 27,000,000 VND

=== MENU ===
1. Add courses
2. Display all courses
3. Search by course code
4. Course with the largest expected collection
5. Total expected collection
6. Count Theory and Lab courses
7. Average tuition per student
8. Exit
============
Your choice: 3

--- Search By Course Code ---
Enter course code to search: eng02

Type: LabCourse
Course Code: ENG02
Course Name: English Communication Lab
Credits: 2
Registered Students: 20
Equipment Fee Per Student: 150,000 VND
Tuition Per Student: 1,350,000 VND
Expected Collection: 27,000,000 VND

=== MENU ===
1. Add courses
2. Display all courses
3. Search by course code
4. Course with the largest expected collection
5. Total expected collection
6. Count Theory and Lab courses
7. Average tuition per student
8. Exit
============
Your choice: 4

--- Largest Expected Collection ---
The largest expected collection: 36,000,000 VND
Type: TheoryCourse
Course Code: ENG01
Course Name: English for IT
Credits: 2
Registered Students: 40
Tuition Per Student: 900,000 VND
Expected Collection: 36,000,000 VND

=== MENU ===
1. Add courses
2. Display all courses
3. Search by course code
4. Course with the largest expected collection
5. Total expected collection
6. Count Theory and Lab courses
7. Average tuition per student
8. Exit
============
Your choice: 5

--- Total Expected Collection ---
Total expected collection: 63,000,000 VND

=== MENU ===
1. Add courses
2. Display all courses
3. Search by course code
4. Course with the largest expected collection
5. Total expected collection
6. Count Theory and Lab courses
7. Average tuition per student
8. Exit
============
Your choice: 6

--- Count Theory And Lab Courses ---
TheoryCourse: 1
LabCourse: 1

=== MENU ===
1. Add courses
2. Display all courses
3. Search by course code
4. Course with the largest expected collection
5. Total expected collection
6. Count Theory and Lab courses
7. Average tuition per student
8. Exit
============
Your choice: 7

--- Average Tuition Per Student ---
Average tuition per student: 1,050,000.00 VND

=== MENU ===
1. Add courses
2. Display all courses
3. Search by course code
4. Course with the largest expected collection
5. Total expected collection
6. Count Theory and Lab courses
7. Average tuition per student
8. Exit
============
Your choice: 8
Goodbye!
```

---

## Test Case 5: Empty Collection Operations & Single-Course Addition (All operations on empty list first verifying N/A average, then single LabCourse addition)

### Input
```text
2
3
4
5
6
7
1
1
2
DATA01
Big Data Lab
3
10
50000
2
3
DATA01
4
5
6
7
8
```

### Output
```text
=== MENU ===
1. Add courses
2. Display all courses
3. Search by course code
4. Course with the largest expected collection
5. Total expected collection
6. Count Theory and Lab courses
7. Average tuition per student
8. Exit
============
Your choice: 2

--- Display All Courses ---
The course list is empty.

=== MENU ===
1. Add courses
2. Display all courses
3. Search by course code
4. Course with the largest expected collection
5. Total expected collection
6. Count Theory and Lab courses
7. Average tuition per student
8. Exit
============
Your choice: 3

--- Search By Course Code ---
The course list is empty.

=== MENU ===
1. Add courses
2. Display all courses
3. Search by course code
4. Course with the largest expected collection
5. Total expected collection
6. Count Theory and Lab courses
7. Average tuition per student
8. Exit
============
Your choice: 4

--- Largest Expected Collection ---
The course list is empty.

=== MENU ===
1. Add courses
2. Display all courses
3. Search by course code
4. Course with the largest expected collection
5. Total expected collection
6. Count Theory and Lab courses
7. Average tuition per student
8. Exit
============
Your choice: 5

--- Total Expected Collection ---
Total expected collection: 0 VND

=== MENU ===
1. Add courses
2. Display all courses
3. Search by course code
4. Course with the largest expected collection
5. Total expected collection
6. Count Theory and Lab courses
7. Average tuition per student
8. Exit
============
Your choice: 6

--- Count Theory And Lab Courses ---
TheoryCourse: 0
LabCourse: 0

=== MENU ===
1. Add courses
2. Display all courses
3. Search by course code
4. Course with the largest expected collection
5. Total expected collection
6. Count Theory and Lab courses
7. Average tuition per student
8. Exit
============
Your choice: 7

--- Average Tuition Per Student ---
Average tuition per student: N/A

=== MENU ===
1. Add courses
2. Display all courses
3. Search by course code
4. Course with the largest expected collection
5. Total expected collection
6. Count Theory and Lab courses
7. Average tuition per student
8. Exit
============
Your choice: 1

--- Add Courses ---
Enter number of courses (n > 0): 1

Course 1/1
Choose course type (1. TheoryCourse / 2. LabCourse): 2
Course Code: DATA01
Course Name: Big Data Lab
Credits (>= 1): 3
Registered Students (>= 0): 10
Equipment Fee Per Student (>= 0): 50000
Added 1 course(s) successfully.

=== MENU ===
1. Add courses
2. Display all courses
3. Search by course code
4. Course with the largest expected collection
5. Total expected collection
6. Count Theory and Lab courses
7. Average tuition per student
8. Exit
============
Your choice: 2

--- Display All Courses ---

Course 1
Type: LabCourse
Course Code: DATA01
Course Name: Big Data Lab
Credits: 3
Registered Students: 10
Equipment Fee Per Student: 50,000 VND
Tuition Per Student: 1,850,000 VND
Expected Collection: 18,500,000 VND

=== MENU ===
1. Add courses
2. Display all courses
3. Search by course code
4. Course with the largest expected collection
5. Total expected collection
6. Count Theory and Lab courses
7. Average tuition per student
8. Exit
============
Your choice: 3

--- Search By Course Code ---
Enter course code to search: DATA01

Type: LabCourse
Course Code: DATA01
Course Name: Big Data Lab
Credits: 3
Registered Students: 10
Equipment Fee Per Student: 50,000 VND
Tuition Per Student: 1,850,000 VND
Expected Collection: 18,500,000 VND

=== MENU ===
1. Add courses
2. Display all courses
3. Search by course code
4. Course with the largest expected collection
5. Total expected collection
6. Count Theory and Lab courses
7. Average tuition per student
8. Exit
============
Your choice: 4

--- Largest Expected Collection ---
The largest expected collection: 18,500,000 VND
Type: LabCourse
Course Code: DATA01
Course Name: Big Data Lab
Credits: 3
Registered Students: 10
Equipment Fee Per Student: 50,000 VND
Tuition Per Student: 1,850,000 VND
Expected Collection: 18,500,000 VND

=== MENU ===
1. Add courses
2. Display all courses
3. Search by course code
4. Course with the largest expected collection
5. Total expected collection
6. Count Theory and Lab courses
7. Average tuition per student
8. Exit
============
Your choice: 5

--- Total Expected Collection ---
Total expected collection: 18,500,000 VND

=== MENU ===
1. Add courses
2. Display all courses
3. Search by course code
4. Course with the largest expected collection
5. Total expected collection
6. Count Theory and Lab courses
7. Average tuition per student
8. Exit
============
Your choice: 6

--- Count Theory And Lab Courses ---
TheoryCourse: 0
LabCourse: 1

=== MENU ===
1. Add courses
2. Display all courses
3. Search by course code
4. Course with the largest expected collection
5. Total expected collection
6. Count Theory and Lab courses
7. Average tuition per student
8. Exit
============
Your choice: 7

--- Average Tuition Per Student ---
Average tuition per student: 1,850,000.00 VND

=== MENU ===
1. Add courses
2. Display all courses
3. Search by course code
4. Course with the largest expected collection
5. Total expected collection
6. Count Theory and Lab courses
7. Average tuition per student
8. Exit
============
Your choice: 8
Goodbye!
```
