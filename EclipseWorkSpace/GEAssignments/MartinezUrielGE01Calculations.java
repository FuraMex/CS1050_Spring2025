/*
 * Uriel Martinez
 * CS1050
 * Section: T / R
 * Feb 9 @ 11:59pm
 * Assignment 1
 * This program will print a bit about myself and then calculate a grade
 */
public class MartinezUrielGE01Calculations 
{

	public static void main(String[] args) 
	{
		// A little bit about myself
		System.out.println("I'm Uriel Martinez and I'm studying to earn a degree in Computer Science.");
		System.out.println("This isn't my first year in college as I've been attending front range so I could complete my general courses.");
		System.out.println("However, this is my first year at MSU where I'll finally be doing my actual CS classes.");
		System.out.println("I don't live around MSU, as a result, I often have to commute by bus for about 30min the days I have classes.");
		System.out.println("Commuting isn't all that bad however, it's actually quite nice! You don't have to worry about dealing with traffic and you can just sit on the bus and work on other things");
	
		System.out.println("\nSome personal things about myself is first of all I love to run.");
		System.out.println("Previously I had so many injuries that I couldn't keep up running for very long, but now I've found ways to keep myself injury-free.");
		System.out.println("Another one of my hobbies is that I love to read. Currently I'm reading \"Born to Run\" by Christopher McDougall");
		System.out.println("When I'm not outside running or reading a book, I also like to spend my time playing games. My current favorite is \"Laika: Aged Through Blood\"");
		System.out.println("So I'm simply a geek studing Computer Science");
		
		// declaring and initializing the variables for percentage weights
		final double CLASS_PARTICIPATION = .1;
		final double GUIDED_EXPLORATIONS = .2;
		final double QUIZZES = .25;
		final double PROJECT_ITERATIONS = .25;
		final double FINAL_EXAM = .2;
		
		// declared the student grade variables and added test values
		double classParticiGrade = 89;
		double geGrade = 83;
		double quizGrade = 29;
		double projectGrade = 59;
		double finalExamGrade = 30;
				
		// declaring then initializing it with the final calculated grade
		double finalGrade = (CLASS_PARTICIPATION * classParticiGrade) + (GUIDED_EXPLORATIONS * geGrade) + (QUIZZES * quizGrade) + (PROJECT_ITERATIONS * projectGrade) + (FINAL_EXAM * finalExamGrade);
		System.out.printf("\n%s, your final grade is %.2f", "Uriel", finalGrade);
	} // end of main method

} // end of public class
