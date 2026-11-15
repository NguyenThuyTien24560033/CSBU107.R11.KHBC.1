# Exercise 4: Test Cases (Input -> Output)

## Test Case 1: Standard Ideal Case (Happy path covering all 7 functions with suggested sample values: 5 Regular 360,000 VND, 3 VIP 382,500 VND, Total 742,500 VND, Highest movie Avatar)

### Input
```text
1
2
1
T01
Avatar
5
2
T02
Avatar
3
2
3
Avatar
4
5
6
7
```

### Output
```text
=== MENU ===
1. Add ticket purchases
2. Display all purchases
3. Search purchases by movie title
4. Total revenue
5. Movie title with the highest total revenue
6. Display purchases from highest to lowest final total
7. Exit
============
Your choice: 1

--- Add Ticket Purchases ---
Enter number of purchases (n > 0): 2

Purchase 1/2
Choose ticket type (1. RegularTicket / 2. VIPTicket): 1
Ticket ID: T01
Movie Title: Avatar
Quantity (>= 1): 5

Purchase 2/2
Choose ticket type (1. RegularTicket / 2. VIPTicket): 2
Ticket ID: T02
Movie Title: Avatar
Quantity (>= 1): 3
Added 2 purchase(s) successfully.

=== MENU ===
1. Add ticket purchases
2. Display all purchases
3. Search purchases by movie title
4. Total revenue
5. Movie title with the highest total revenue
6. Display purchases from highest to lowest final total
7. Exit
============
Your choice: 2

--- Display All Purchases ---

Ticket 1
Type: RegularTicket
Ticket ID: T01
Movie Title: Avatar
Quantity: 5
Unit Price: 80,000 VND
Discount Amount: 40,000 VND
Final Total: 360,000 VND

Ticket 2
Type: VIPTicket
Ticket ID: T02
Movie Title: Avatar
Quantity: 3
Unit Price: 150,000 VND
Discount Amount: 67,500 VND
Final Total: 382,500 VND

=== MENU ===
1. Add ticket purchases
2. Display all purchases
3. Search purchases by movie title
4. Total revenue
5. Movie title with the highest total revenue
6. Display purchases from highest to lowest final total
7. Exit
============
Your choice: 3

--- Search By Movie Title ---
Enter movie title to search: Avatar

Ticket 1
Type: RegularTicket
Ticket ID: T01
Movie Title: Avatar
Quantity: 5
Unit Price: 80,000 VND
Discount Amount: 40,000 VND
Final Total: 360,000 VND

Ticket 2
Type: VIPTicket
Ticket ID: T02
Movie Title: Avatar
Quantity: 3
Unit Price: 150,000 VND
Discount Amount: 67,500 VND
Final Total: 382,500 VND

=== MENU ===
1. Add ticket purchases
2. Display all purchases
3. Search purchases by movie title
4. Total revenue
5. Movie title with the highest total revenue
6. Display purchases from highest to lowest final total
7. Exit
============
Your choice: 4

--- Total Revenue ---
Total revenue: 742,500 VND

=== MENU ===
1. Add ticket purchases
2. Display all purchases
3. Search purchases by movie title
4. Total revenue
5. Movie title with the highest total revenue
6. Display purchases from highest to lowest final total
7. Exit
============
Your choice: 5

--- Movie With The Highest Total Revenue ---
Movie with the highest revenue: Avatar
Total revenue of this movie: 742,500 VND

=== MENU ===
1. Add ticket purchases
2. Display all purchases
3. Search purchases by movie title
4. Total revenue
5. Movie title with the highest total revenue
6. Display purchases from highest to lowest final total
7. Exit
============
Your choice: 6

--- Purchases From Highest To Lowest Final Total ---

Ticket 1
Type: VIPTicket
Ticket ID: T02
Movie Title: Avatar
Quantity: 3
Unit Price: 150,000 VND
Discount Amount: 67,500 VND
Final Total: 382,500 VND

Ticket 2
Type: RegularTicket
Ticket ID: T01
Movie Title: Avatar
Quantity: 5
Unit Price: 80,000 VND
Discount Amount: 40,000 VND
Final Total: 360,000 VND

=== MENU ===
1. Add ticket purchases
2. Display all purchases
3. Search purchases by movie title
4. Total revenue
5. Movie title with the highest total revenue
6. Display purchases from highest to lowest final total
7. Exit
============
Your choice: 7
Goodbye!
```

---

## Test Case 2: Boundary Value Testing (Quantities below discount thresholds: Regular 4 < 5 gives 0% discount, VIP 2 < 3 gives 0% discount, case-insensitive search)

