package day_08;

public class EqualsIgnoreCase {
    public static void main(String[] args) {
        String str1 = "Hello World!";
        String str2 = "hello world!";
        String str3 = "HELLO, WORLD!";
       if(str1==str2) {
    	   System.out.println(true);
       }
       else {
    	   System.out.println(false);
       }
        boolean isitEqual = str1.equalsIgnoreCase(str2);
        System.out.println("str1 equals str2 (ignoring case)? " + isitEqual); // Output: true
 
        isitEqual = str1.equalsIgnoreCase(str3);
        System.out.println("str1 equals str3 (ignoring case)? " + isitEqual); // Output: true
    }
}

