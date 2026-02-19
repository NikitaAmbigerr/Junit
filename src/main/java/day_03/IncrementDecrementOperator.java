package day_03;

public class IncrementDecrementOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Increment operator
		int d1=5;
		int d2=5;
		int result1=d1++;//Post Increment
		int result2=++d2;//Pre Increment
		System.out.println(result1);//post increment value get updated only after assigning value
		System.out.println(d1);
		System.out.println(result2);

//		Decrement Operator
		int d3=10;
		int d4=10;
		int res3=--d3;//pre decrement
		int res4=d4--;//post decrement
		System.out.println(res3);
		System.out.println(res4);
		System.out.println(d4);

	}

}
