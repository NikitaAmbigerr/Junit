package assignment;

public class Day6_A1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//find the sum of elements in array
		int num[]= {1,2,3,4,5};
		int sum=0;
		int len=num.length;
		
		for(int i=0;i<len;i++) {
			sum+=num[i];		
		}
		System.out.println(sum);
	}

}
