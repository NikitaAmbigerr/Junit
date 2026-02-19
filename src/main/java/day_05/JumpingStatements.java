package day_05;

public class JumpingStatements {

	public static void main(String[] args) {
//      Example1
		for(int i=1;i<=10;i++) {
			if(i==5) {
				break;
				}
		System.out.println(i);
		}
//		Example2
		for(int j=1;j<=10;j++) {
		if(j==3||j==5||j==9) {
//			skips 3,5,9 in print statement 
			continue;
		}
		System.out.println(j);
		}
	}

}
