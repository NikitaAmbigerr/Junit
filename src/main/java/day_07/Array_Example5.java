package day_07;

import java.util.Arrays;

public class Array_Example5 {

	public static void main(String[] args) {
//	    Sorting Alphabets of an Array
	    String b[]={"a","x","z","b","y","c","w","d","p","A","B","X"};
	       System.out.println("Before sorting");
	       System.out.println(Arrays.toString(b));
	       System.out.println("After Sorting");
	       Arrays.sort(b);
	       System.out.println(Arrays.toString(b));
	}

}
