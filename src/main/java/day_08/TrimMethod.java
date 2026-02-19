package day_08;

public class TrimMethod {

	public static void main(String[] args) {
		
    String s="   Welcome   ";
    System.out.println("Length of s before trim: "+s.length());
    System.out.println(s);
    System.out.print("Length of s after trim: ");
    
//  removes the space present in the starting of line
    System.out.println(s.trim().length());
    System.out.println(s.trim());
    
	}

}
