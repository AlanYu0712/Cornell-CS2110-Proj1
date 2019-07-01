package project1;

import java.util.Arrays;

public class Exercises {
	
	
	/**
	 * Return true if s is the same backwards and forwards.
	 * @param s inputed String
	 * @return whether the string is the same backwards and forwards.
	 */
	public static boolean isPalindrome(String s) {
		
		//setting precondition
		s=s.toLowerCase();

		for(int i = 0; i < s.length(); i++) {
			
			if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
				
				return false;
			}
		}
		
		return true;
	}
	
	
	
	/**
	 * Return a copy of s with all whitespace and punctuation removed.
	 * @param s inputed string
	 * @return a string with just characters and without whitespace and punctuations
	 */
	public static String normalize(String s) {
		
		// remove all whitespace
		s = s.replaceAll("\\s", "");
		//remove all punctuation
		s = s.replaceAll("\\W", "");
		
		return s;
	}
	
	
	
	/**
	 * find the integer median of a integer array
	 * @param values the inputed array
	 * @return the integer median of this inputed array
	 */
	public static int median(int[ ] values) {
		
		//sort the array from small value to big
		Arrays.sort(values);
		
		//setting variable to pass the median
		int result = 0;
		
		//in cases where the length of the array is odd
		if(values.length%2 == 1) {
			
			result = values[(values.length-1) / 2];			
		}
		// in cases where the length of the array is even
		else if(values.length%2 == 0) {
			
			//return only integer
			result = (values[values.length/2]);
		}	
		
		return result;
	}
	
	
	
	/**
	 * counting the zeros in an array
	 * @param values the inputed integer array
	 * @return the number of zeros it has in that array
	 */
	public static int numZeros(int[ ] values) {
		
		int x = 0;
		
		for (int i = 0; i < values.length; i++) {
			
			if (values[i] == 0) {
				
				x = x+1;
			}
		}
		
		return x;
	}
	
	
	
	/**
	 * Find the mean in an integer array
	 * @param values the inputed integer array
	 * @return the the value of the mean of the inputed integer array
	 */
	public static double mean(int[ ] values) {
		
		double x = 0;
		
		//adding all values in the array
		for (int i = 0; i < values.length; i++) {
			
			x = x + values[i];
		}
		
		//Divide sum by array length
		x = x/values.length;
		
		return x;
	}
	
	
	
	/**
	 * Find the whether the diagonal value of a 2D array is the same
	 * @param values the inputed integer 2D array
	 * @return true if all of the values on the diagonal are the same. 
	 * Requires values to be a square matrix (that is, for all i, 
	 * values[i].length== values.length).
	 */
	public static boolean hasConstDiagonal(int[ ][ ] values) {
		
		// asserting the 2D array is has the same number of columns and rows
		assert values.length == values[0].length;
		
		//initialize boolean to return
		boolean pass = false;
		
		// initializing variable to check diagonal from left to right 
		int Left2Right = values[0][0];
		// initializing variable to check diagonal from right to left
		int Right2Left = values[values.length-1][0];
		
		//checking diagonal from left to right and right to left simultaneously
		for (int i = 0; i < values[0].length; i++) {
			
			if(Left2Right == values[i][i] && Right2Left == values[values.length - (1+i)][i]) {
				
				pass = true;
			} else {
				
				pass = false;
				break;
			}		
		}
		
		
		return pass;
	}
	

	
	

}
