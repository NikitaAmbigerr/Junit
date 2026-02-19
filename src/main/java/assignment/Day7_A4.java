package assignment;

public class Day7_A4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {20,10,50,30,80,60,5};
int min=a[0];

for(int i=0;i<a.length;i++) {
	if(a[i]<min) {
		min=a[i];
		
	}
}
System.out.println("The Smallest value of the Array is : "+min);

	}

}
