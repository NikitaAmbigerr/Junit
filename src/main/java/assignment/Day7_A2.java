package assignment;

import java.util.Arrays;

public class Day7_A2 {
//	Array need not to be sorted
//	Array should not have any duplicates
//	Values should be in range
	public static void main(String[] args) {
		// Find Missing number in Array
		int a[]= {1,4,5,3};

		
//  sum=1+3+4+5=13  
    int sum1 = 0;
	for(int i=0;i<a.length;i++) {
		sum1+=a[i];
	}
	System.out.println(sum1);	
	
// sum2=1+2+3+4+5=15
	int sum2=0;
	for(int i=1;i<=5;i++) {
		sum2+=i;	
	}
		System.out.println(sum2);
		
		int MN=sum2-sum1;
		System.out.println("The missing number is : " +MN);
	}

}
