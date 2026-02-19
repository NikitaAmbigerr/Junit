package nonPrimitiveDatatypes;

import java.util.Scanner;
/* 1.Declaring array
 * 2.Adding vales into an array
 * 3.Get the length of array
 * 4.Read the single vale of array
 * 5.All the value of array
 * */
class SingleDimentionalArray{
	
	public static void main(String[]args) {
//		Approach 1 
		int num[]= new int[5];
		num[0]=1;
		num[1]=2;
		num[2]=3;
		num[3]=4;
		num[4]=5;
		System.out.println("Length of array num :"+num.length);
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]+" ");
		}
		System.out.println();
//		for each loop
		for (int x:num) {
			System.out.print(x+" ");
		}
		
//		Approach 2
		int a[]= {10,20,30,40,50,60};
		System.out.println(a.length);
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
//		for each loop
		for (int x:a) {
			System.out.println(x);
		}
		
//		Approach3
		int arr[]=new int[3];
		Scanner scan=new Scanner(System.in);
	
		for(int k=0;k<3;k++) {
			System.out.println("enter the number");
			arr[k]=scan.nextInt();
		}	
		System.out.println("The elements of the array are:");
	
		for(int k=0;k<3;k++) {
			System.out.print(arr[k]+" ");
		}
//		for each loop
		for (int x:arr) {
			System.out.println(x);
		}

		}
	}
