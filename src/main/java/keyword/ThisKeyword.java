package keyword;

public class ThisKeyword {
	int a=2;                 // Global variable
    public void method1() {
    	int a=5;             // Local variable
    	System.out.println(a);
    	System.out.println("The Variable A is of current class:"+this.a);
    	/*this keyword is a reference variable that points to the current object within an instance method or constructor, 
    	allowing you to access instance variables and methods, 
    	and also to invoke constructors from other constructors within the same class.*/ 
    
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ThisKeyword tk=new ThisKeyword();
        tk.method1();
	}

}
