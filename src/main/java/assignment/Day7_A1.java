package assignment;

import java.util.Arrays;

public class Day7_A1 {

	public static void main(String[] args) {
		// Sorting Array Elements
		int a[]= {50,20,40,10,100};
		System.out.println("Array Elements Before Sorting");
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("Array elements after Sorting");
		System.out.println(Arrays.toString(a));
	}

}
