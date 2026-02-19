package day_10;

public class Employee {
//  variables
	int eid;
	String Ename;
	String job;
	double sal;
	
// Constructor	
	Employee(){
		System.out.println("constructor");
	}
	
// methods
//1.with no return type
void display(){
	
	System.out.println(eid);
	System.out.println(Ename);
	System.out.println(job);
	System.out.println(sal);
	}
//2.With returntype
String display2(String a) {
	System.out.println(a);
	return a;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee();
		e1.eid=01;
		e1.Ename="Shakira";
		e1.job="STE";
		e1.sal=4.5;
		e1.display();
		e1.display2("welcome to java");
	}

}
