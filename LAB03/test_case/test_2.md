# Test Cases: Dam Sen Park Ticket Management (Interactive Terminal View)

This document presents test cases for Exercise 2 as realistic interactive console sessions based on your Java implementation. Inputs entered by the user appear directly after each prompt.

---

## Test Case 1: Standard Multi-Ticket Flow (Example Scenario)

### Description
Tests entering 1 Full Package Ticket and 1 Partial Ticket with 4 games played (matching the example from the problem statement).
* Full Package Price: 200,000 VND
* Partial Ticket Price: 70,000 + 20,000 * 4 = 150,000 VND
* Total Expected Revenue: 350,000.0 VND
* Partial Tickets Count: 1

### Interactive Console Session

```
Enter the number of ticket: 2

Ticket 1
Type(1-Full Package, 2-Partial)
1

The ticket ID: T01

The holder name: Nguyen Van A

The year of birth: 2000

Ticket 2
Type(1-Full Package, 2-Partial)
2

The ticket ID: T02

The holder name: Tran Thi B

The year of birth: 2005

The game played: 4

Total Revenue: 350000.0VND

The number of partial ticket: 1 tickets
```

---

## Test Case 2: Validation Loops (Invalid Inputs & Retries)

### Description
Tests input validation handling:
1. Entering an invalid ticket type (e.g., `3`) triggers standard type check and retries ticket prompt.
2. Entering an invalid year of birth (`1899`) triggers the `do-while` loop until a valid year is given (`2002`).
3. Entering an invalid game count (`35` and `0`) triggers the `do-while` loop until a valid count is given (`5`).

### Interactive Console Session

```
Enter the number of ticket: 1

Ticket 1
Type(1-Full Package, 2-Partial)
3

Invalid ticket type
Ticket 1
Type(1-Full Package, 2-Partial)
2

The ticket ID: T03

The holder name: Le Van C

The year of birth: 1899
Invalid year of birth! Enter a year from 1900 to 2026.

The year of birth: 2002

The game played: 35
Invalid number of games! Enter a value from 1 to 30.

The game played: 0
Invalid number of games! Enter a value from 1 to 30.

The game played: 5

Total Revenue: 170000.0VND

The number of partial ticket: 1 tickets
```

---

## Test Case 3: All Full Package Tickets

### Description
Tests entering only Full Package Tickets to verify revenue calculation and check that partial ticket count correctly equals `0`.
* 2 Full Package Tickets = 2 * 200,000 = 400,000.0 VND.

### Interactive Console Session

```
Enter the number of ticket: 2

Ticket 1
Type(1-Full Package, 2-Partial)
1

The ticket ID: FP01

The holder name: Pham Van D

The year of birth: 1995

Ticket 2
Type(1-Full Package, 2-Partial)
1

The ticket ID: FP02

The holder name: Hoang Thi E

The year of birth: 1998

Total Revenue: 400000.0VND

The number of partial ticket: 0 tickets
```

---

## Test Case 4: Boundary Values for Partial Ticket Games (1 game & 30 games)

### Description
Tests lower boundary (1 game) and upper boundary (30 games) for Partial Tickets:
* Partial Ticket 1 (1 game): 70,000 + 20,000 * 1 = 90,000 VND
* Partial Ticket 2 (30 games): 70,000 + 20,000 * 30 = 670,000 VND
* Total Revenue: 760,000.0 VND

### Interactive Console Session

```
Enter the number of ticket: 2

Ticket 1
Type(1-Full Package, 2-Partial)
2

The ticket ID: PT01

The holder name: Dang Van F

The year of birth: 1990

The game played: 1

Ticket 2
Type(1-Full Package, 2-Partial)
2

The ticket ID: PT02

The holder name: Vu Thi G

The year of birth: 2001

The game played: 30

Total Revenue: 760000.0VND

The number of partial ticket: 2 tickets
```

---

## Test Case 5: Runtime Exception (Invalid Number Format)

### Description
Tests entering non-numeric characters (e.g., string `"abc"`) when an integer is expected (`Integer.parseInt`).

### Interactive Console Session

```
Enter the number of ticket: abc
Exception in thread "main" java.lang.NumberFormatException: For input string: "abc"
	at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
	at java.base/java.lang.Integer.parseInt(Integer.java:668)
	at java.base/java.lang.Integer.parseInt(Integer.java:776)
	at Main.main(Main.java:55)
```