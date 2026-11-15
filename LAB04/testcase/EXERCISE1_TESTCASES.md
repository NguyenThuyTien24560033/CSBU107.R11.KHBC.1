# Exercise 1: Test Cases (Input -> Output)

## Test Case 1: Standard Ideal Case (Happy path covering all 7 functions without errors, using assignment suggested sample)

### Input
```text
1
2
1
B01
Java Programming
James Gosling
3
200
2
M01
Tech Magazine
ACM
3
12
2
3
B01
4
5
6
7
```

### Output
```text
===MENU===
1.Add items

2.Display each item and its fee

3.Search by item ID

4.Count the number of each type

5.Total borrowing revenue

6.Find the item with the highest fee

7.Exit
==========

Enter your choice: 1
===Add items===
Enter the number of item (>=1): 2
Choose the Item Type (1.PrintedBook / 2.Magazine): 1
Unique ID: B01
Title: Java Programming
Author: James Gosling
The number of days borrowed(>=1): 3
The number of pages(>=1): 200
Choose the Item Type (1.PrintedBook / 2.Magazine): 2
Unique ID: M01
Title: Tech Magazine
Author: ACM
The number of days borrowed(>=1): 3
Issue(>=1): 12

===MENU===
1.Add items

2.Display each item and its fee

3.Search by item ID

4.Count the number of each type

5.Total borrowing revenue

6.Find the item with the highest fee

7.Exit
==========

Enter your choice: 2

===Display each item and its fee===

Item 1
Unique ID: B01
Title: Java Programming
Author: James Gosling
The number of days borrowed: 3
The number of pages: 200
Its fee: 17,000 VND

Item 2
Unique ID: M01
Title: Tech Magazine
Author: ACM
The number of days borrowed: 3
Issue: 12
Its fee: 11,000 VND

===MENU===
1.Add items

2.Display each item and its fee

3.Search by item ID

4.Count the number of each type

5.Total borrowing revenue

6.Find the item with the highest fee

7.Exit
==========

Enter your choice: 3

===Search by item ID===

Enter item ID to search: B01
Unique ID: B01
Title: Java Programming
Author: James Gosling
The number of days borrowed: 3
The number of pages: 200
Its fee: 17,000 VND

===MENU===
1.Add items

2.Display each item and its fee

3.Search by item ID

4.Count the number of each type

5.Total borrowing revenue

6.Find the item with the highest fee

7.Exit
==========

Enter your choice: 4

===Count the number of each type===

PrintedBook: 1

Magazine: 1

===MENU===
1.Add items

2.Display each item and its fee

3.Search by item ID

4.Count the number of each type

5.Total borrowing revenue

6.Find the item with the highest fee

7.Exit
==========

Enter your choice: 5

Total borrowing revenue: 28,000 VND

===MENU===
1.Add items

2.Display each item and its fee

3.Search by item ID

4.Count the number of each type

5.Total borrowing revenue

6.Find the item with the highest fee

7.Exit
==========

Enter your choice: 6

The item has the highest fee with the fee is: 17,000 VND
Unique ID: B01
Title: Java Programming
Author: James Gosling
The number of days borrowed: 3
The number of pages: 200
Its fee: 17,000 VND

===MENU===
1.Add items

2.Display each item and its fee

3.Search by item ID

4.Count the number of each type

5.Total borrowing revenue

6.Find the item with the highest fee

7.Exit
==========

Enter your choice: 7
Goodbye!
```

---

## Test Case 2: Boundary Value Testing (Minimum allowed values: days = 1, pages = 1, issue = 1, case-insensitive search)

### Input
```text
1
2
1
B-MIN
Short Story
Alice
1
1
2
M-MIN
Daily News
Bob
1
1
2
3
b-min
4
5
6
7
```