### Input
```text
1
2
1
T-MIN1
Inception
4
2
T-MIN2
Interstellar
2
2
3
inception
4
5
6
7
```

### Output
```text
=== MENU ===
1. Add ticket purchases
2. Display all purchases
3. Search purchases by movie title
4. Total revenue
5. Movie title with the highest total revenue
6. Display purchases from highest to lowest final total
7. Exit
============
Your choice: 1

--- Add Ticket Purchases ---
Enter number of purchases (n > 0): 2

Purchase 1/2
Choose ticket type (1. RegularTicket / 2. VIPTicket): 1
Ticket ID: T-MIN1
Movie Title: Inception
Quantity (>= 1): 4

Purchase 2/2
Choose ticket type (1. RegularTicket / 2. VIPTicket): 2
Ticket ID: T-MIN2
Movie Title: Interstellar
Quantity (>= 1): 2
Added 2 purchase(s) successfully.

=== MENU ===
1. Add ticket purchases
2. Display all purchases
3. Search purchases by movie title
4. Total revenue
5. Movie title with the highest total revenue
6. Display purchases from highest to lowest final total
7. Exit
============
Your choice: 2

--- Display All Purchases ---

Ticket 1
Type: RegularTicket
Ticket ID: T-MIN1
Movie Title: Inception
Quantity: 4
Unit Price: 80,000 VND
Discount Amount: 0 VND
Final Total: 320,000 VND

Ticket 2
Type: VIPTicket
Ticket ID: T-MIN2
Movie Title: Interstellar
Quantity: 2
Unit Price: 150,000 VND
Discount Amount: 0 VND
Final Total: 300,000 VND

=== MENU ===
1. Add ticket purchases
2. Display all purchases
3. Search purchases by movie title
4. Total revenue
5. Movie title with the highest total revenue
6. Display purchases from highest to lowest final total
7. Exit
============
Your choice: 3

--- Search By Movie Title ---
Enter movie title to search: inception

Ticket 1
Type: RegularTicket
Ticket ID: T-MIN1
Movie Title: Inception
Quantity: 4
Unit Price: 80,000 VND
Discount Amount: 0 VND
Final Total: 320,000 VND

=== MENU ===
1. Add ticket purchases
2. Display all purchases
3. Search purchases by movie title
4. Total revenue
5. Movie title with the highest total revenue
6. Display purchases from highest to lowest final total
7. Exit
============
Your choice: 4

--- Total Revenue ---
Total revenue: 620,000 VND

=== MENU ===
1. Add ticket purchases
2. Display all purchases
3. Search purchases by movie title
4. Total revenue
5. Movie title with the highest total revenue
6. Display purchases from highest to lowest final total
7. Exit
============
Your choice: 5

--- Movie With The Highest Total Revenue ---
Movie with the highest revenue: Inception
Total revenue of this movie: 320,000 VND

=== MENU ===
1. Add ticket purchases
2. Display all purchases
3. Search purchases by movie title
4. Total revenue
5. Movie title with the highest total revenue
6. Display purchases from highest to lowest final total
7. Exit
============
Your choice: 6

--- Purchases From Highest To Lowest Final Total ---

Ticket 1
Type: RegularTicket
Ticket ID: T-MIN1
Movie Title: Inception
Quantity: 4
Unit Price: 80,000 VND
Discount Amount: 0 VND
Final Total: 320,000 VND

Ticket 2
Type: VIPTicket
Ticket ID: T-MIN2
Movie Title: Interstellar
Quantity: 2
Unit Price: 150,000 VND
Discount Amount: 0 VND
Final Total: 300,000 VND

=== MENU ===
1. Add ticket purchases
2. Display all purchases
3. Search purchases by movie title
4. Total revenue
5. Movie title with the highest total revenue
6. Display purchases from highest to lowest final total
7. Exit
============
Your choice: 7
Goodbye!
```

---

## Test Case 3: Numerical Field Violations (Invalid menu 8, n <= 0, invalid ticket type 4, quantity < 1, search movie not found)

### Input
```text
8
1
0
-1
2
4
1
T10
Dune
0
-3
6
2
T20
Oppenheimer
-2
4
2
3
Titanic
4
5
6
7
```

