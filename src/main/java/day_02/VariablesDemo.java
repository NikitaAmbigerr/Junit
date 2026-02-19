package day_02;

public class VariablesDemo {

	public static void main(String[] args) {
//	variable declaration
		int a;
//	assigning value to declared variable
		a=5;
//	variable declaration+assinging value
		int b=100;
//	Printing variable a
		System.out.println("initial value of a :"+a);
//	updating value of existing variable a
		a=50;
		System.out.println("Updated value of a :"+a);
//	multiple variable declaration
//		Approach1
		int A=1;
		int B=2;
		int C=3;
//		Approach2
		int x,y,z;
		x=3;
		y=4;
		z=5;
//		Approach3
        int X=4,Y=5,Z=8;
        
//      Concatinating the variable in one print statement
        System.out.println(X+" "+Y+" "+Z);
        
//      Datatypes Primitive
//        Integers
        byte a0=1;
        System.out.println(a0);
        short a1=2;
        System.out.println(a1);
        int a2=3;
        System.out.println(a2);
        long a3=454876288L;
        System.out.println(a3);
//        Decimal number
        float b1=3.0F;
        System.out.println(b1);
        double b2=4.0F;
        System.out.println(b2);
//        boolean and char
        boolean c=true;
        System.out.println(c);
        char d='1';  
        System.out.println(d);
//        String value
        String name="Nikita";
        System.out.println(name); 
        
	}

}
