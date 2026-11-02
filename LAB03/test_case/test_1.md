# Test Cases: University Student Graduation Management (Interactive Terminal View)

This document presents the test cases as realistic interactive console sessions. Inputs entered by the user are highlighted next to the prompt.

---

## Test Case 1: Mixed Input with Eligibility & Best Student Output

### Description
Tests entering two students (one College, one University). College student meets all criteria; University student fails total credits criteria. Tests calculation of eligibility and display of best University student.

### Interactive Console Session

```text
Enter number of students: 2

Student1
Type(1-College, 2-University): 1

Student ID: SV01
Full Name: Nguyen Van A
Address: Ha Noi
Total Credits: 125
GPA: 6.5

Graduation Exam Score: 7.0

Student2
Type(1-College, 2-University): 2

Student ID: SV02
Full Name: Tran Thi B
Address: Da Nang
Total Credits: 165
GPA: 8.0

Thesis Title: AI Research
Thesis Score: 9.0

Eligible students: 1

Eligible University students: 0

Eligible College students: 1

Student ID: SV02
Full Name: Tran Thi B
Address: Da Nang
Total Credits: 165
GPA: 8.0
Thesis Title: AI Research
Thesis Score: 9.0
```

---

## Test Case 2: Validation Handling & Input Retry Loop

### Description
Tests how the program handles invalid input (invalid type, out-of-range GPA/Credits, out-of-range Exam Score) and verifies that the loop decrements `i` to retry input until valid values are supplied.

### Interactive Console Session

```text
Enter number of students: 1

Student1
Type(1-College, 2-University): 3
Invalid student type.

Student1
Type(1-College, 2-University): 1

Student ID: SV01
Full Name: Nguyen Van A
Address: Ha Noi
Total Credits: 100
GPA: 11.0
Invalid Total Credits or GPA

Student1
Type(1-College, 2-University): 1

Student ID: SV01
Full Name: Nguyen Van A
Address: Ha Noi
Total Credits: 100
GPA: 5.0

Graduation Exam Score: -1.0

Invalid Graduation Exam Score

Student1
Type(1-College, 2-University): 1

Student ID: SV01
Full Name: Nguyen Van A
Address: Ha Noi
Total Credits: 100
GPA: 5.0

Graduation Exam Score: 6.0

Eligible students: 0

Eligible University students: 0

Eligible College students: 0

Not found the best University Student
```

---

## Test Case 3: Boundary Value Conditions (Exact Passing Thresholds)

### Description
Tests exact threshold values for eligibility:
- College: Credits = 120, GPA = 5.0, Exam Score = 5.0 (Should pass)
- University: Credits = 170, GPA = 5.0, Thesis Score = 5.0 (Should pass)

### Interactive Console Session

```text
Enter number of students: 2

Student1
Type(1-College, 2-University): 1

Student ID: SV_EDGE1
Full Name: College Edge
Address: Ha Noi
Total Credits: 120
GPA: 5.0

Graduation Exam Score: 5.0

Student2
Type(1-College, 2-University): 2

Student ID: SV_EDGE2
Full Name: University Edge
Address: HCM
Total Credits: 170
GPA: 5.0

Thesis Title: AI Project
Thesis Score: 5.0

Eligible students: 2

Eligible University students: 1

Eligible College students: 1

Student ID: SV_EDGE2
Full Name: University Edge
Address: HCM
Total Credits: 170
GPA: 5.0
Thesis Title: AI Project
Thesis Score: 5.0
```

---

## Test Case 4: Invalid Data Format Exception (Parsing Error)

### Description
Tests entering non-numeric characters when a number is expected (`Integer.parseInt`), demonstrating runtime exception throwing.

### Interactive Console Session

```text
Enter number of students: abc
Exception in thread "main" java.lang.NumberFormatException: For input string: "abc"
	at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
	at java.base/java.lang.Integer.parseInt(Integer.java:668)
	at java.base/java.lang.Integer.parseInt(Integer.java:776)
	at Main.main(Main.java:82)
```