package sugarhigh;

import java.util.Scanner;

/*Sugar High solution for finding the largest subarray with sum of elements 
 * that's not higher than limited treshold */
public class SugarHigh {

	public static void main(String[] args) {

		//Entering values for candy array lenght, candies sugar value and sugar trashold
		System.out.println("Enter number of candies (must be between 0 and 10^5)");
		Scanner input = new Scanner(System.in);
		int candiesLenght = input.nextInt();
		if (candiesLenght > 10000 || candiesLenght < 0) {
			throw new IllegalArgumentException("Number must between 0 and 10^5!");
		}

		System.out.print("Enter candy value (must be between 0 and 100)");
		int[] candy = new int[candiesLenght];
		for (int i = 0; i < candy.length; i++) {
			candy[i] = input.nextInt();
			if (candy[i] > 100 || candy[i] < 0) {
				throw new IllegalArgumentException("Number must between 0 and 100!");
			}
		}
	
		System.out.println("Enter trashold value (must be between 1 and 10^9)");
		int treshold = input.nextInt();
		if (treshold > 1000000000 || treshold <= 0) {
			throw new IllegalArgumentException("Number must between 0 and 10^9!");
		}

		largestArray(candy, candiesLenght, treshold);

		input.close();

	}

	//
	public static void largestArray(int candyArray[], int lenght, int limit) {
		int sum = 0; // sum of candies sugar value in subarray
		int high = 0; // integer for catching highest corresponding index of subarray
		int count = 0; // counter for passing the same subarray
		int maxcount = 0; // counter to keep track of max length

		for (int i = 0; i < lenght; i++) {

			// If sum is lower then treshold
			if ((sum + candyArray[i]) < limit) {
				sum += candyArray[i];
				count++;
				high = i + 1;
			}

			// If sum is higher or equal, remove first element in subarray
			else if (sum != 0) {
				sum = sum - candyArray[i - count] + candyArray[i];

			}
			// Comparing max lenght of subarray
			maxcount = Math.max(count, maxcount);
		}
		
		
		// Printing method results
		System.out.print("sugarHigh(candies, threshold) = [");
		for (int i = high - maxcount; i < high; i++) {
			System.out.print(" " + i);
		}
		System.out.print(" ]");

	}

}