### Output
```text
=== MENU ===
1. Add ticket purchases
2. Display all purchases
3. Search purchases by movie title
4. Total revenue
5. Movie title with the highest total revenue
6. Display purchases from highest to lowest final total
7. Exit
============
Your choice: 8
Invalid choice.

=== MENU ===
1. Add ticket purchases
2. Display all purchases
3. Search purchases by movie title
4. Total revenue
5. Movie title with the highest total revenue
6. Display purchases from highest to lowest final total
7. Exit
============
Your choice: 1

--- Add Ticket Purchases ---
Enter number of purchases (n > 0): 0
Invalid number of purchases (n > 0). Enter again: -1
Invalid number of purchases (n > 0). Enter again: 2

Purchase 1/2
Choose ticket type (1. RegularTicket / 2. VIPTicket): 4
Invalid ticket type. Enter again (1 or 2): 1
Ticket ID: T10
Movie Title: Dune
Quantity (>= 1): 0
Invalid quantity (>= 1). Enter again: -3
Invalid quantity (>= 1). Enter again: 6

Purchase 2/2
Choose ticket type (1. RegularTicket / 2. VIPTicket): 2
Ticket ID: T20
Movie Title: Oppenheimer
Quantity (>= 1): -2
Invalid quantity (>= 1). Enter again: 4
Added 2 purchase(s) successfully.

=== MENU ===
1. Add ticket purchases
2. Display all purchases
3. Search purchases by movie title
4. Total revenue
5. Movie title with the highest total revenue
6. Display purchases from highest to lowest final total
7. Exit
============
Your choice: 2

--- Display All Purchases ---

Ticket 1
Type: RegularTicket
Ticket ID: T10
Movie Title: Dune
Quantity: 6
Unit Price: 80,000 VND
Discount Amount: 48,000 VND
Final Total: 432,000 VND

Ticket 2
Type: VIPTicket
Ticket ID: T20
Movie Title: Oppenheimer
Quantity: 4
Unit Price: 150,000 VND
Discount Amount: 90,000 VND
Final Total: 510,000 VND

=== MENU ===
1. Add ticket purchases
2. Display all purchases
3. Search purchases by movie title
4. Total revenue
5. Movie title with the highest total revenue
6. Display purchases from highest to lowest final total
7. Exit
============
Your choice: 3

--- Search By Movie Title ---
Enter movie title to search: Titanic
No purchase found for this movie title.

=== MENU ===
1. Add ticket purchases
2. Display all purchases
3. Search purchases by movie title
4. Total revenue
5. Movie title with the highest total revenue
6. Display purchases from highest to lowest final total
7. Exit
============
Your choice: 4

--- Total Revenue ---
Total revenue: 942,000 VND

=== MENU ===
1. Add ticket purchases
2. Display all purchases
3. Search purchases by movie title
4. Total revenue
5. Movie title with the highest total revenue
6. Display purchases from highest to lowest final total
7. Exit
============
Your choice: 5

--- Movie With The Highest Total Revenue ---
Movie with the highest revenue: Oppenheimer
Total revenue of this movie: 510,000 VND

=== MENU ===
1. Add ticket purchases
2. Display all purchases
3. Search purchases by movie title
4. Total revenue
5. Movie title with the highest total revenue
6. Display purchases from highest to lowest final total
7. Exit
============
Your choice: 6

--- Purchases From Highest To Lowest Final Total ---

Ticket 1
Type: VIPTicket
Ticket ID: T20
Movie Title: Oppenheimer
Quantity: 4
Unit Price: 150,000 VND
Discount Amount: 90,000 VND
Final Total: 510,000 VND

Ticket 2
Type: RegularTicket
Ticket ID: T10
Movie Title: Dune
Quantity: 6
Unit Price: 80,000 VND
Discount Amount: 48,000 VND
Final Total: 432,000 VND

=== MENU ===
1. Add ticket purchases
2. Display all purchases
3. Search purchases by movie title
4. Total revenue
5. Movie title with the highest total revenue
6. Display purchases from highest to lowest final total
7. Exit
============
Your choice: 7
Goodbye!
```

---

## Test Case 4: String Field Violations, Duplicate ID, Multi-Purchase Aggregation (Empty Ticket ID/Movie Title, duplicate ID, search and highest revenue aggregating across multiple purchases of Avengers)

### Input
```text
1
3
1

TCK01

Avengers
1
2
tck01
TCK02
Batman
1
2
TCK03
Avengers
5
2
3
avengers
4
5
6
7
```

