# Test Cases: Cosmetic Store Order Management (Interactive Terminal View)

This document presents test cases for Exercise 5 as realistic interactive console sessions based on your Java implementation. Inputs entered by the user appear directly after each prompt.

## Test Case 1: Standard Flow - Romantic Package (Problem Example)

### Description

Tests ordering a **Romantic Package** with 50 ml of Rose Perfume and 100 ml of Dry Skin Shower Gel (matching the example from the problem statement).

* Rose Perfume: $50\text{ ml} \times 20,000\text{ VND/ml} = 1,000,000\text{ VND}$
* Dry Skin Shower Gel: $100\text{ ml} \times 20,000\text{ VND/ml} = 2,000,000\text{ VND}$
* Expected Order Price: **3,000,000.0 VND**

### Interactive Console Session

```
Enter the number of orders: 1

Order 1
Customer ID: CUST01
Full name: Alice Smith
Address: 123 Flower St
Phone number: 0901234567
1. Romantic Package
2. Fresh-Air Package
Choose package: 1
Enter Rose Perfume ID: P01
Enter Rose Perfume volume (ml): 50
Do you want to add Shampoo? (y/n): n
Do you want to add Shower Gel? (y/n): y
1. Dry Skin Shower Gel
2. Oily Skin Shower Gel
Choose Shower Gel: 1
Enter Shower Gel ID: G01
Enter Shower Gel volume (ml): 100

The order ID: ORD001
The invoice date: 2026-11-03

  ALL ORDERS  

Order ID: ORD001
Invoice Date: 2026-11-03
Customer ID: CUST01
Full name: Alice Smith
Address: 123 Flower St
Phone number: 0901234567
Package: romanticPackage

Products in package:
Product ID: P01
Product type: Rose Perfume
Volume: 50.0 ml
Unit price: 20000.0 VND/ml
Product price: 1000000.0 VND
--------------------
Product ID: G01
Product type: Dry Skin Shower Gel
Volume: 100.0 ml
Unit price: 20000.0 VND/ml
Product price: 2000000.0 VND
--------------------
Order Price: 3000000.0 VND

Orders saved to order_list.txt
```

---

## Test Case 2: Standard Flow - Fresh-Air Package with Optional Products

### Description

Tests ordering a **Fresh-Air Package** including required Oily Hair Shampoo - Standard 1, optional Chamomile Perfume, and optional Oily Skin Shower Gel.

* Oily Hair Shampoo - Standard 1: $200\text{ ml} \times 30,000 = 6,000,000\text{ VND}$
* Chamomile Perfume: $30\text{ ml} \times 15,000 = 450,000\text{ VND}$
* Oily Skin Shower Gel: $150\text{ ml} \times 40,000 = 6,000,000\text{ VND}$
* Expected Total: **12,450,000.0 VND**

### Interactive Console Session

```
Enter the number of orders: 1

Order 1
Customer ID: CUST02
Full name: Bob Jones
Address: 456 Ocean Rd
Phone number: 0912345678
1. Romantic Package
2. Fresh-Air Package
Choose package: 2
Choose Oily Hair Shampoo:
1. Oily Hair Shampoo - Standard 1
2. Oily Hair Shampoo - Standard 2
Choose Shampoo: 1
Enter Shampoo ID: S01
Enter Shampoo volume (ml): 200
Do you want to add Perfume? (y/n): y
1. Rose Perfume
2. Chamomile Perfume
Choose Perfume: 2
Enter Perfume ID: P02
Enter Perfume volume (ml): 30
Do you want to add Shower Gel? (y/n): y
1. Dry Skin Shower Gel
2. Oily Skin Shower Gel
Choose Shower Gel: 2
Enter Shower Gel ID: G02
Enter Shower Gel volume (ml): 150

The order ID: ORD002
The invoice date: 2026-11-03

  ALL ORDERS  

Order ID: ORD002
Invoice Date: 2026-11-03
Customer ID: CUST02
Full name: Bob Jones
Address: 456 Ocean Rd
Phone number: 0912345678
Package: freshAirPackage

Products in package:
Product ID: S01
Product type: Oily Hair Shampoo - Standard 1
Volume: 200.0 ml
Unit price: 30000.0 VND/ml
Product price: 6000000.0 VND
--------------------
Product ID: P02
Product type: Chamomile Perfume
Volume: 30.0 ml
Unit price: 15000.0 VND/ml
Product price: 450000.0 VND
--------------------
Product ID: G02
Product type: Oily Skin Shower Gel
Volume: 150.0 ml
Unit price: 40000.0 VND/ml
Product price: 6000000.0 VND
--------------------
Order Price: 12450000.0 VND

Orders saved to order_list.txt
```

