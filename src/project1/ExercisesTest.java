package project1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ExercisesTest {
	

	@Test
	void test_Palindrome() {
		
		
		Exercises e = new Exercises();
		
		assertEquals(true, e.isPalindrome("Radar"));

		
	}
	
	
	@Test
	void test_Normalize() {
		Exercises e = new Exercises();
		
		assertEquals("Java", e.normalize("J a:;v. a,"));
	}
	
	
	@Test
	void test_Median() {
		Exercises e = new Exercises();
		
		int[] checker1 = {3,5,1,2,4};
		
		assertEquals(3, e.median(checker1));
		
		int[] checker2 = {8,4,2,6};
		
		assertEquals(6, e.median(checker2));
	}
	
	
	@Test
	void test_num0s() {
		Exercises e = new Exercises();
		
		int[] checker = {2,0,1,9,6,3,0};
		
		assertEquals(2, e.numZeros(checker));
		
	}
	
	
	@Test
	void test_mean() {
		Exercises e = new Exercises();
		
		int[] checker = {1,3,5,7,9,2,4,6,8,10};		
	}
	
	@Test
	void test_Diag() {
		
		Exercises e = new Exercises();
		int[][] checker = { {1,2,1},{3,1,2},{1,3,1}};
		
		assertEquals(true, e.hasConstDiagonal(checker));
		
	}

}
