
import java.util.Scanner;

public class SumNumberLoop
{

	public static void main(String[] args) 
	{
		// Initializing variables for for loop
		int userMaxNumber = 0;
		
		// Get the user max using a scanner object
		System.out.print("Give the max you would like to add up to: ");
		Scanner newScanner = new Scanner(System.in);
		userMaxNumber = newScanner.nextInt();
		
		// call a programmer-defined method and store it in a variable
		int totalSum = sumToMax(userMaxNumber);
		System.out.print("The total sum to the max you gave is: " + totalSum);
	} // main method
	
	public static int sumToMax(int userMaxNumber)
	{	
		// initialize the sum variable
		int sum = 0;
		
		// Create a for loop with sum initialized in it
		for (int i = 0; i <= userMaxNumber; i++)
		{
			sum += i;
		}
		
		// return this value
		return sum;
	}// sumToMax

} // public class