---

## Test Case 3: Validation Retry Loops (Package Choice & Volume Validation)

### Description

Tests input validation and error recovery:
1. Entering invalid package choice (`3`) decrements loop counter `i` and prompts again.
2. Entering negative volume (`-50` and `0`) triggers the `do-while` validation loop in `romanticPackage`.

### Interactive Console Session

```
Enter the number of orders: 1

Order 1
Customer ID: CUST03
Full name: Charlie Brown
Address: 789 Pine St
Phone number: 0987654321
1. Romantic Package
2. Fresh-Air Package
Choose package: 3
Invalid choice!

Order 1
Customer ID: CUST03
Full name: Charlie Brown
Address: 789 Pine St
Phone number: 0987654321
1. Romantic Package
2. Fresh-Air Package
Choose package: 1
Enter Rose Perfume ID: P03
Enter Rose Perfume volume (ml): -50
Volume must be greater than 0. Please enter again.
Enter Rose Perfume volume (ml): 0
Volume must be greater than 0. Please enter again.
Enter Rose Perfume volume (ml): 30
Do you want to add Shampoo? (y/n): n
Do you want to add Shower Gel? (y/n): n

The order ID: ORD003
The invoice date: 2026-11-03

  ALL ORDERS  

Order ID: ORD003
Invoice Date: 2026-11-03
Customer ID: CUST03
Full name: Charlie Brown
Address: 789 Pine St
Phone number: 0987654321
Package: romanticPackage

Products in package:
Product ID: P03
Product type: Rose Perfume
Volume: 30.0 ml
Unit price: 20000.0 VND/ml
Product price: 600000.0 VND
--------------------
Order Price: 600000.0 VND

Orders saved to order_list.txt
```

---

## Test Case 4: File Output Verification (`order_list.txt`)

### Description

Verifies the content written to `order_list.txt` when processing an order.

### File Content (`order_list.txt`)

```text

Order ID: ORD001
Invoice Date: 2026-11-03
Customer ID: CUST01
Full name: Alice Smith
Address: 123 Flower St
Phone number: 0901234567
Package: romanticPackage
Products in package:
Product ID: P01
Product type: Rose Perfume
Volume: 50.0 ml
Unit price: 20000.0 VND/ml
Product price: 1000000.0 VND
--------------------
Product ID: G01
Product type: Dry Skin Shower Gel
Volume: 100.0 ml
Unit price: 20000.0 VND/ml
Product price: 2000000.0 VND
--------------------
Order Price: 3000000.0 VND
-----------------------------------
```

---

## Test Case 5: Runtime Exception (NumberFormatException)

### Description

Tests entering non-numeric string input (`"abc"`) when a number is expected during volume or menu choice parsing (`Integer.parseInt` or `Double.parseDouble`).

### Interactive Console Session

```
Enter the number of orders: 1

Order 1
Customer ID: CUST04
Full name: David Miller
Address: 101 Oak St
Phone number: 0933333333
1. Romantic Package
2. Fresh-Air Package
Choose package: 1
Enter Rose Perfume ID: P04
Enter Rose Perfume volume (ml): abc
Exception in thread "main" java.lang.NumberFormatException: For input string: "abc"
	at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
	at java.base/java.lang.Double.parseDouble(Double.java:758)
	at romanticPackage.<init>(Main.java:136)
	at Main.main(Main.java:311)
```