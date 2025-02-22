/**
 * This program takes user input to see if they can guess the 
 * random number generated
 */

import java.util.Scanner; 

public class GuessNumber 
{

	public static void main(String[] args) 
	{
		int MAX = 12;
		int MIN = 1;
	    int number = (int)(Math.random() * (MAX-MIN + 1) + MIN);

	    Scanner input = new Scanner(System.in);
	    System.out.println("Guess a magic number between 1 and 12");

	    int guess = -1;
	    while (guess != number) 
	    {
	      
	      System.out.print("\nEnter your guess: ");
	      guess = input.nextInt();

	      if (guess == number)
	        System.out.println("Yes, the number is " + number);
	      else if (guess > number)
	        System.out.println("Your guess is too high");
	      else
	        System.out.println("Your guess is too low");
	    } 
		
	}

}
