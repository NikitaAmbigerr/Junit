package assignment;

public class Day6_A2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//print even and odd numbers from the array
		int num[]= {1,2,3,4,5,6};
		int len=num.length;
		
		for(int i=0;i<len;i++) {
			if(num[i]%2==0) {
				System.out.println("num is even: "+num[i]);
			}
			if(num[i]%2!=0){
				System.out.println("num is odd: "+num[i]);
			}
		}
		
	}

}