### Output
```text
=== MENU ===
1. Add ticket purchases
2. Display all purchases
3. Search purchases by movie title
4. Total revenue
5. Movie title with the highest total revenue
6. Display purchases from highest to lowest final total
7. Exit
============
Your choice: 1

--- Add Ticket Purchases ---
Enter number of purchases (n > 0): 3

Purchase 1/3
Choose ticket type (1. RegularTicket / 2. VIPTicket): 1
Ticket ID: 
Ticket ID must not be empty. Enter again: TCK01
Movie Title: 
Movie title must not be empty. Enter again: Avengers
Quantity (>= 1): 1

Purchase 2/3
Choose ticket type (1. RegularTicket / 2. VIPTicket): 2
Ticket ID: tck01
Duplicate ticket ID. Enter again: TCK02
Movie Title: Batman
Quantity (>= 1): 1

Purchase 3/3
Choose ticket type (1. RegularTicket / 2. VIPTicket): 2
Ticket ID: TCK03
Movie Title: Avengers
Quantity (>= 1): 5
Added 3 purchase(s) successfully.

=== MENU ===
1. Add ticket purchases
2. Display all purchases
3. Search purchases by movie title
4. Total revenue
5. Movie title with the highest total revenue
6. Display purchases from highest to lowest final total
7. Exit
============
Your choice: 2

--- Display All Purchases ---

Ticket 1
Type: RegularTicket
Ticket ID: TCK01
Movie Title: Avengers
Quantity: 1
Unit Price: 80,000 VND
Discount Amount: 0 VND
Final Total: 80,000 VND

Ticket 2
Type: VIPTicket
Ticket ID: TCK02
Movie Title: Batman
Quantity: 1
Unit Price: 150,000 VND
Discount Amount: 0 VND
Final Total: 150,000 VND

Ticket 3
Type: VIPTicket
Ticket ID: TCK03
Movie Title: Avengers
Quantity: 5
Unit Price: 150,000 VND
Discount Amount: 112,500 VND
Final Total: 637,500 VND

=== MENU ===
1. Add ticket purchases
2. Display all purchases
3. Search purchases by movie title
4. Total revenue
5. Movie title with the highest total revenue
6. Display purchases from highest to lowest final total
7. Exit
============
Your choice: 3

--- Search By Movie Title ---
Enter movie title to search: avengers

Ticket 1
Type: RegularTicket
Ticket ID: TCK01
Movie Title: Avengers
Quantity: 1
Unit Price: 80,000 VND
Discount Amount: 0 VND
Final Total: 80,000 VND

Ticket 2
Type: VIPTicket
Ticket ID: TCK03
Movie Title: Avengers
Quantity: 5
Unit Price: 150,000 VND
Discount Amount: 112,500 VND
Final Total: 637,500 VND

=== MENU ===
1. Add ticket purchases
2. Display all purchases
3. Search purchases by movie title
4. Total revenue
5. Movie title with the highest total revenue
6. Display purchases from highest to lowest final total
7. Exit
============
Your choice: 4

--- Total Revenue ---
Total revenue: 867,500 VND

=== MENU ===
1. Add ticket purchases
2. Display all purchases
3. Search purchases by movie title
4. Total revenue
5. Movie title with the highest total revenue
6. Display purchases from highest to lowest final total
7. Exit
============
Your choice: 5

--- Movie With The Highest Total Revenue ---
Movie with the highest revenue: Avengers
Total revenue of this movie: 717,500 VND

=== MENU ===
1. Add ticket purchases
2. Display all purchases
3. Search purchases by movie title
4. Total revenue
5. Movie title with the highest total revenue
6. Display purchases from highest to lowest final total
7. Exit
============
Your choice: 6

--- Purchases From Highest To Lowest Final Total ---

Ticket 1
Type: VIPTicket
Ticket ID: TCK03
Movie Title: Avengers
Quantity: 5
Unit Price: 150,000 VND
Discount Amount: 112,500 VND
Final Total: 637,500 VND

Ticket 2
Type: VIPTicket
Ticket ID: TCK02
Movie Title: Batman
Quantity: 1
Unit Price: 150,000 VND
Discount Amount: 0 VND
Final Total: 150,000 VND

Ticket 3
Type: RegularTicket
Ticket ID: TCK01
Movie Title: Avengers
Quantity: 1
Unit Price: 80,000 VND
Discount Amount: 0 VND
Final Total: 80,000 VND

=== MENU ===
1. Add ticket purchases
2. Display all purchases
3. Search purchases by movie title
4. Total revenue
5. Movie title with the highest total revenue
6. Display purchases from highest to lowest final total
7. Exit
============
Your choice: 7
Goodbye!
```

---

## Test Case 5: Empty Collection Operations & Single-Purchase Addition (All operations on empty list first, then single-ticket VIP addition and verification)

### Input
```text
2
3
4
5
6
1
1
2
VIP-SOLO
Gladiator
3
2
3
Gladiator
4
5
6
7
```

