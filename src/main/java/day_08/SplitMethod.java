package day_08;

import java.util.Arrays;

public class SplitMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a="nikita123@gmail@,com,comma";
String n[]=a.split("@");
System.out.println(Arrays.toString(n));
System.out.println(n[0]);
System.out.println(n[1]);
System.out.println(n[2]);

String arr[]=n[2].split(",");
System.out.println(Arrays.toString(arr));
System.out.println(arr[1]);
System.out.println(arr[2]);
	}

}
