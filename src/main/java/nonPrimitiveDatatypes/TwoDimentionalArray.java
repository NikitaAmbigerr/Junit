package nonPrimitiveDatatypes;

import java.util.Scanner;

public class TwoDimentionalArray {

	public static void main(String[] args) {
//		Approach 1
		System.out.println("Array Arr");
        int arr[][]=new int[2][2];
        arr[0][0]=10;
        arr[0][1]=20;
        arr[1][0]=30;
        arr[1][1]=40;
        System.out.println("length of Rows: "+arr.length);
        System.out.println("length of columns: "+arr[0].length);       
//      For loop
        for(int i=0;i<arr.length;i++) {
        	for(int j=0;j<arr[0].length;j++) {
        		System.out.print(arr[i][j]+" ");
        	}
        	System.out.println();
        }        
//        For each loop
        System.out.println("For each loop");
       for(int array[]:arr) {
        	for(int x:array) 
        	{
        		System.out.print(x+" ");
        	}
        	System.out.println();
       }
       
       
//        Approach 2
       System.out.println("Array A");
        int a[][]= {{2,3,},{2,4},{2,6}};  
        System.out.println("length of Rows: "+a.length);
        System.out.println("length of columns: "+a[0].length);
//        For loop
        for(int i=0;i<a.length;i++) {
        	for(int j=0;j<a[0].length;j++) {
        		System.out.print(a[i][j]+" ");
        	}
        	System.out.println();
        }      
//      For Each loop
        System.out.println("For each loop");
        for(int y[]:a) {
        	for(int z:y) {
        		System.out.print(z+" ");
        	}
        	System.out.println();
        }
       
//        Approach 3    
        System.out.println("Array num");
        int num[][]=new int[2][2];
        System.out.println("length of Rows: "+num.length);
        System.out.println("length of columns: "+num[0].length);
        Scanner scan= new Scanner(System.in);
//        For loop
        for(int i=0;i<2;i++) {//i<arr.length
    	  for(int j=0;j<2;j++) {//j<arr.length
    		 System.out.println("Enter number");
    		 num[i][j]=scan.nextInt();
    	  }   	  
      }      
      System.out.println("The numbers are"); 
      
      for(int i=0;i<2;i++) {
    	  for(int j=0;j<2;j++) {  		   	
    		  System.out.print(num[i][j]+" ");	  		  
	      }  
    	  System.out.println( );
      }
//      For each loop
      System.out.println("For each loop");
      for(int Y[]:num) {
      	for(int Z:Y) {
      		System.out.print(Z+" ");
      	}
      	System.out.println();
      }
	}
}