### Output
```text
===MENU===
1.Add items

2.Display each item and its fee

3.Search by item ID

4.Count the number of each type

5.Total borrowing revenue

6.Find the item with the highest fee

7.Exit
==========

Enter your choice: 1
===Add items===
Enter the number of item (>=1): 2
Choose the Item Type (1.PrintedBook / 2.Magazine): 1
Unique ID: B-MIN
Title: Short Story
Author: Alice
The number of days borrowed(>=1): 1
The number of pages(>=1): 1
Choose the Item Type (1.PrintedBook / 2.Magazine): 2
Unique ID: M-MIN
Title: Daily News
Author: Bob
The number of days borrowed(>=1): 1
Issue(>=1): 1

===MENU===
1.Add items

2.Display each item and its fee

3.Search by item ID

4.Count the number of each type

5.Total borrowing revenue

6.Find the item with the highest fee

7.Exit
==========

Enter your choice: 2

===Display each item and its fee===

Item 1
Unique ID: B-MIN
Title: Short Story
Author: Alice
The number of days borrowed: 1
The number of pages: 1
Its fee: 5,010 VND

Item 2
Unique ID: M-MIN
Title: Daily News
Author: Bob
The number of days borrowed: 1
Issue: 1
Its fee: 5,000 VND

===MENU===
1.Add items

2.Display each item and its fee

3.Search by item ID

4.Count the number of each type

5.Total borrowing revenue

6.Find the item with the highest fee

7.Exit
==========

Enter your choice: 3

===Search by item ID===

Enter item ID to search: b-min
Unique ID: B-MIN
Title: Short Story
Author: Alice
The number of days borrowed: 1
The number of pages: 1
Its fee: 5,010 VND

===MENU===
1.Add items

2.Display each item and its fee

3.Search by item ID

4.Count the number of each type

5.Total borrowing revenue

6.Find the item with the highest fee

7.Exit
==========

Enter your choice: 4

===Count the number of each type===

PrintedBook: 1

Magazine: 1

===MENU===
1.Add items

2.Display each item and its fee

3.Search by item ID

4.Count the number of each type

5.Total borrowing revenue

6.Find the item with the highest fee

7.Exit
==========

Enter your choice: 5

Total borrowing revenue: 10,010 VND

===MENU===
1.Add items

2.Display each item and its fee

3.Search by item ID

4.Count the number of each type

5.Total borrowing revenue

6.Find the item with the highest fee

7.Exit
==========

Enter your choice: 6

The item has the highest fee with the fee is: 5,010 VND
Unique ID: B-MIN
Title: Short Story
Author: Alice
The number of days borrowed: 1
The number of pages: 1
Its fee: 5,010 VND

===MENU===
1.Add items

2.Display each item and its fee

3.Search by item ID

4.Count the number of each type

5.Total borrowing revenue

6.Find the item with the highest fee

7.Exit
==========

Enter your choice: 7
Goodbye!
```

---

## Test Case 3: Numerical Field Violations (Invalid menu choice 8, n <= 0, invalid type 99, days <= 0, pages <= 0, issue <= 0, search non-existent item)

### Input
```text
8
1
-2
0
2
99
1
BK01
Python Basics
Guido
-5
0
3
-100
0
150
2
MG01
Tech World
Editor
0
2
-3
0
5
2
3
X99
4
5
6
7
```

### Output
```text
===MENU===
1.Add items

2.Display each item and its fee

3.Search by item ID

4.Count the number of each type

5.Total borrowing revenue

6.Find the item with the highest fee

7.Exit
==========

Enter your choice: 8
Invalid choice.

===MENU===
1.Add items

2.Display each item and its fee

3.Search by item ID

4.Count the number of each type

5.Total borrowing revenue

6.Find the item with the highest fee

7.Exit
==========

Enter your choice: 1
===Add items===
Enter the number of item (>=1): -2
Inavalid the number of item(n>=1). Please enter again : 0
Inavalid the number of item(n>=1). Please enter again : 2
Choose the Item Type (1.PrintedBook / 2.Magazine): 99
Invalid type.Choose the Item Type (1.PrintedBook / 2.Magazine): 1
Unique ID: BK01
Title: Python Basics
Author: Guido
The number of days borrowed(>=1): -5
Invalid the number of days borrowed(>=1). Please enter again: 0
Invalid the number of days borrowed(>=1). Please enter again: 3
The number of pages(>=1): -100
Invalid the number of pages(>=1). Please enter again: 0
Invalid the number of pages(>=1). Please enter again: 150
Choose the Item Type (1.PrintedBook / 2.Magazine): 2
Unique ID: MG01
Title: Tech World
Author: Editor
The number of days borrowed(>=1): 0
Invalid the number of days borrowed(>=1). Please enter again: 2
Issue(>=1): -3
Invalid issue(>=1). Please enter again: 0
Invalid issue(>=1). Please enter again: 5

===MENU===
1.Add items

2.Display each item and its fee

3.Search by item ID

4.Count the number of each type

5.Total borrowing revenue

6.Find the item with the highest fee

7.Exit
==========

Enter your choice: 2

===Display each item and its fee===

Item 1
Unique ID: BK01
Title: Python Basics
Author: Guido
The number of days borrowed: 3
The number of pages: 150
Its fee: 16,500 VND

Item 2
Unique ID: MG01
Title: Tech World
Author: Editor
The number of days borrowed: 2
Issue: 5
Its fee: 8,000 VND

===MENU===
1.Add items

2.Display each item and its fee

3.Search by item ID

4.Count the number of each type

5.Total borrowing revenue

6.Find the item with the highest fee

7.Exit
==========

Enter your choice: 3

===Search by item ID===

Enter item ID to search: X99
Item does not exist.

===MENU===
1.Add items

2.Display each item and its fee

3.Search by item ID

4.Count the number of each type

5.Total borrowing revenue

6.Find the item with the highest fee

7.Exit
==========

Enter your choice: 4

===Count the number of each type===

PrintedBook: 1

Magazine: 1

===MENU===
1.Add items

2.Display each item and its fee

3.Search by item ID

4.Count the number of each type

5.Total borrowing revenue

6.Find the item with the highest fee

7.Exit
==========

Enter your choice: 5

Total borrowing revenue: 24,500 VND

===MENU===
1.Add items

2.Display each item and its fee

3.Search by item ID

4.Count the number of each type

5.Total borrowing revenue

6.Find the item with the highest fee

7.Exit
==========

Enter your choice: 6

The item has the highest fee with the fee is: 16,500 VND
Unique ID: BK01
Title: Python Basics
Author: Guido
The number of days borrowed: 3
The number of pages: 150
Its fee: 16,500 VND

===MENU===
1.Add items

2.Display each item and its fee

3.Search by item ID

4.Count the number of each type

5.Total borrowing revenue

6.Find the item with the highest fee

7.Exit
==========

Enter your choice: 7
Goodbye!
```

