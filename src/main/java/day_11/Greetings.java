package day_11;

public class Greetings {
//1.no Parameters, no return type
	
	void m1() {
		System.out.println("hello...");
	}
//2.no parameter ,with return type
	int m2() {
		int age=5;
		return age;
	}
//3.parameter with return type
	String m3(String name) {
		return name;
	}
//4.parameter with no return type
	void m4(String a) {
		System.out.println(a);
	}
}
