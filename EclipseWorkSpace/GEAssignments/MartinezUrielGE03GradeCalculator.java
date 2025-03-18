
/*
 * Uriel Martinez
 * CS1050
 * Section: T / R
 * March 17 @ 11:59
 * Assignment 3
 * This program will take some grades from the user, calculate a final grade, find and display the correct letter grade, 
 * then ask the user if they wish to put in the grades for another student
 */

import java.util.Scanner;

public class MartinezUrielGE03GradeCalculator 
{

	public static void main(String[] args) 
	{
		
		// Task 1:  Print Grade Calculation Summary 
		System.out.println("**********************************\n"
				+ "CS1050 Final Grade Calculator\n"
				+ "**********************************\n"
				+ "------------------------------\n"
				+ "Category: Percent\n"
				+ "------------------------------\n"
				+ "Class Participation: 10%\n"
				+ "Guided Exploration: 20%\n"
				+ "Module Quizzes: 25%\n"
				+ "Project Iterations: 25%\n"
				+ "Final Exam: 20%\n"
				+ "-------------------------------\n"
				+ "Letter Grade Range\n"
				+ "-------------------------------\n"
				+ "A: 90 to 100\n"
				+ "B: 80 to < 90\n"
				+ "C: 70 to < 80\n"
				+ "D: 60 to < 70\n"
				+ "F: < 60\n");
		
		
		final int MIN_GRADE = 0;
		final int MAX_GRADE = 105;
		char userAnswer = 'n';
		
		Scanner input = new Scanner(System.in);
		
		// Task 5: Repeat Calculating Grade
		do
		{
			// Task 2: Get Valid grade
			System.out.print("Enter class participation grade: ");
			double classParticipation = getValidGrade(MIN_GRADE,MAX_GRADE);
			System.out.print("Enter the Guided Exploration grade: ");
			double guidedExploration = getValidGrade(MIN_GRADE,MAX_GRADE);
			System.out.print("Enter the Module Quizzes grade: ");
			double moduleQuizzes = getValidGrade(MIN_GRADE,MAX_GRADE);
			System.out.print("Enter the Project Iterations grade: ");
			double projectIterations = getValidGrade(MIN_GRADE,MAX_GRADE);
			System.out.print("Enter the Final Exam grade: ");
			double finalExam = getValidGrade(MIN_GRADE,MAX_GRADE);
			
			// Task 3: Calculate final percentage
			final double CLASS_PARTICIPATION = .1;
			final double GUIDED_EXPLORATIONS = .2;
			final double QUIZZES = .25;
			final double PROJECT_ITERATIONS = .25;
			final double FINAL_EXAM = .2;
			
			double finalGrade = (CLASS_PARTICIPATION * classParticipation) + (GUIDED_EXPLORATIONS * guidedExploration) + (QUIZZES * moduleQuizzes) + (PROJECT_ITERATIONS * projectIterations) + (FINAL_EXAM * finalExam);
			System.out.println("------------------------------------------------");
			System.out.printf("Final Percentage: %f\n", finalGrade);
			
			// Task 4: Determine Letter Grade 
			char letterGrade = getGradeLetter(finalGrade);
			System.out.printf("Final Percentage: %c\n", letterGrade);
			System.out.println("------------------------------------------------");
			
			System.out.println("Do you want to calculate another student's grade?");
			System.out.println("Enter y for yes or n for no: ");
			
			userAnswer = input.next().charAt(0);
			
		}
		while (userAnswer != 'n');
		System.out.println("Exiting grade calculator");
		
	}// Main Method
	
	public static double getValidGrade(int MIN_GRADE, int MAX_GRADE)
	{
		double grade = 0;
		int exit = 0;
		Scanner getInput = new Scanner(System.in);
		
		do
		{
			grade = getInput.nextDouble();
			
			if(grade > MAX_GRADE || grade < MIN_GRADE)
			{
				System.out.print("Please enter a valid grade between 0 and 105: ");
				exit = 1;
			}
			else
			{
				exit = 0;
			}
			
		}
		while(exit != 0);
		
		
		
		
		return grade;
		
	}// getValidGrade
	
	public static char getGradeLetter(double finalGrade)
	{
		char letter = 'n';
		
		if (finalGrade > 90)
		{
			letter = 'A';
		}
		else if (finalGrade < 90 && finalGrade > 80)
		{
			letter = 'B';
		}
		else if (finalGrade < 80 && finalGrade > 70)
		{
			letter = 'C';
		}
		else if ( finalGrade < 70 && finalGrade > 60)
		{
			letter = 'D';
		}
		else
		{
			letter = 'F';
		}
		
		return letter;
		
	}// getGradeLetter

}// Public Class
