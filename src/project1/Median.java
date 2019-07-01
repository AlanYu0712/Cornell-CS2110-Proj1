package project1;

import java.util.Arrays;

public class Median {
	
	
	static int median(int[] values) {
		Arrays.sort(values);
		System.out.println(Arrays.toString(values));
		int result = 0;
		
		//System.out.println(values.length%2);
		
		//System.out.println(values[(values.length-1)/2]);
		
		//System.out.println(values[values.length/2]);
		//System.out.println(values[(values.length/2)-1]);
		
		if(values.length%2 == 1) {
			
			result = values[(values.length-1)/2];
			
		} else if(values.length%2 == 0) {
			result = (values[values.length/2] + values[(values.length/2)-1])/2;
		}
		
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1,2,3,4,5,5,5,6,7,8};
		
		Median m = new Median();
		
		m.median(a);
		
		System.out.println(m.median(a));

	}

}