---

## Test Case 4: String Field Violations (Empty/whitespace ID rejection, duplicate exact ID rejection, duplicate case-insensitive ID rejection)

### Input
```text
1
2
1
   
LIB-01
Operating Systems
Tanenbaum
4
500
2
LIB-01
lib-01
LIB-02
Linux Journal
Linus
10
20
2
3
lib-02
4
5
6
7
```

### Output
```text
===MENU===
1.Add items

2.Display each item and its fee

3.Search by item ID

4.Count the number of each type

5.Total borrowing revenue

6.Find the item with the highest fee

7.Exit
==========

Enter your choice: 1
===Add items===
Enter the number of item (>=1): 2
Choose the Item Type (1.PrintedBook / 2.Magazine): 1
Unique ID:    
ID must not be empty. Enter again: LIB-01
Title: Operating Systems
Author: Tanenbaum
The number of days borrowed(>=1): 4
The number of pages(>=1): 500
Choose the Item Type (1.PrintedBook / 2.Magazine): 2
Unique ID: LIB-01
Duplicate unique ID. Enter again: lib-01
Duplicate unique ID. Enter again: LIB-02
Title: Linux Journal
Author: Linus
The number of days borrowed(>=1): 10
Issue(>=1): 20

===MENU===
1.Add items

2.Display each item and its fee

3.Search by item ID

4.Count the number of each type

5.Total borrowing revenue

6.Find the item with the highest fee

7.Exit
==========

Enter your choice: 2

===Display each item and its fee===

Item 1
Unique ID: LIB-01
Title: Operating Systems
Author: Tanenbaum
The number of days borrowed: 4
The number of pages: 500
Its fee: 25,000 VND

Item 2
Unique ID: LIB-02
Title: Linux Journal
Author: Linus
The number of days borrowed: 10
Issue: 20
Its fee: 32,000 VND

===MENU===
1.Add items

2.Display each item and its fee

3.Search by item ID

4.Count the number of each type

5.Total borrowing revenue

6.Find the item with the highest fee

7.Exit
==========

Enter your choice: 3

===Search by item ID===

Enter item ID to search: lib-02
Unique ID: LIB-02
Title: Linux Journal
Author: Linus
The number of days borrowed: 10
Issue: 20
Its fee: 32,000 VND

===MENU===
1.Add items

2.Display each item and its fee

3.Search by item ID

4.Count the number of each type

5.Total borrowing revenue

6.Find the item with the highest fee

7.Exit
==========

Enter your choice: 4

===Count the number of each type===

PrintedBook: 1

Magazine: 1

===MENU===
1.Add items

2.Display each item and its fee

3.Search by item ID

4.Count the number of each type

5.Total borrowing revenue

6.Find the item with the highest fee

7.Exit
==========

Enter your choice: 5

Total borrowing revenue: 57,000 VND

===MENU===
1.Add items

2.Display each item and its fee

3.Search by item ID

4.Count the number of each type

5.Total borrowing revenue

6.Find the item with the highest fee

7.Exit
==========

Enter your choice: 6

The item has the highest fee with the fee is: 32,000 VND
Unique ID: LIB-02
Title: Linux Journal
Author: Linus
The number of days borrowed: 10
Issue: 20
Its fee: 32,000 VND

===MENU===
1.Add items

2.Display each item and its fee

3.Search by item ID

4.Count the number of each type

5.Total borrowing revenue

6.Find the item with the highest fee

7.Exit
==========

Enter your choice: 7
Goodbye!
```

