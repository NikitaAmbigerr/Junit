package day_07;

public class Array_Example2 {

	public static void main(String[] args) {
		// count the repetation of number
       int a[]= {1,2,3,4,5,6,7,9,5,8,3,4,6,4,8,3,8,8,8,8};
       int num=8;
       int count=0;
       for(int value:a) {
    	   
    	   if(value==num) {
    		   count++;
    	   }   
       }
       System.out.println("The number "+num+" is repeated " + count+ " Times");
	}

}
