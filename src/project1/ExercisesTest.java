package project1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ExercisesTest {
	

	@Test
	/**
	 * Testing the first method in Exercises: isPalindrome(String s)
	 */
	void test_Palindrome() {		
		
		// create instance of object Exercises
		Exercises e = new Exercises();
		
		//checking does outcome of method satisfies expectation
		assertEquals(true, e.isPalindrome("Radar"));		
	}

	
	
	@Test
	/**
	 * Testing the second method in Exercises: normalize(String s)
	 */
	void test_Normalize() {
		
		//create instance of object Exercises
		Exercises e = new Exercises();
		
		//checking does outcome of method satisfies expectation
		assertEquals("Java", e.normalize("J a:;v. a,"));
	}
	
	
	
	@Test
	/**
	 * Testing the third method in Exercises: median(int[ ] values)
	 */
	void test_Median() {
		
		//create instance of object Exercises
		Exercises e = new Exercises();
		
		//create an array with a length that is odd
		int[] checker1 = {3,5,1,2,4};
		// checking does outcome of method satisfies expectation
		assertEquals(3, e.median(checker1));
		
		//create an array with a length that is even
		int[] checker2 = {8,4,2,6};
		//checking does outcome of method satisfies expectation
		assertEquals(6, e.median(checker2));
	}
	
	
	
	@Test
	/**
	 * Testing the fourth method in Exercises: numZeros(int[ ] values)
	 */
	void test_num0s() {
		
		//create instance of object Exercises
		Exercises e = new Exercises();
		
		// create an array for testing
		int[] checker = {2,0,1,9,6,3,0};
		
		//checking does outcome of method satisfies expectation
		assertEquals(2, e.numZeros(checker));		
	}
	
	
	
	@Test
	/**
	 * Testing the fifth method in Exercises: mean(int[ ] values)
	 */
	void test_mean() {
		
		//create instance of object Exercises
		Exercises e = new Exercises();
		
		//create an array for testing
		int[] checker = {1,3,5,7,9,2,4,6,8,10};
		
		//checking does outcome of method satisfies expectation
		assertEquals(5.5, e.mean(checker));
	}
	
	
	
	@Test
	/**
	 * testing the sixth and last method in Exercises: hasConstDiagonal(int[ ][ ] values)
	 */
	void test_Diag() {
		
		//create instance of object Exercises
		Exercises e = new Exercises();
		
		//create a 2D array for testing
		int[][] checker = { {1,2,1},{3,1,2},{1,3,1}};
		
		//checking does outcome of method satisfies expectation
		assertEquals(true, e.hasConstDiagonal(checker));	
	}
	
	
	
}
