package day_06;


public class MultiDimentionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int a[][]=new int[2][3];
	a[0][0]=2;
	a[0][1]=3;
	a[1][0]=4;
	a[1][1]=5;
	a[1][2]=6;
	System.out.println(a.length);
	System.out.println(a[0].length);
	
	for(int i=0;i<2;i++){       //length 2rows
		for(int j=0;j<3;j++) {	//bredth 3
			System.out.print(a[i][j]+" ");	
		}
		System.out.print(" ");	
	}
	
	int x[][]= {{0,1},{1,2},{2,3}};
	System.out.println("Length of Array:"+x.length);
	System.out.println("bredth of Array:"+x[0].length);
	}
}
