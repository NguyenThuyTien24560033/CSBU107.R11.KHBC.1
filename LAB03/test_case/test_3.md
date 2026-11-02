# Test Cases: Hotel Room Rental Management (Interactive Terminal View)

This document presents test cases for Exercise 3 as realistic interactive console sessions based on your Java implementation. Inputs entered by the user appear directly after each prompt.

## Test Case 1: Standard Flow (Add, Remove, and Room Rental Calculation)

### Description

Tests the standard flow including entering 1 Staff and 1 Guest, adding an extra Guest, removing a Guest by Citizen ID (CCCD), and selecting a VIP2 room for 3 days (matching the example calculation: 700,000 * 3 = 2,100,000 VND).

* Room Type: VIP2 (700,000 VND/day)
* Days: 3
* Expected Calculation: 2100000.0 VND

### Interactive Console Session

```
Enter the number of people: 2

The type person(1-Guest, 2-Staff): 2

The full name: Alice Smith

The age: 30
The License ID: L12345
The Employee ID: EMP001

The type person(1-Guest, 2-Staff): 1

The full name: Bob Johnson

The age: 40

The Citizen ID: 012345678901

The full name: Bob Johnson
The age: 40
The Citizen ID: 012345678901
Do you want to add a guest? (1-Yes, 2-No): 1

The full name: Charlie Brown

The age: 25

The Citizen ID: 098765432109
Guest added successfully!

Do you want to remove a guest? (1-Yes, 2-No): 1
Enter Citizen ID to remove: 012345678901
Guest removed successfully!
The list of guests: 

The full name: Charlie Brown
The age: 25
The Citizen ID: 098765432109

ROOM

Room type:
VIP1 (900000 VND/day)
VIP2 (700000 VND/day)
VIP3 (500000 VND/day)

Choose the type of room(1-VIP1, 2-VIP2, 3-VIP3): 2

The rental day: 3

Guest name: Charlie Brown
The rental cost is 2100000.0VND
```

## Test Case 2: Guest Not Found on Removal & Validation Retry Loops

### Description

Tests edge cases and validation handling:
1. Attempting to remove a Citizen ID that does not exist ("Guest not found!").
2. Invalid person type (`3`) triggers prompt retry.
3. Invalid rental days (`0` and `-2`) triggers the `do-while` retry loop until a positive value (`2`) is given.

### Interactive Console Session

```
Enter the number of people: 1

The type person(1-Guest, 2-Staff): 3
Invalid type person
The type person(1-Guest, 2-Staff): 1

The full name: David Miller

The age: 35

The Citizen ID: 111222333444

The full name: David Miller
The age: 35
The Citizen ID: 111222333444
Do you want to add a guest? (1-Yes, 2-No): 2

Do you want to remove a guest? (1-Yes, 2-No): 1
Enter Citizen ID to remove: 999999999999
Guest not found!
The list of guests: 

The full name: David Miller
The age: 35
The Citizen ID: 111222333444

ROOM

Room type:
VIP1 (900000 VND/day)
VIP2 (700000 VND/day)
VIP3 (500000 VND/day)

Choose the type of room(1-VIP1, 2-VIP2, 3-VIP3): 1

The rental day: 0
Invalid rental day!

The rental day: -2
Invalid rental day!

The rental day: 2

Guest name: David Miller
The rental cost is 1800000.0VND
```

## Test Case 3: Multiple Guests Room Calculations (VIP1, VIP2, VIP3)

### Description

Tests multiple guests booking different room types:
* Guest 1: VIP1 (900,000 VND/day) for 1 day = 900,000 VND
* Guest 2: VIP3 (500,000 VND/day) for 5 days = 2,500,000 VND

### Interactive Console Session

```
Enter the number of people: 2

The type person(1-Guest, 2-Staff): 1

The full name: Eva Green

The age: 28

The Citizen ID: CCCD001

The type person(1-Guest, 2-Staff): 1

The full name: Frank Wright

The age: 50

The Citizen ID: CCCD002

The full name: Eva Green
The age: 28
The Citizen ID: CCCD001
The full name: Frank Wright
The age: 50
The Citizen ID: CCCD002
Do you want to add a guest? (1-Yes, 2-No): 2

Do you want to remove a guest? (1-Yes, 2-No): 2

ROOM

Room type:
VIP1 (900000 VND/day)
VIP2 (700000 VND/day)
VIP3 (500000 VND/day)

Choose the type of room(1-VIP1, 2-VIP2, 3-VIP3): 1

The rental day: 1

Guest name: Eva Green
The rental cost is 900000.0VND

ROOM

Room type:
VIP1 (900000 VND/day)
VIP2 (700000 VND/day)
VIP3 (500000 VND/day)

Choose the type of room(1-VIP1, 2-VIP2, 3-VIP3): 3

The rental day: 5

Guest name: Frank Wright
The rental cost is 2500000.0VND
```

## Test Case 4: Invalid Room Type Selection

### Description

Tests choosing an invalid room type (e.g., option `4`), verifying that the program prints `"Invalid room type"` and skips room processing for that guest.

### Interactive Console Session

```
Enter the number of people: 1

The type person(1-Guest, 2-Staff): 1

The full name: Grace Hopper

The age: 60

The Citizen ID: CCCD999

The full name: Grace Hopper
The age: 60
The Citizen ID: CCCD999
Do you want to add a guest? (1-Yes, 2-No): 2

Do you want to remove a guest? (1-Yes, 2-No): 2

ROOM

Room type:
VIP1 (900000 VND/day)
VIP2 (700000 VND/day)
VIP3 (500000 VND/day)

Choose the type of room(1-VIP1, 2-VIP2, 3-VIP3): 4
Invalid room type
```

## Test Case 5: Runtime Exception (Invalid Number Format)

### Description

Tests entering non-numeric input (e.g., `"xyz"`) when an integer is expected (`Integer.parseInt`).

### Interactive Console Session

```
Enter the number of people: xyz
Exception in thread "main" java.lang.NumberFormatException: For input string: "xyz"
	at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
	at java.base/java.lang.Integer.parseInt(Integer.java:668)
	at java.base/java.lang.Integer.parseInt(Integer.java:776)
	at Main.main(Main.java:101)
```