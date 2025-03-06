
public class M03L11ForLoop 
{

	public static void main(String[] args) 
	{
		// Create counter and total variables
		int total = 0;
		int maxCounter = 5;
		
		// Create for loop which starts at 0 and stops at 5
		for (int counter = 0; counter <= maxCounter; counter++)
		{
			System.out.println("This is iteration " + counter + " of the loop");
			total += counter;
			System.out.println("The current total is " + total);
			
		}

	}

}
