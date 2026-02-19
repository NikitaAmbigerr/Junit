package day_07;

import java.util.Arrays;

public class Array_Example3 {

	public static void main(String[] args) {
//      Sorting/arranging the integer elements of array
		int a[]= {800,200,600,500,300,400,100,700,100};
		System.out.println("Array before sorting");
//		Approach 1
		System.out.print("Approach 1 :");
		for(int val:a) {
		System.out.print(val);	
		System.out.print(" ");
	}
		System.out.println();
		
//		Approach 2
		System.out.println("Approach 2 :"+Arrays.toString(a));
		System.out.println("Array after sorting");
		Arrays.sort(a);
	    System.out.println("Approach 2 :"+Arrays.toString(a));
	    

		}
	}

