package assignment;

public class Day4_A1 {

	public static void main(String[] args) {		
//Largest of two numbers(if else,ternary operator)
		int a=20,b=30;
		if(a>b) {
			System.out.println("a is largest number");
		}
		else {
			System.out.println("b is largest number");
		}
		
		int x= a>b?a:b;
		System.out.println(x+" is the largest number");
	}

}
