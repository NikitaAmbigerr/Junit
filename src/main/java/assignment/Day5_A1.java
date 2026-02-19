package assignment;

public class Day5_A1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Reverse the numbers using (%,/,= )operators
		int num=1234;
		int rev=0;
		while(num!=0) {
			rev=rev*10+num%10;//0*10+1234%10=4|4*10+123%10=40+3|43*10+12%10=430+2|432*10+1%10=4320+1|
			num=num/10;//1234/10=123.4|123/10|12/10|1/10|;				
		}	
		System.out.println(rev);
	}

}
