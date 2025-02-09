/**
 * This program takes user input to see if they can guess the 
 * random number generated
 */

import java.util.Scanner; 

public class GuessNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Main method
	    int number = (int)(Math.random() * 101);
	    
//	    Creates the object scanner and then has the user input a value
	    Scanner input = new Scanner(System.in);
	    System.out.println("Guess a magic number between 0 and 100");
	    
//	    sets the users starting guess before starting the loop
	    int guess = -1;
	    while (guess != number) {
	      
	      System.out.print("\nEnter your guess: ");
	      guess = input.nextInt(); // Takes user input and stores it in guess

//	      Checks if the value that the user has put in is equal to the programs
	      if (guess == number)
	        System.out.println("Yes, the number is " + number);
//	      Checks if the users number is bigger
	      else if (guess > number)
	        System.out.println("Your guess is too high");
//	      Catch all statement
	      else
	        System.out.println("Your guess is too low");
	    } 
		
	}

}
