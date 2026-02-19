package nonPrimitiveDatatypes;

import java.util.Scanner;

public class Foreach_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[5];
		Scanner scan=new Scanner(System.in);
	
		for(int i=0;i<5;i++) {
			System.out.println("enter the number");
			arr[i]=scan.nextInt();
		}	
		System.out.println("The elements of the array are:");
		for(int num:arr) {
			System.out.println(num);
		}
	}

}
