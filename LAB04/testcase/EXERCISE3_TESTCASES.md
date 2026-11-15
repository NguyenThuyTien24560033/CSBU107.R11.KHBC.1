# Exercise 3: Test Cases (Input -> Output)

## Test Case 1: Standard Ideal Case (Happy path covering all 8 functions with suggested sample values: Standard 49,000 VND, Express 88,000 VND, Total 137,000 VND, static count = 2)

### Input
```text
1
2
1
ORD01
John Doe
10
2
2
ORD02
Jane Smith
10
2
2
3
ORD01
4
5
6
50000
7
8
```

### Output
```text
=== MENU ===
1. Add orders
2. Display all orders and shipping fees
3. Search by order ID
4. Count orders for each delivery type
5. Total shipping revenue
6. Print orders whose fee exceeds a threshold
7. Display the number of created Delivery objects
8. Exit
============
Your choice: 1

--- Add Orders ---
Enter number of orders (n > 0): 2

Order 1/2
Choose delivery type (1. StandardDelivery / 2. ExpressDelivery): 1
Order ID: ORD01
Customer Name: John Doe
Distance in km (> 0): 10
Parcel Weight in kg (> 0): 2

Order 2/2
Choose delivery type (1. StandardDelivery / 2. ExpressDelivery): 2
Order ID: ORD02
Customer Name: Jane Smith
Distance in km (> 0): 10
Parcel Weight in kg (> 0): 2
Added 2 order(s) successfully.

=== MENU ===
1. Add orders
2. Display all orders and shipping fees
3. Search by order ID
4. Count orders for each delivery type
5. Total shipping revenue
6. Print orders whose fee exceeds a threshold
7. Display the number of created Delivery objects
8. Exit
============
Your choice: 2

--- Display All Orders ---

Order 1
Type: StandardDelivery
Order ID: ORD01
Customer Name: John Doe
Distance: 10.0 km
Parcel Weight: 2.0 kg
Shipping Fee: 49,000 VND

Order 2
Type: ExpressDelivery
Order ID: ORD02
Customer Name: Jane Smith
Distance: 10.0 km
Parcel Weight: 2.0 kg
Shipping Fee: 88,000 VND

=== MENU ===
1. Add orders
2. Display all orders and shipping fees
3. Search by order ID
4. Count orders for each delivery type
5. Total shipping revenue
6. Print orders whose fee exceeds a threshold
7. Display the number of created Delivery objects
8. Exit
============
Your choice: 3

--- Search By Order ID ---
Enter order ID to search: ORD01

Type: StandardDelivery
Order ID: ORD01
Customer Name: John Doe
Distance: 10.0 km
Parcel Weight: 2.0 kg
Shipping Fee: 49,000 VND

=== MENU ===
1. Add orders
2. Display all orders and shipping fees
3. Search by order ID
4. Count orders for each delivery type
5. Total shipping revenue
6. Print orders whose fee exceeds a threshold
7. Display the number of created Delivery objects
8. Exit
============
Your choice: 4

--- Count Orders For Each Delivery Type ---
StandardDelivery: 1
ExpressDelivery: 1

=== MENU ===
1. Add orders
2. Display all orders and shipping fees
3. Search by order ID
4. Count orders for each delivery type
5. Total shipping revenue
6. Print orders whose fee exceeds a threshold
7. Display the number of created Delivery objects
8. Exit
============
Your choice: 5

--- Total Shipping Revenue ---
Total shipping revenue: 137,000 VND

=== MENU ===
1. Add orders
2. Display all orders and shipping fees
3. Search by order ID
4. Count orders for each delivery type
5. Total shipping revenue
6. Print orders whose fee exceeds a threshold
7. Display the number of created Delivery objects
8. Exit
============
Your choice: 6

--- Orders Exceeding A Fee Threshold ---
Enter threshold in VND (>= 0): 50000

Order 1
Type: ExpressDelivery
Order ID: ORD02
Customer Name: Jane Smith
Distance: 10.0 km
Parcel Weight: 2.0 kg
Shipping Fee: 88,000 VND

=== MENU ===
1. Add orders
2. Display all orders and shipping fees
3. Search by order ID
4. Count orders for each delivery type
5. Total shipping revenue
6. Print orders whose fee exceeds a threshold
7. Display the number of created Delivery objects
8. Exit
============
Your choice: 7

--- Created Delivery Objects ---
Number of successfully created Delivery objects: 2

=== MENU ===
1. Add orders
2. Display all orders and shipping fees
3. Search by order ID
4. Count orders for each delivery type
5. Total shipping revenue
6. Print orders whose fee exceeds a threshold
7. Display the number of created Delivery objects
8. Exit
============
Your choice: 8
Goodbye!
```

