package assignment;

public class Day8_A1 {

	public static void main(String[] args) {
// 		Revers a string using length() and CharAt()
		
		String name="nikita";
		int len=name.length();
		System.out.println("Using length(),CharAt()");		
		for(int i=len-1;i>=0;i--) {
			
			char Name=name.charAt(i);
			System.out.print(Name);
		}
		
		System.out.println();
		
//		Reversing the string without usong String methods
		System.out.println("Using Array");
		String s="Welcome";
		char a[]=s.toCharArray();
		
		for(int i=(a.length-1);i>=0;i--) {
			System.out.print(a[i]);
		}
		
		System.out.println();
		
//		StringBuffer class
		StringBuffer b=new StringBuffer("NikitaAmbiger");
		System.out.println(b.reverse());
		
//		StringBuilder Class
		StringBuilder c=new StringBuilder("Abhishek");
		System.out.println(c.reverse());
	}

}
