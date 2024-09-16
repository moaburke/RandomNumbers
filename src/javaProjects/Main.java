package javaProjects;

import java.util.Scanner;
import java.util.InputMismatchException;
  
class Main {

  // 
  /**
  * The program will randomize an amount of numbers set by the user and print them in the order they are randomized. The program will then arrage the numbers, even numbers in ascending order and odd numbers in descending order, and then print them out. Finally the amount of even and odd numbers are displayed.
  *
  * 1. Prompt user to input how many numbers to be randomized.
  * 2. Create an array of the same size as the value given by the user. As well as two temporary arrays in the same size, one for even and one for odd numbers.
  * 3. Randomize the numbers and store them in the array in the order they as being randomized.
  * 4. Identify even and odd numbers and count them.
  * 5. Display the number in the order they were randomized.
  * 6. Sort the array with the even numbers in ascending order.
  * 7. Sort the array with the odd numbers in descending order.
  * 8. Display the amount of even, odd and total numbers. 
  *
  * do { // Loops until user enters a valid number
  *   User enter a value
  *   try { // Tries to convert user input to an integer
  *      Initialize an array with the value given by the user
  *      Initialize a temporary array for even numbers with the value given by the user
  *      Initialize a temporary array for odd numbers with the value given by the user
  *   } catch { //If the read number was too large
  *     Print an error message
  *   } catch { //If the read input was not an integer or if it was out of range
  *     Print an error message
  *   } catch { //If not an integer and when converting a string with an incorrect format to a numeric value
  *     Print an error message
  *   }
  * } while(user input is not valid)
  * for (Amount of random numbers given by the user){ 
  *  Generate random number
  *  Store number in array
  *  if (Check if number is even)
  *    Add the number to the array for even numbers
  *    Increment the counter for even numbers
  *  } else {
  *    Add the number to the array for odd number
  *    Increment the counter for odd numbers
  *  }
  * }
  * for (Amount of random numbers given by the user){ //Display the randomized numbers in the array
  *   Display the value of the array on the current index
  * }
  * for (Amount of even numbers) { //Sort the array with the even numbers in ascending order
  *   for (Amount of even numbers) { //Iterate through the sub array and compare adjacent elements
  *     if (Left element is larger than right element){
  *       Swap the two values in the array to make sure the smallest value is in the leftmost position
  *     }
  *   }
  * }
  * for (Amount of odd numbers) { //Sort the array with the odd numbers in ascending order
  *   for (Amount of odd numbers) { //Iterate through the sub array and compare adjacent elements
  *     if (Left element is smaller than right element){
  *       Swap the two values in the array to make sure the largest value is in the leftmost position
  *     }
  *   }
  * }
  * if (There are any even numbers) {
  *   Display all the numbers in the array with even numbers
  * } else {
  *   Display that there are no even numbers
  * }
  * Display a '-' symbol
  * if (There are any odd numbers) {
  *   Display all the numbers in the array with odd numbers
  * } else {
  *   Display that there are no odd numbers
  * }
  * Display the amount of even and odd numbers, and total numbers
  *
    *
    *@author Moa Burke
    * 29 Oct 2023
    */