---

## Test Case 2: Boundary Value Testing (Minimal positive inputs: distance = 1 km, weight = 1 kg, threshold = 0 VND displaying all orders, case-insensitive search)

### Input
```text
1
2
1
MIN01
Alice
1
1
2
MIN02
Bob
1
1
2
3
min02
4
5
6
0
7
8
```

### Output
```text
=== MENU ===
1. Add orders
2. Display all orders and shipping fees
3. Search by order ID
4. Count orders for each delivery type
5. Total shipping revenue
6. Print orders whose fee exceeds a threshold
7. Display the number of created Delivery objects
8. Exit
============
Your choice: 1

--- Add Orders ---
Enter number of orders (n > 0): 2

Order 1/2
Choose delivery type (1. StandardDelivery / 2. ExpressDelivery): 1
Order ID: MIN01
Customer Name: Alice
Distance in km (> 0): 1
Parcel Weight in kg (> 0): 1

Order 2/2
Choose delivery type (1. StandardDelivery / 2. ExpressDelivery): 2
Order ID: MIN02
Customer Name: Bob
Distance in km (> 0): 1
Parcel Weight in kg (> 0): 1
Added 2 order(s) successfully.

=== MENU ===
1. Add orders
2. Display all orders and shipping fees
3. Search by order ID
4. Count orders for each delivery type
5. Total shipping revenue
6. Print orders whose fee exceeds a threshold
7. Display the number of created Delivery objects
8. Exit
============
Your choice: 2

--- Display All Orders ---

Order 1
Type: StandardDelivery
Order ID: MIN01
Customer Name: Alice
Distance: 1.0 km
Parcel Weight: 1.0 kg
Shipping Fee: 20,000 VND

Order 2
Type: ExpressDelivery
Order ID: MIN02
Customer Name: Bob
Distance: 1.0 km
Parcel Weight: 1.0 kg
Shipping Fee: 39,000 VND

=== MENU ===
1. Add orders
2. Display all orders and shipping fees
3. Search by order ID
4. Count orders for each delivery type
5. Total shipping revenue
6. Print orders whose fee exceeds a threshold
7. Display the number of created Delivery objects
8. Exit
============
Your choice: 3

--- Search By Order ID ---
Enter order ID to search: min02

Type: ExpressDelivery
Order ID: MIN02
Customer Name: Bob
Distance: 1.0 km
Parcel Weight: 1.0 kg
Shipping Fee: 39,000 VND

=== MENU ===
1. Add orders
2. Display all orders and shipping fees
3. Search by order ID
4. Count orders for each delivery type
5. Total shipping revenue
6. Print orders whose fee exceeds a threshold
7. Display the number of created Delivery objects
8. Exit
============
Your choice: 4

--- Count Orders For Each Delivery Type ---
StandardDelivery: 1
ExpressDelivery: 1

=== MENU ===
1. Add orders
2. Display all orders and shipping fees
3. Search by order ID
4. Count orders for each delivery type
5. Total shipping revenue
6. Print orders whose fee exceeds a threshold
7. Display the number of created Delivery objects
8. Exit
============
Your choice: 5

--- Total Shipping Revenue ---
Total shipping revenue: 59,000 VND

=== MENU ===
1. Add orders
2. Display all orders and shipping fees
3. Search by order ID
4. Count orders for each delivery type
5. Total shipping revenue
6. Print orders whose fee exceeds a threshold
7. Display the number of created Delivery objects
8. Exit
============
Your choice: 6

--- Orders Exceeding A Fee Threshold ---
Enter threshold in VND (>= 0): 0

Order 1
Type: StandardDelivery
Order ID: MIN01
Customer Name: Alice
Distance: 1.0 km
Parcel Weight: 1.0 kg
Shipping Fee: 20,000 VND

Order 2
Type: ExpressDelivery
Order ID: MIN02
Customer Name: Bob
Distance: 1.0 km
Parcel Weight: 1.0 kg
Shipping Fee: 39,000 VND

=== MENU ===
1. Add orders
2. Display all orders and shipping fees
3. Search by order ID
4. Count orders for each delivery type
5. Total shipping revenue
6. Print orders whose fee exceeds a threshold
7. Display the number of created Delivery objects
8. Exit
============
Your choice: 7

--- Created Delivery Objects ---
Number of successfully created Delivery objects: 2

=== MENU ===
1. Add orders
2. Display all orders and shipping fees
3. Search by order ID
4. Count orders for each delivery type
5. Total shipping revenue
6. Print orders whose fee exceeds a threshold
7. Display the number of created Delivery objects
8. Exit
============
Your choice: 8
Goodbye!
```

