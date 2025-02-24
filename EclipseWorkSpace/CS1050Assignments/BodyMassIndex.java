/**
 * Calculate the BMI using formula in US units
 * Use will enter weight in pounds and height in inches
 */

// ADD CODE to import Scanner class 
import java.util.Scanner;

public class BodyMassIndex
{
	public static void main(String[] args)
	{
		//constants
		final int BMI_US_FACTOR = 703; //factor formula in pounds
		// Variables
		double weight; // The user's weight
		double height; // The user's height
		double bmi; // The user's BMI

		// Create a Scanner object for scanning  input from keyboard 
		// ADD CODE name object variable input 
		Scanner scanObject = new Scanner(System.in);
		// Tell the user what the program will do.
		System.out.println("This program will calculate your body mass index, or BMI.");

		// Get the user's weight.
		System.out.print("Enter your weight, in pounds: ");
		// ADD CODE to input next double for weight
		weight = scanObject.nextDouble();

		// Get the user's height.
		System.out.print("Enter your height, in inches: ");
		// ADD CODE input next double for height
		height = scanObject.nextDouble();
		
		// Calculate the user's body mass index.
		bmi = weight * BMI_US_FACTOR / (height * height);
		
		// Print out the users weight and height
		System.out.printf("\nWeight: %.1f Height: %.1f\n",weight, height);
		
		// Display the user's BMI.
		System.out.printf("Your body mass index (BMI) is %.1f\n", bmi);
		
		// Figure out what category the user falls under in BMI
		if (bmi <= 18.4)
		{
			System.out.print("Your category: Underweight");
		} 
		else if (bmi > 18.5 && bmi < 24.9)
		{
			System.out.print("Your category: Normal");
		}
		else if (bmi > 25.0 && bmi < 39.9)
		{
			System.out.print("Your category: Overweight");
		}
		else
		{
			System.out.print("Your category: Obese");
		}
		
	} // main method
} // public class
