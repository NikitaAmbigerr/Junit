package day_03;

public class TernaryOperator {

	public static void main(String[] args) {
		// var=expression?result1:result2
		
//		Example1
		int a=6 ,b=7;
		int x=a>b?a:b; // if true returns a else returns b
		System.out.println(x+" is greater number");
		
		
//		Find the number of uppercase and Lower case letters from a String
		
		String A="RaDhA";
		int L=A.length();
		String B=A.toUpperCase();
        int Ucount=0;
        int Lcount=0;
        for (int i=0;i<L;i++) {
        	if(A.charAt(i)==B.charAt(i)) {
        	Ucount++;
        	}
        	else {
        		Lcount++;
        	}
        	
        }
        System.out.println("Total number of Uppercase Letters in a String= "+Ucount);
        System.out.println("Total number of Lowercase Letters in a String= "+Lcount);
	}

}
