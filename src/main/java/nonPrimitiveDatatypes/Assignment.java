package nonPrimitiveDatatypes;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//     Find sum of elements in array
		int a[]= {1,2,3,4,5};	
		int sum =0;
		for(int i=0;i<a.length;i++) {
			 sum+=a[i];
		}
		System.out.println("The sum of Array elements is: "+sum);
		
//	   Print even and odd elements of array
		int b[]= {1,2,3,4,5,6};
		
		for (int i=0;i<b.length;i++) {
			if(b[i]%2!=0) {
				System.out.println("The odd numbers are: ");
				System.out.println(b[i]);
			}
			
			else {
				System.out.println("The even numbers are: ");
				System.out.println(b[i]);
			}
		}
		
		
		
	}

}
