package nonPrimitiveDatatypes;

import java.util.Scanner;

public class Tagged_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int arr[][]=new int[3][];
          Scanner scan=new Scanner(System.in);
          
          arr[0]=new int[2];
          arr[1]=new int[3];
          arr[2]=new int[4];
          for(int i=0;i<arr.length;i++) {
        	  for(int j=0;j<arr[i].length;j++) {
        		  System.out.println("Enter the number "+i+" the row "+j+" the column");
        		  arr[i][j]=scan.nextInt();
        	  }
          }
          
          for(int i=0;i<arr.length;i++) {
        	  for(int j=0;j<arr[i].length;j++) {
        		  System.out.print(arr[i][j]+",");       		 
      	  }
        	  System.out.println();
          }
	}
}
