# Test Cases: Singer Salary Management for XYZ Company (Interactive Terminal View)

This document presents test cases for Exercise 4 as realistic interactive console sessions based on your Java implementation. Inputs entered by the user appear directly after each prompt.

## Test Case 1: Standard Mixed Input (Regular & Famous Singer)

### Description

Tests entering 1 Regular Singer and 1 Famous Singer and verifies category total salaries and highest-paid singer calculation.

* **Regular Singer (John Doe):** 
  * Salary = 3,000,000 + (500,000 * 3) + (1,000 * 5,000) + (200,000 * 10) = 3,000,000 + 1,500,000 + 5,000,000 + 2,000,000 = **11,500,000 VND**
* **Famous Singer (Taylor Swift):** 
  * Salary = 5,000,000 + (500,000 * 10) + (1,200 * 50,000) + (500,000 * 20) + (500,000 * 4) = 5,000,000 + 5,000,000 + 60,000,000 + 10,000,000 + 2,000,000 = **82,000,000 VND**

### Interactive Console Session

```
Enter the number of singer: 
2

Singer Type(1-Regular Singer, 2-Famous Singer)
1

The full name: John Doe

The years of experience: 3

The number of albums sold: 5000

The number of performances: 10

Singer Type(1-Regular Singer, 2-Famous Singer)
2

The full name: Taylor Swift

The years of experience: 10

The number of albums sold: 50000

The number of performances: 20

The number of game shows attended: 4

The salary of famous singer category: 82,000,000 VND

The salary of regular singer category: 11,500,000 VND

Highest-paid singer:

The full name: Taylor Swift
The years of experience: 10
The number of albums sold: 50000
The number of performances: 20
The number of game shows attended: 4
Salary: 82,000,000 VND
```

---

## Test Case 2: Tie-Breaking for Highest-Paid Singer

### Description

Tests the condition where two singers have the exact same salary. In your code (`if(s.calculateSalary() >= max)`), when salaries tie, the latter singer replaces the previous one.

* **Singer 1 (Regular - Alice):** Salary = 3,000,000 + (500,000 * 2) + (1,000 * 1,000) + (200,000 * 5) = **6,000,000 VND**
* **Singer 2 (Regular - Bob):** Salary = 3,000,000 + (500,000 * 2) + (1,000 * 1,000) + (200,000 * 5) = **6,000,000 VND**
* **Expected Result:** Bob is displayed as highest-paid due to `>=` condition.

### Interactive Console Session

```
Enter the number of singer: 
2

Singer Type(1-Regular Singer, 2-Famous Singer)
1

The full name: Alice

The years of experience: 2

The number of albums sold: 1000

The number of performances: 5

Singer Type(1-Regular Singer, 2-Famous Singer)
1

The full name: Bob

The years of experience: 2

The number of albums sold: 1000

The number of performances: 5

The salary of famous singer category: 0 VND

The salary of regular singer category: 12,000,000 VND

Highest-paid singer:

The full name: Bob
The years of experience: 2
The number of albums sold: 1000
The number of performances: 5
Salary: 6,000,000 VND
```

---

## Test Case 3: Invalid Singer Type Validation Retry

### Description

Tests entering an invalid type option (e.g., `3`). Checks that the system prints `Invalid singer type` and decrements `i` to prompt for input again.

### Interactive Console Session

```
Enter the number of singer: 
1

Singer Type(1-Regular Singer, 2-Famous Singer)
3

Invalid singer type
Singer Type(1-Regular Singer, 2-Famous Singer)
1

The full name: Charlie

The years of experience: 1

The number of albums sold: 500

The number of performances: 2

The salary of famous singer category: 0 VND

The salary of regular singer category: 4,400,000 VND

Highest-paid singer:

The full name: Charlie
The years of experience: 1
The number of albums sold: 500
The number of performances: 2
Salary: 4,400,000 VND
```

---

## Test Case 4: Zero Values Input (Minimum Base Salaries)

### Description

Tests entering 0 for experience, albums, and performances to check minimum base salary calculation:
* Regular base salary: **3,000,000 VND**
* Famous base salary: **5,000,000 VND**

### Interactive Console Session

```
Enter the number of singer: 
2

Singer Type(1-Regular Singer, 2-Famous Singer)
1

The full name: Novice Regular

The years of experience: 0

The number of albums sold: 0

The number of performances: 0

Singer Type(1-Regular Singer, 2-Famous Singer)
2

The full name: Novice Famous

The years of experience: 0

The number of albums sold: 0

The number of performances: 0

The number of game shows attended: 0

The salary of famous singer category: 5,000,000 VND

The salary of regular singer category: 3,000,000 VND

Highest-paid singer:

The full name: Novice Famous
The years of experience: 0
The number of albums sold: 0
The number of performances: 0
The number of game shows attended: 0
Salary: 5,000,000 VND
```

---

## Test Case 5: Runtime Exception (NumberFormatException)

### Description

Tests entering non-numeric characters (e.g., string `"abc"`) when an integer is expected (`Integer.parseInt`).

### Interactive Console Session

```
Enter the number of singer: 
abc
Exception in thread "main" java.lang.NumberFormatException: For input string: "abc"
	at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
	at java.base/java.lang.Integer.parseInt(Integer.java:668)
	at java.base/java.lang.Integer.parseInt(Integer.java:776)
	at Main.main(Main.java:71)
```