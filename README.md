# Random Number Sorter

## Overview

This Java program generates a user-defined number of random integers, separates them into even and odd numbers, sorts the even numbers in ascending order and the odd numbers in descending order, and then displays them. It also provides a count of even and odd numbers.

## Features

- Prompts the user to specify how many random numbers to generate.
- Randomizes integers between 0 and 999.
- Separates numbers into even and odd arrays.
- Sorts even numbers in ascending order and odd numbers in descending order.
- Displays the randomized numbers and the sorted numbers.
- Provides a count of even and odd numbers.

## Usage

1. **Run the Program:**
   - Compile and run the `Main` class using a Java IDE or command line.

2. **Input:**
   - When prompted, enter the number of random integers you want to generate. The program will generate this many random numbers between 0 and 999.

3. **Output:**
   - The program first displays the list of random numbers.
   - It then shows the even numbers sorted in ascending order.
   - Next, it shows the odd numbers sorted in descending order.
   - Finally, it provides a count of even and odd numbers.

## Example
```plaintext
How many numbers in the range 0 - 999 are desired? 10

Here are the random numbers:
600 533 114 488 537 736 38 134 424 190 

Here are the random numbers arranged:
38 114 134 190 424 488 600 736 - 537 533 

Of the above 10 numbers, 8 were even and 2 were odd.

## Code Explanation

1. **User Input:**
   - The program prompts the user to enter the number of random integers.
   - Input validation ensures the number is a positive integer and handles exceptions.

2. **Random Number Generation:**
   - Generates random integers between 0 and 999.
   - Stores the numbers in an array.

3. **Classification:**
   - Separates numbers into even and odd arrays.

4. **Sorting:**
   - Sorts the even numbers in ascending order.
   - Sorts the odd numbers in descending order.

5. **Display:**
   - Shows the original random numbers.
   - Displays sorted even and odd numbers.
   - Prints the count of even and odd numbers.