---

## Test Case 3: Numerical Field Violations (Invalid menu 9, n <= 0, invalid delivery type 3, distance <= 0, weight <= 0, threshold < 0, search order not found, threshold with no matches)

### Input
```text
9
1
0
-2
2
3
1
ORD10
Charlie
-5
0
5
-2
0
3
2
ORD20
Diana
0
8
0
4
2
3
UNKNOWN_ID
4
5
6
-1000
100000
7
8
```

### Output
```text
=== MENU ===
1. Add orders
2. Display all orders and shipping fees
3. Search by order ID
4. Count orders for each delivery type
5. Total shipping revenue
6. Print orders whose fee exceeds a threshold
7. Display the number of created Delivery objects
8. Exit
============
Your choice: 9
Invalid choice.

=== MENU ===
1. Add orders
2. Display all orders and shipping fees
3. Search by order ID
4. Count orders for each delivery type
5. Total shipping revenue
6. Print orders whose fee exceeds a threshold
7. Display the number of created Delivery objects
8. Exit
============
Your choice: 1

--- Add Orders ---
Enter number of orders (n > 0): 0
Invalid number of orders (n > 0). Enter again: -2
Invalid number of orders (n > 0). Enter again: 2

Order 1/2
Choose delivery type (1. StandardDelivery / 2. ExpressDelivery): 3
Invalid delivery type. Enter again (1 or 2): 1
Order ID: ORD10
Customer Name: Charlie
Distance in km (> 0): -5
Invalid distance (> 0). Enter again: 0
Invalid distance (> 0). Enter again: 5
Parcel Weight in kg (> 0): -2
Invalid parcel weight (> 0). Enter again: 0
Invalid parcel weight (> 0). Enter again: 3

Order 2/2
Choose delivery type (1. StandardDelivery / 2. ExpressDelivery): 2
Order ID: ORD20
Customer Name: Diana
Distance in km (> 0): 0
Invalid distance (> 0). Enter again: 8
Parcel Weight in kg (> 0): 0
Invalid parcel weight (> 0). Enter again: 4
Added 2 order(s) successfully.

=== MENU ===
1. Add orders
2. Display all orders and shipping fees
3. Search by order ID
4. Count orders for each delivery type
5. Total shipping revenue
6. Print orders whose fee exceeds a threshold
7. Display the number of created Delivery objects
8. Exit
============
Your choice: 2

--- Display All Orders ---

Order 1
Type: StandardDelivery
Order ID: ORD10
Customer Name: Charlie
Distance: 5.0 km
Parcel Weight: 3.0 kg
Shipping Fee: 36,000 VND

Order 2
Type: ExpressDelivery
Order ID: ORD20
Customer Name: Diana
Distance: 8.0 km
Parcel Weight: 4.0 kg
Shipping Fee: 86,000 VND

=== MENU ===
1. Add orders
2. Display all orders and shipping fees
3. Search by order ID
4. Count orders for each delivery type
5. Total shipping revenue
6. Print orders whose fee exceeds a threshold
7. Display the number of created Delivery objects
8. Exit
============
Your choice: 3

--- Search By Order ID ---
Enter order ID to search: UNKNOWN_ID
The order does not exist.

=== MENU ===
1. Add orders
2. Display all orders and shipping fees
3. Search by order ID
4. Count orders for each delivery type
5. Total shipping revenue
6. Print orders whose fee exceeds a threshold
7. Display the number of created Delivery objects
8. Exit
============
Your choice: 4

--- Count Orders For Each Delivery Type ---
StandardDelivery: 1
ExpressDelivery: 1

=== MENU ===
1. Add orders
2. Display all orders and shipping fees
3. Search by order ID
4. Count orders for each delivery type
5. Total shipping revenue
6. Print orders whose fee exceeds a threshold
7. Display the number of created Delivery objects
8. Exit
============
Your choice: 5

--- Total Shipping Revenue ---
Total shipping revenue: 122,000 VND

=== MENU ===
1. Add orders
2. Display all orders and shipping fees
3. Search by order ID
4. Count orders for each delivery type
5. Total shipping revenue
6. Print orders whose fee exceeds a threshold
7. Display the number of created Delivery objects
8. Exit
============
Your choice: 6

--- Orders Exceeding A Fee Threshold ---
Enter threshold in VND (>= 0): -1000
Invalid threshold (>= 0). Enter again: 100000
No order has a fee exceeding 100,000 VND.

=== MENU ===
1. Add orders
2. Display all orders and shipping fees
3. Search by order ID
4. Count orders for each delivery type
5. Total shipping revenue
6. Print orders whose fee exceeds a threshold
7. Display the number of created Delivery objects
8. Exit
============
Your choice: 7

--- Created Delivery Objects ---
Number of successfully created Delivery objects: 2

=== MENU ===
1. Add orders
2. Display all orders and shipping fees
3. Search by order ID
4. Count orders for each delivery type
5. Total shipping revenue
6. Print orders whose fee exceeds a threshold
7. Display the number of created Delivery objects
8. Exit
============
Your choice: 8
Goodbye!
```

