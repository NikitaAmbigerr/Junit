package utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviders {
	
//	Data Provider 1
	@DataProvider(name="Login_Data")
	public String [][] getData() throws IOException{
		
		String path="C:\\Users\\win 10\\eclipse-workspace\\SDET-HybridFrameWork\\testData\\Book 7.xlsx";//Taking xl file from test data
		
		ExcelUtility xlutil=new ExcelUtility(path);//creating object of excel utility
		
		int totalrows=xlutil.getRowCount("sheet1");
		int totalcols=xlutil.getCellcount("sheet1", 1);
		
		String LoginData [][]=new String[totalrows][totalcols];//created two dimentional array which stors password and email
		
		for(int i=1;i<=totalrows;i++) {//1,i is row for loop to read the data stored in two dimentional array
			
			for(int j=0;j<totalcols;j++) {// 0, j is col
				
				LoginData[i-1][j]=xlutil.getCellData("sheet1",i,j);//1,0
			}
		}
		return LoginData;
		
	}
	
}