  public static void main(String[] args) {
    //Create an instance of a scanner object to read user input
    Scanner userInput = new Scanner(System.in);
    
    int[] numberArray = null; //Array for storing the randomized numbers. It does not refer anyting until initialized
    int randomNumberCount = 0; //Variable to store the number of random numbers to be generated
    int randomValue = 0; //Variable to store the randomized value
    boolean validInput = false; //Flag to control if the user input is valid

    int[] evenArray = null; //Temporary array for storing the even numbers
    int evenCount = 0; //Variable to store the number of even numbers
    
    int[] oddArray= null; //Temporary array for storing the odd numbers
    int oddCount = 0; //Variable to store the number of odd numbers
    
    //Define range of randomized number
    final int MAX_VALUE = 999; //Maximum value that can be randomized
    final int MIN_VALUE = 0; //Minimum value that can be randomized
    int range = 0; //Variable for setting the range
    range = MAX_VALUE - MIN_VALUE + 1; //Set the range of the randomized numbers

    //Continue looping until a valid input is entered
    do {
      //Prompt user for an integer input 
      System.out.print("How many numbers in the range 0 - 999 are desired? ");
    
      //Check the input
      try {
        String stringRandomNumber = userInput.nextLine(); //Process and read the entry as a string
        randomNumberCount = Integer.parseInt(stringRandomNumber); //Get integer from the string
  
        numberArray = new int[randomNumberCount]; //Initialize the array with the value given by the user
        oddArray = new int[randomNumberCount]; //Initialize the temporary array for odd numbers with the value given by the user
        evenArray = new int[randomNumberCount]; //Initialize the temporary array for even numbers with the value given by the user
        
        validInput = true; //Marks user input as valid
      } catch (OutOfMemoryError e) {
        //Print error message if the read number was too large
        System.out.println("Invalid input! Unable to allocate that much memory.");
      } catch (InputMismatchException e) {
        //Print error message if the read input was not an integer or if it was out of range
        System.out.println("Invalid input! Please enter an integer.");
      } catch (NumberFormatException e) {
        //Print error message if convert a string with an incorrect format to a numeric value
        System.out.println("Invalid input! Please enter an integer.");
      } catch (NegativeArraySizeException e) {
        //Print error message if the read number was negative
        System.out.println("Invalid input! Please enter a positive integer.");
      }
      
    } while (!validInput); //Continue looping until a valid input is entered
 
    //Generate random numbers and store them in the array
    for (int i = 0; i < randomNumberCount; i++){
      //Generate a random integer within min(0) to max(999)
      randomValue = (int) (Math.random() * range) + MIN_VALUE;
      //The randomized value gets stored in the array by using the array index (i)
      numberArray[i] = randomValue;
      //Check if the randomized value is even or odd  
      if (numberArray[i] % 2 == 0){
        //If number is even
        evenArray[evenCount] = numberArray[i]; //Add the value to the array for storing even numbers
        evenCount++; //Increment the counter for even numbers
      } else {
        //If number is odd
        oddArray[oddCount] = numberArray[i]; //Add the value to the array for storing odd number
        oddCount++; //Increment the counter for odd numbers
      }
    }   
    System.out.println(); //Empty line for aesthetics 

    //Display the array with the randomized numbers to the user
    System.out.println("Here are the random numbers:");
    for (int i = 0; i < numberArray.length; i++){
      System.out.print(numberArray[i] + " ");
    } 
    System.out.println(); //Empty line for aesthetics 

    //Sort the array with the even numbers in ascending order
    for (int i = 0; i < evenCount; i++){
      //Iterate through the sub-array and compare adjacent elements
      for (int j = 0; j < evenCount - 1; j++){
        //Swap elements if left element is larger than right element
        if (evenArray[j] > evenArray[j + 1]){
          //Temporary variable to store the value of evenArray[j]
          int tempEven = 0;
          //Swap the two values in the array to make sure the smallest value is in the leftmost position
          tempEven = evenArray[j]; //Store the value of evenArray[j] in the temporary variable
          evenArray[j] = evenArray[j + 1]; //Store the value of evenArray[j + 1] in evenArray[j]
          evenArray[j + 1] = tempEven; //Store the value of the temporary variable in evenArray[j + 1]
        }
      }
    }

    //Sort the array with odd numbers in descending order
    for(int i = 0; i < oddCount; i++){
      //Iterate through the sub-array and compare adjacent elements
      for(int j = 0; j < oddCount - 1; j++){
        //Swap elements if left element is smaller than right element
        if(oddArray[j] < oddArray[j + 1]){
          //Temporary variable to store the value of oddAray[j]
          int tempOdd = 0;
          //Swap the two values oddArray[j] and oddArray[j + 1] to make sure the largest value is in the leftmost position
          tempOdd = oddArray[j]; //Store the value of oddArray[j] in the temporary variable
          oddArray[j] = oddArray[j + 1]; //Store the value of oddArray[j + 1] in oddArray[j]
          oddArray[j + 1] = tempOdd; //Store the value of the temporary variable in oddArray[j + 1]
        }
      }
    }

    //Display the numbers in the two sorted arrays
    //First the array with the even numbers and then the array with the odd numbers with a [-] mark in between
    System.out.println("\nHere are the random numbers arranged:");

    //Check if there are any even numbers
    if(evenCount > 0){
      //Display the even numbers in the order that they are stored in the array
      for(int i = 0; i < evenCount; i++){
        System.out.print(evenArray[i] + " ");
      } 
    } else {
      System.out.print("No Even Numbers ");
    }
    
    System.out.print("- ");

    //Check if there are any odd numbers
    if(oddCount > 0){
       //Display the odd numbers in the order that they are stored in the array
      for(int i = 0; i < oddCount; i++){
        System.out.print(oddArray[i] + " ");
      }
    } else {
      System.out.print("No Odd Numbers");
    }
    System.out.println(); //Empty line for aesthetics 

    //Display the amount of even and odd numbers, and total numbers
    System.out.println("\nOf the above " + randomNumberCount + " numbers, " + evenCount + " were even and " + oddCount + " were odd."); 
  }
}