package keyword;

public class Static {
       static int a=1;
       static int b=2;
       int c=3;
       static void add() {
    	   System.out.println(a+b);
       }
       void sub() {
    	   System.out.println(a-b);
       }
	public static void main(String[]args) {
		add();//Static method calling
		Static s=new Static();//object creation for non static method 
		s.sub();//non static method calling
		System.out.println(s.c);//non static variable callin
	}
}
