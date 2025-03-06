/*
 * Uriel Martinez
 * CS1050
 * Section: T / R
 * Feb 23 @ 2:32pm
 * Assignment 2
 * This program will take the first and last names of 2 students, print the two depending on 
 * which of their last names comes first, and then print their initials
 */

// Import scanner
import java.util.Scanner;

public class MartinezGE02StringsChars 
{

	public static void main(String[] args) 
	{
		// Declare 4 variables for the students first and last names
		String student1FirstName;
		String student1LastName;
		String student2FirstName;
		String student2LastName;
		
		// Create Scanner for user input
		Scanner scanObject = new Scanner(System.in);
		
		// Prompt user to enter the first and last names of 2 students
		System.out.print("Enter Student 1 first name: ");
		student1FirstName = scanObject.next();
		
		System.out.print("Enter Student 1 last name: ");
		student1LastName = scanObject.next();
		
		System.out.print("Enter Student 2 first name: ");
		student2FirstName = scanObject.next();
		
		System.out.print("Enter Student 2 last name: ");
		student2LastName = scanObject.next();
		System.out.print("\n");
		
		// Compares the last names of 2 students to determine which to print first
		int studentPrintedFirst = student1LastName.compareToIgnoreCase(student2LastName);
		
		if (studentPrintedFirst < 0)
		{
			System.out.println("Students in alphabetical order by last name:");
			System.out.println(student1FirstName + " " + student1LastName);
			System.out.println(student2FirstName + " " + student2LastName);
		}
		else if (studentPrintedFirst > 0)
		{
			System.out.println("Students in alphabetical order by last name:");
			System.out.println(student2FirstName + " " + student2LastName);
			System.out.println(student1FirstName + " " + student1LastName);
		}
		else
		{
			System.out.println("The Students have the same last name: ");
			System.out.println(student1FirstName + " " + student1LastName);
			System.out.println(student2FirstName + " " + student2LastName);
		}
		System.out.print("\n");
		
		// Declare and initialize 4 variables for student initials
		char student1FirstNameInitial = student1FirstName.charAt(0);
		char student1LastNameInitial = student1LastName.charAt(0);
		char student2FirstNameIntial = student2FirstName.charAt(0);
		char student2LastNameInitial = student2LastName.charAt(0);
				
		// Take the first initials of the 2 students and concatenate them
		String student1Initials = student1FirstNameInitial + "." + student1LastNameInitial + "."; // I took a guess and I'm surprised to see that it works
		String student2Initials = student2FirstNameIntial + "." + student2LastNameInitial + "."; // I thought this was a dumb "what if" but apparently its valid code
		// guess string logic applies to other places too
		
		// Print the initials of the 2 students
		System.out.println("Initials:");
		System.out.println(student1Initials);
		System.out.println(student2Initials);
		
	} // main method

} // public class