---

## Test Case 4: String Violations & Duplicate ID Constraints (Empty Order ID/Customer Name rejection, case-insensitive duplicate Order ID rejection, filtering by threshold 60,000 VND)

### Input
```text
1
2
1

DEL01

Edward
15
5
2
del01
DEL02
Fiona
20
10
2
3
del02
4
5
6
60000
7
8
```

### Output
```text
=== MENU ===
1. Add orders
2. Display all orders and shipping fees
3. Search by order ID
4. Count orders for each delivery type
5. Total shipping revenue
6. Print orders whose fee exceeds a threshold
7. Display the number of created Delivery objects
8. Exit
============
Your choice: 1

--- Add Orders ---
Enter number of orders (n > 0): 2

Order 1/2
Choose delivery type (1. StandardDelivery / 2. ExpressDelivery): 1
Order ID: 
Order ID must not be empty. Enter again: DEL01
Customer Name: 
Customer name must not be empty. Enter again: Edward
Distance in km (> 0): 15
Parcel Weight in kg (> 0): 5

Order 2/2
Choose delivery type (1. StandardDelivery / 2. ExpressDelivery): 2
Order ID: del01
Duplicate order ID. Enter again: DEL02
Customer Name: Fiona
Distance in km (> 0): 20
Parcel Weight in kg (> 0): 10
Added 2 order(s) successfully.

=== MENU ===
1. Add orders
2. Display all orders and shipping fees
3. Search by order ID
4. Count orders for each delivery type
5. Total shipping revenue
6. Print orders whose fee exceeds a threshold
7. Display the number of created Delivery objects
8. Exit
============
Your choice: 2

--- Display All Orders ---

Order 1
Type: StandardDelivery
Order ID: DEL01
Customer Name: Edward
Distance: 15.0 km
Parcel Weight: 5.0 kg
Shipping Fee: 70,000 VND

Order 2
Type: ExpressDelivery
Order ID: DEL02
Customer Name: Fiona
Distance: 20 km
Parcel Weight: 10 kg
Shipping Fee: 170,000 VND

=== MENU ===
1. Add orders
2. Display all orders and shipping fees
3. Search by order ID
4. Count orders for each delivery type
5. Total shipping revenue
6. Print orders whose fee exceeds a threshold
7. Display the number of created Delivery objects
8. Exit
============
Your choice: 3

--- Search By Order ID ---
Enter order ID to search: del02

Type: ExpressDelivery
Order ID: DEL02
Customer Name: Fiona
Distance: 20.0 km
Parcel Weight: 10.0 kg
Shipping Fee: 170,000 VND

=== MENU ===
1. Add orders
2. Display all orders and shipping fees
3. Search by order ID
4. Count orders for each delivery type
5. Total shipping revenue
6. Print orders whose fee exceeds a threshold
7. Display the number of created Delivery objects
8. Exit
============
Your choice: 4

--- Count Orders For Each Delivery Type ---
StandardDelivery: 1
ExpressDelivery: 1

=== MENU ===
1. Add orders
2. Display all orders and shipping fees
3. Search by order ID
4. Count orders for each delivery type
5. Total shipping revenue
6. Print orders whose fee exceeds a threshold
7. Display the number of created Delivery objects
8. Exit
============
Your choice: 5

--- Total Shipping Revenue ---
Total shipping revenue: 240,000 VND

=== MENU ===
1. Add orders
2. Display all orders and shipping fees
3. Search by order ID
4. Count orders for each delivery type
5. Total shipping revenue
6. Print orders whose fee exceeds a threshold
7. Display the number of created Delivery objects
8. Exit
============
Your choice: 6

--- Orders Exceeding A Fee Threshold ---
Enter threshold in VND (>= 0): 60000

Order 1
Type: StandardDelivery
Order ID: DEL01
Customer Name: Edward
Distance: 15.0 km
Parcel Weight: 5.0 kg
Shipping Fee: 70,000 VND

Order 2
Type: ExpressDelivery
Order ID: DEL02
Customer Name: Fiona
Distance: 20 km
Parcel Weight: 10 kg
Shipping Fee: 170,000 VND

=== MENU ===
1. Add orders
2. Display all orders and shipping fees
3. Search by order ID
4. Count orders for each delivery type
5. Total shipping revenue
6. Print orders whose fee exceeds a threshold
7. Display the number of created Delivery objects
8. Exit
============
Your choice: 7

--- Created Delivery Objects ---
Number of successfully created Delivery objects: 2

=== MENU ===
1. Add orders
2. Display all orders and shipping fees
3. Search by order ID
4. Count orders for each delivery type
5. Total shipping revenue
6. Print orders whose fee exceeds a threshold
7. Display the number of created Delivery objects
8. Exit
============
Your choice: 8
Goodbye!
```