---

## Test Case 5: Empty Collection & Single-Type Operations (All operations on empty list first, then single-type Magazine add & verification)

### Input
```text
2
3
ANY_ID
4
5
6
1
1
2
M-SOLO
Solo Magazine
Writer
1
1
2
3
M-SOLO
4
5
6
7
```

### Output
```text
===MENU===
1.Add items

2.Display each item and its fee

3.Search by item ID

4.Count the number of each type

5.Total borrowing revenue

6.Find the item with the highest fee

7.Exit
==========

Enter your choice: 2

===Display each item and its fee===

Empty Array

===MENU===
1.Add items

2.Display each item and its fee

3.Search by item ID

4.Count the number of each type

5.Total borrowing revenue

6.Find the item with the highest fee

7.Exit
==========

Enter your choice: 3

===Search by item ID===

Enter item ID to search: ANY_ID
Item does not exist.

===MENU===
1.Add items

2.Display each item and its fee

3.Search by item ID

4.Count the number of each type

5.Total borrowing revenue

6.Find the item with the highest fee

7.Exit
==========

Enter your choice: 4

===Count the number of each type===

PrintedBook: 0

Magazine: 0

===MENU===
1.Add items

2.Display each item and its fee

3.Search by item ID

4.Count the number of each type

5.Total borrowing revenue

6.Find the item with the highest fee

7.Exit
==========

Enter your choice: 5

Total borrowing revenue: 0 VND

===MENU===
1.Add items

2.Display each item and its fee

3.Search by item ID

4.Count the number of each type

5.Total borrowing revenue

6.Find the item with the highest fee

7.Exit
==========

Enter your choice: 6
Empty Array.

===MENU===
1.Add items

2.Display each item and its fee

3.Search by item ID

4.Count the number of each type

5.Total borrowing revenue

6.Find the item with the highest fee

7.Exit
==========

Enter your choice: 1
===Add items===
Enter the number of item (>=1): 1
Choose the Item Type (1.PrintedBook / 2.Magazine): 2
Unique ID: M-SOLO
Title: Solo Magazine
Author: Writer
The number of days borrowed(>=1): 1
Issue(>=1): 1

===MENU===
1.Add items

2.Display each item and its fee

3.Search by item ID

4.Count the number of each type

5.Total borrowing revenue

6.Find the item with the highest fee

7.Exit
==========

Enter your choice: 2

===Display each item and its fee===

Item 1
Unique ID: M-SOLO
Title: Solo Magazine
Author: Writer
The number of days borrowed: 1
Issue: 1
Its fee: 5,000 VND

===MENU===
1.Add items

2.Display each item and its fee

3.Search by item ID

4.Count the number of each type

5.Total borrowing revenue

6.Find the item with the highest fee

7.Exit
==========

Enter your choice: 3

===Search by item ID===

Enter item ID to search: M-SOLO
Unique ID: M-SOLO
Title: Solo Magazine
Author: Writer
The number of days borrowed: 1
Issue: 1
Its fee: 5,000 VND

===MENU===
1.Add items

2.Display each item and its fee

3.Search by item ID

4.Count the number of each type

5.Total borrowing revenue

6.Find the item with the highest fee

7.Exit
==========

Enter your choice: 4

===Count the number of each type===

PrintedBook: 0

Magazine: 1

===MENU===
1.Add items

2.Display each item and its fee

3.Search by item ID

4.Count the number of each type

5.Total borrowing revenue

6.Find the item with the highest fee

7.Exit
==========

Enter your choice: 5

Total borrowing revenue: 5,000 VND

===MENU===
1.Add items

2.Display each item and its fee

3.Search by item ID

4.Count the number of each type

5.Total borrowing revenue

6.Find the item with the highest fee

7.Exit
==========

Enter your choice: 6

The item has the highest fee with the fee is: 5,000 VND
Unique ID: M-SOLO
Title: Solo Magazine
Author: Writer
The number of days borrowed: 1
Issue: 1
Its fee: 5,000 VND

===MENU===
1.Add items

2.Display each item and its fee

3.Search by item ID

4.Count the number of each type

5.Total borrowing revenue

6.Find the item with the highest fee

7.Exit
==========

Enter your choice: 7
Goodbye!
```

