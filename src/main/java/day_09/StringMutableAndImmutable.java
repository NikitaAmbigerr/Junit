package day_09;

import java.util.Arrays;

public class StringMutableAndImmutable {

	public static void main(String[] args) {
//      Mutable
		int a[]= {50,80,20,90,70,30};
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        
//    String Immutable
        String s=new String("Welcome");
        System.out.println(s);
        s.concat(" to java");
        System.out.println(s);
        

	}

}
