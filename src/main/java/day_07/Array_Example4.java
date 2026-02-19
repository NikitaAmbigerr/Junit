package day_07;

import java.util.Arrays;

public class Array_Example4 {

	public static void main(String[] args) {
		// Printing an Array elements in reverse order
       int x[]= {1,2,4,3,5,6,7,8};
      
       System.out.println("Before Reversing");
       System.out.println(Arrays.toString(x));
       
       for(int i=x.length-1;i>=0;i--) {
    	   System.out.print(x[i]);
    	   System.out.print(" ");
    	   
       }
	}
}
