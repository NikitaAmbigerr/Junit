package day_08;

public class Concatination_of_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String s1="Hello";
 String	s2="World";
 System.out.println("Hello "+"World");
 System.out.println(s1+" "+s2);
 
//concat method for more than two string
 System.out.println(s1.concat(" ").concat(s2));
 
 System.out.println(s1.concat(" "+s2));
 System.out.println("Welocme".concat(" to "+"Java"));
	}

}
