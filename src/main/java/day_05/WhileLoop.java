package day_05;

public class WhileLoop {

	public static void main(String[] args) {
		//While loop will run until the condition meet
//		Example1
		System.out.println("print numbers from 1 to 10");
		int i =1;//initialize the vale of i
        while(i<=10) {
        	System.out.println(i);
        	i++;
        }
//		Example2     
        System.out.println("print numbers from 10 to 1");
        int j=10;
        while(j>=1) {
        	System.out.println(j);
        	j--;
        }
//		Example3   
        System.out.println("print even numbers from 0 to 10");
        int a=0;
        while(a<=10) {
        	System.out.println(a);
        	a+=2;
        }
//		Example4
        System.out.println("print odd numbers from 1 to 10");
        int b=1;
        while(b<=10) { 
        	System.out.println(b);
        	b+=2;
       	}


	}
}
