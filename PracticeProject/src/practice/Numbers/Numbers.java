package practice.Numbers;

// Contains the functions for all of the Numbers practice functions.
public class Numbers {

	/**
	 *  Given an integer N, return PI to the Nth digit
	 * @param  N    The number of digits (after the decimal place) you want
	 * @return      Pi, with N digits after the decimal place (double)
	 */
	public static double getNthDigitOfPi(int N) {
		return Math.floor(Math.PI * Math.pow(10, N)) / Math.pow(10, N);
	}
	
	/**
	 *  Given an integer N, return e to the Nth digit
	 * @param  N    The number of digits (after the decimal place) you want
	 * @return      E, with N digits after the decimal place (double)
	 */
	public static double getNthDigitOfE(int N) {
		return Math.floor(Math.E * Math.pow(10, N)) / Math.pow(10, N);
	}
	
	// Given an integer N, generate the Fibonacci sequence up to the Nth number 
	/**
	 * Given an integer N, generate the Fibonacci sequence up to the Nth number 
	 * @param  N    The number of elements in the fibonacci sequence to return
	 * @return      An array with the first N elements in the fibonnaci sequence  
	 */
	public static int[] getFibonacciSequence(int N) {
		int result[] =  new int[N];
		for (int i = 0; i < N; i++) {
			if(i < 2) {
				result[i] = 1;
			} else {
				result[i] = result[i-1] + result[i-2];
			}
		}
		return result;
	}
	
	// Given a number, return all prime factors
	
	// Given a number, first determine if it is a prime, and then if it is find the next prime number
	
	// Given the cost of tile and the dimensions of the floor, determine the cost to tile the floor
	
	/* Calculate the monthly payments of a fixed term mortgage over given Nth terms at a given interest rate. 
	 * Also figure out how long it will take the user to pay back the loan. For added complexity, add an option 
	 * for users to select the compounding interval (Monthly, Weekly, Daily, Continually). 
	 */
	
	/* The user enters a cost and then the amount of money given. The program will figure out the change and the 
	 * number of quarters, dimes, nickels, pennies needed for the change.
	 */
}
