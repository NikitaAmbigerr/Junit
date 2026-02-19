package assignment;

public class Day7_A3 {

	public static void main(String[] args) {
		// find Largest number in array
int a[]= {1,4,5,8,9,4,3,1};
int max=a[0];//consider one value as max

for(int i=1;i<a.length;i++) {	//for loop to read the array elements
	
	if(a[i]>max) {	//if condition to compare each and every elemet eith considered max value
		
		max=a[i]; //if the consition is satisfied update the max value with array element
	}
}
System.out.println(max);  
	}

}