---

## Test Case 5: Empty Collection & Single-Type Addition (All operations on empty list first, then single-type Express addition, verifying count = 1 and threshold matching)

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
EXP99
Grace
5
2
2
3
EXP99
4
5
6
50000
7
8
```

### Output
```text
=== MENU ===
1. Add orders
2. Display all orders and shipping fees
3. Search by order ID
4. Count orders for each delivery type
5. Total shipping revenue
6. Print orders whose fee exceeds a threshold
7. Display the number of created Delivery objects
8. Exit
============
Your choice: 2

--- Display All Orders ---
The order list is empty.

=== MENU ===
1. Add orders
2. Display all orders and shipping fees
3. Search by order ID
4. Count orders for each delivery type
5. Total shipping revenue
6. Print orders whose fee exceeds a threshold
7. Display the number of created Delivery objects
8. Exit
============
Your choice: 3

--- Search By Order ID ---
The order list is empty.

=== MENU ===
1. Add orders
2. Display all orders and shipping fees
3. Search by order ID
4. Count orders for each delivery type
5. Total shipping revenue
6. Print orders whose fee exceeds a threshold
7. Display the number of created Delivery objects
8. Exit
============
Your choice: 4

--- Count Orders For Each Delivery Type ---
StandardDelivery: 0
ExpressDelivery: 0

=== MENU ===
1. Add orders
2. Display all orders and shipping fees
3. Search by order ID
4. Count orders for each delivery type
5. Total shipping revenue
6. Print orders whose fee exceeds a threshold
7. Display the number of created Delivery objects
8. Exit
============
Your choice: 5

--- Total Shipping Revenue ---
Total shipping revenue: 0 VND

=== MENU ===
1. Add orders
2. Display all orders and shipping fees
3. Search by order ID
4. Count orders for each delivery type
5. Total shipping revenue
6. Print orders whose fee exceeds a threshold
7. Display the number of created Delivery objects
8. Exit
============
Your choice: 6

