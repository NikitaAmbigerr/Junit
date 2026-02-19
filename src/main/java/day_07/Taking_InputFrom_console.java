package day_07;

import java.util.Scanner;

public class Taking_InputFrom_console {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int num;
	Scanner scan =new Scanner(System.in);
	System.out.println("Enter the number");
	num=scan.nextInt();
	
	System.out.println("Enter the Decimal number");
	double deci=scan.nextDouble();
	
	System.out.println("Enter the City");
	String City=scan.next();
	
	System.out.println("The number is "+num);
	System.out.println("The given value is "+deci);
	System.out.println("Your City is "+City);
	scan.close();
	  }
	}
