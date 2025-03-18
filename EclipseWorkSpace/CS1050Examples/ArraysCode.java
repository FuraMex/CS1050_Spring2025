 /*
  *  add comments
  */

import java.util.Scanner;

public class ArraysCode {

	public static void main(String[] args)
	{
//		// Examples of processing arrays
//		final int TOTAL_NUMBERS = 5;
//		// explain
//		int[] numbers = new int[TOTAL_NUMBERS];
//		
//		//explain
//		int numbersLength = numbers.length;
//
//		// 1. Explain
//		System.out.println("Type in the values you want to add to the array");
//		Scanner input = new Scanner(System.in);
//		System.out.println("Enter " + numbersLength + " values: ");
//		for (int index = 0; index < numbersLength; index++) {
//			System.out.printf("Enter value #%d: ", index+1);
//			numbers[index] = input.nextInt();
//		}
//
//		// 2. Explain
//		System.out.println("Update this message with what is going on");
//		for (int index = 0; index < numbersLength; index++) {
//			System.out.println("numbers[" + index + "] = " + numbers[index]);
//		}
//
//		// 3. Explain
//		System.out.println("Update this message with what is going on");
//		int badNameVar = 0;
//		for (int index = 0; index < numbers.length; index++) {
//			badNameVar = badNameVar + numbers[index];
//		}
//		System.out.println("Update badNameVar = " + badNameVar);
//
//		// 4. Explain
//		System.out.println("Update this message with what is going on");
//		int badNameVar2 = numbers[0];
//		for (int index = 1; index < numbers.length; index++) {
//			if (numbers[index] > badNameVar2) {
//				badNameVar2 = numbers[index];
//			}
//		}
//		System.out.println("Update badNameVar2 = " + badNameVar2);
		
		// 5. Declare new array called randomNumbers 
		final int TOTAL_NUMBERS = 3;
		int[] randomNumbers = new int[TOTAL_NUMBERS];
		
		// 6. Write Code to fill the array with random numbers from 1 to 10 
		int numbersLength = randomNumbers.length - 1;
		for (int index = 0; index <= numbersLength;index++)
		{
			randomNumbers[index] = (int)(Math.random() * 10) + 1;
			System.out.printf("This is the index: %d, the value is: %d\n", index,randomNumbers[index]);
		}
		
		// 7. Write Code to find the index containing the smallest number in the randomNumbers array 
		int smallestNum = randomNumbers[0];
		int numberIndex = 0;
		for (int index = 0; index <= numbersLength;index++)
		{
			if (randomNumbers[index] < smallestNum)
			{
				smallestNum = randomNumbers[index];
				numberIndex = index;
			}
		}
		
		// 8. write code to display the index and value of the smallest number
		System.out.printf("The index of the smallest number is: %d, the value is: %d",numberIndex, smallestNum);
		
		// 9. write a method to return the index containing the smallest number in the randomNumber array
		
		
//		input.close();
	} // main
	

	
}// end class