--- Orders Exceeding A Fee Threshold ---
The order list is empty.

=== MENU ===
1. Add orders
2. Display all orders and shipping fees
3. Search by order ID
4. Count orders for each delivery type
5. Total shipping revenue
6. Print orders whose fee exceeds a threshold
7. Display the number of created Delivery objects
8. Exit
============
Your choice: 7

--- Created Delivery Objects ---
Number of successfully created Delivery objects: 0

=== MENU ===
1. Add orders
2. Display all orders and shipping fees
3. Search by order ID
4. Count orders for each delivery type
5. Total shipping revenue
6. Print orders whose fee exceeds a threshold
7. Display the number of created Delivery objects
8. Exit
============
Your choice: 1

--- Add Orders ---
Enter number of orders (n > 0): 1

Order 1/1
Choose delivery type (1. StandardDelivery / 2. ExpressDelivery): 2
Order ID: EXP99
Customer Name: Grace
Distance in km (> 0): 5
Parcel Weight in kg (> 0): 2
Added 1 order(s) successfully.

=== MENU ===
1. Add orders
2. Display all orders and shipping fees
3. Search by order ID
4. Count orders for each delivery type
5. Total shipping revenue
6. Print orders whose fee exceeds a threshold
7. Display the number of created Delivery objects
8. Exit
============
Your choice: 2

--- Display All Orders ---

Order 1
Type: ExpressDelivery
Order ID: EXP99
Customer Name: Grace
Distance: 5.0 km
Parcel Weight: 2.0 kg
Shipping Fee: 63,000 VND

=== MENU ===
1. Add orders
2. Display all orders and shipping fees
3. Search by order ID
4. Count orders for each delivery type
5. Total shipping revenue
6. Print orders whose fee exceeds a threshold
7. Display the number of created Delivery objects
8. Exit
============
Your choice: 3

--- Search By Order ID ---
Enter order ID to search: EXP99

Type: ExpressDelivery
Order ID: EXP99
Customer Name: Grace
Distance: 5.0 km
Parcel Weight: 2.0 kg
Shipping Fee: 63,000 VND

=== MENU ===
1. Add orders
2. Display all orders and shipping fees
3. Search by order ID
4. Count orders for each delivery type
5. Total shipping revenue
6. Print orders whose fee exceeds a threshold
7. Display the number of created Delivery objects
8. Exit
============
Your choice: 4

--- Count Orders For Each Delivery Type ---
StandardDelivery: 0
ExpressDelivery: 1

=== MENU ===
1. Add orders
2. Display all orders and shipping fees
3. Search by order ID
4. Count orders for each delivery type
5. Total shipping revenue
6. Print orders whose fee exceeds a threshold
7. Display the number of created Delivery objects
8. Exit
============
Your choice: 5

--- Total Shipping Revenue ---
Total shipping revenue: 63,000 VND

=== MENU ===
1. Add orders
2. Display all orders and shipping fees
3. Search by order ID
4. Count orders for each delivery type
5. Total shipping revenue
6. Print orders whose fee exceeds a threshold
7. Display the number of created Delivery objects
8. Exit
============
Your choice: 6

--- Orders Exceeding A Fee Threshold ---
Enter threshold in VND (>= 0): 50000

Order 1
Type: ExpressDelivery
Order ID: EXP99
Customer Name: Grace
Distance: 5.0 km
Parcel Weight: 2.0 kg
Shipping Fee: 63,000 VND

=== MENU ===
1. Add orders
2. Display all orders and shipping fees
3. Search by order ID
4. Count orders for each delivery type
5. Total shipping revenue
6. Print orders whose fee exceeds a threshold
7. Display the number of created Delivery objects
8. Exit
============
Your choice: 7

--- Created Delivery Objects ---
Number of successfully created Delivery objects: 1

=== MENU ===
1. Add orders
2. Display all orders and shipping fees
3. Search by order ID
4. Count orders for each delivery type
5. Total shipping revenue
6. Print orders whose fee exceeds a threshold
7. Display the number of created Delivery objects
8. Exit
============
Your choice: 8
Goodbye!
```
