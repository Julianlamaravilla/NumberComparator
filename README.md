# Java Minimum Number Comparison Program

## Description

This Java program asks the user to enter **10 numbers** through the keyboard, determines the **smallest number (minimum)**, and then compares that number with **10** to display a message.

The program uses:

* `Scanner` for user input
* A `for` loop to read numbers
* A comparison structure (`if-else`) to evaluate the minimum number

---

## How the Program Works

### Step 1 — Initialize Variables

```java
double min = 1E12, input;
```

* `min` is initialized with a very large number (`1E12 = 1 × 10¹²`) to ensure that any number entered by the user will be smaller and replace it.
* `input` stores each number entered by the user.

---

### Step 2 — Input Numbers

The program uses a `for` loop to ask the user to enter **10 numbers**:

```java
for(int i = 0; i < 10; i++){
    System.out.println("Enter a number : ");
    input  = s.nextDouble();
    if(input <= min){
        min = input;
    }
}
```

Each time the user enters a number:

* The program compares it with `min`
* If the number is smaller, it becomes the new minimum

---

### Step 3 — Compare the Minimum with 10

After finding the minimum number, the program compares it with 10:

```java
if(min < 10){
    System.out.println("Number is less than 10! : " + min);
} else if (min > 10){
    System.out.println("Number is greater than 10! : " + min);
} else {
    System.out.println("Number is : " + min);
}
```

### Possible Results

* If the minimum number is **less than 10** → prints: `"Number is less than 10"`
* If the minimum number is **greater than 10** → prints: `"Number is greater than 10"`
* If the minimum number is **equal to 10** → prints only the number

---

## How to Compile and Run

```bash
javac Main.java
java Main
```

---

## Example Execution

```
Enter a number:
15
Enter a number:
22
Enter a number:
8
Enter a number:
30
Enter a number:
12
Enter a number:
9
Enter a number:
50
Enter a number:
11
Enter a number:
18
Enter a number:
25

Number is less than 10! : 8
```

---

## Concepts Practiced

This program helps practice the following Java concepts:

* Scanner input
* For loops
* Conditional statements
* Minimum value algorithm
* Variables and comparisons

---

## Possible Improvements

* Validate that the user enters numeric values
* Allow the user to choose how many numbers to input
* Store the numbers in an array or ArrayList
* Close the Scanner with `s.close()`

---

## Author

Created as a basic Java exercise to practice loops, conditionals, and minimum value logic.
