package day_04;

public class NestedIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     if(true) {
    	 System.out.println("first if condition is true");
    	 if(true) {
    		 System.out.println("second if condition is true");
    		 if(true) {
    			 System.out.println("This is nested ifelse");
    		 }
    		 else 
    		 {
    			 System.out.println("Third if condition is not true");
    		 }
    	 }
    	 else 
    	 {
    		 System.out.println("second if condition is not true");
    	 }
     }
     else 
     {
    	 System.out.println("first if condition isnot true");
     }
	}

}
