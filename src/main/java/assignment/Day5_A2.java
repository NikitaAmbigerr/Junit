package assignment;

import java.util.Scanner;

public class Day5_A2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// palindrome numbers 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int orgnum=num;
		int rev=0;
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println(rev);
		
		if(orgnum==rev) {
			System.out.println("its a palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
	}

}