### Output
```text
=== MENU ===
1. Add ticket purchases
2. Display all purchases
3. Search purchases by movie title
4. Total revenue
5. Movie title with the highest total revenue
6. Display purchases from highest to lowest final total
7. Exit
============
Your choice: 2

--- Display All Purchases ---
The ticket list is empty.

=== MENU ===
1. Add ticket purchases
2. Display all purchases
3. Search purchases by movie title
4. Total revenue
5. Movie title with the highest total revenue
6. Display purchases from highest to lowest final total
7. Exit
============
Your choice: 3

--- Search By Movie Title ---
The ticket list is empty.

=== MENU ===
1. Add ticket purchases
2. Display all purchases
3. Search purchases by movie title
4. Total revenue
5. Movie title with the highest total revenue
6. Display purchases from highest to lowest final total
7. Exit
============
Your choice: 4

--- Total Revenue ---
Total revenue: 0 VND

=== MENU ===
1. Add ticket purchases
2. Display all purchases
3. Search purchases by movie title
4. Total revenue
5. Movie title with the highest total revenue
6. Display purchases from highest to lowest final total
7. Exit
============
Your choice: 5

--- Movie With The Highest Total Revenue ---
The ticket list is empty.

=== MENU ===
1. Add ticket purchases
2. Display all purchases
3. Search purchases by movie title
4. Total revenue
5. Movie title with the highest total revenue
6. Display purchases from highest to lowest final total
7. Exit
============
Your choice: 6

--- Purchases From Highest To Lowest Final Total ---
The ticket list is empty.

=== MENU ===
1. Add ticket purchases
2. Display all purchases
3. Search purchases by movie title
4. Total revenue
5. Movie title with the highest total revenue
6. Display purchases from highest to lowest final total
7. Exit
============
Your choice: 1

--- Add Ticket Purchases ---
Enter number of purchases (n > 0): 1

Purchase 1/1
Choose ticket type (1. RegularTicket / 2. VIPTicket): 2
Ticket ID: VIP-SOLO
Movie Title: Gladiator
Quantity (>= 1): 3
Added 1 purchase(s) successfully.

=== MENU ===
1. Add ticket purchases
2. Display all purchases
3. Search purchases by movie title
4. Total revenue
5. Movie title with the highest total revenue
6. Display purchases from highest to lowest final total
7. Exit
============
Your choice: 2

--- Display All Purchases ---

Ticket 1
Type: VIPTicket
Ticket ID: VIP-SOLO
Movie Title: Gladiator
Quantity: 3
Unit Price: 150,000 VND
Discount Amount: 67,500 VND
Final Total: 382,500 VND

=== MENU ===
1. Add ticket purchases
2. Display all purchases
3. Search purchases by movie title
4. Total revenue
5. Movie title with the highest total revenue
6. Display purchases from highest to lowest final total
7. Exit
============
Your choice: 3

--- Search By Movie Title ---
Enter movie title to search: Gladiator

Ticket 1
Type: VIPTicket
Ticket ID: VIP-SOLO
Movie Title: Gladiator
Quantity: 3
Unit Price: 150,000 VND
Discount Amount: 67,500 VND
Final Total: 382,500 VND

=== MENU ===
1. Add ticket purchases
2. Display all purchases
3. Search purchases by movie title
4. Total revenue
5. Movie title with the highest total revenue
6. Display purchases from highest to lowest final total
7. Exit
============
Your choice: 4

--- Total Revenue ---
Total revenue: 382,500 VND

=== MENU ===
1. Add ticket purchases
2. Display all purchases
3. Search purchases by movie title
4. Total revenue
5. Movie title with the highest total revenue
6. Display purchases from highest to lowest final total
7. Exit
============
Your choice: 5

--- Movie With The Highest Total Revenue ---
Movie with the highest revenue: Gladiator
Total revenue of this movie: 382,500 VND

=== MENU ===
1. Add ticket purchases
2. Display all purchases
3. Search purchases by movie title
4. Total revenue
5. Movie title with the highest total revenue
6. Display purchases from highest to lowest final total
7. Exit
============
Your choice: 6

--- Purchases From Highest To Lowest Final Total ---

Ticket 1
Type: VIPTicket
Ticket ID: VIP-SOLO
Movie Title: Gladiator
Quantity: 3
Unit Price: 150,000 VND
Discount Amount: 67,500 VND
Final Total: 382,500 VND

=== MENU ===
1. Add ticket purchases
2. Display all purchases
3. Search purchases by movie title
4. Total revenue
5. Movie title with the highest total revenue
6. Display purchases from highest to lowest final total
7. Exit
============
Your choice: 7
Goodbye!
```

