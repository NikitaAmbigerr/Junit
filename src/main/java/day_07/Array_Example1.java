package day_07;

public class Array_Example1 {

	public static void main(String[] args) {
		
//  Search an Element in array(Linear Searching)
		int a[]= {10,20,300,40,60,100,70,80,90};
		int ele=300;
		boolean status=false;
		for(int i=0;i<a.length;i++) {
			if(a[i]==ele) {
				System.out.println("The element "+ele +" You are searching for is Present");
				status=true;
				break;
			}
		}
		if (status==false)
		System.out.println("Element not found");
	}

}
