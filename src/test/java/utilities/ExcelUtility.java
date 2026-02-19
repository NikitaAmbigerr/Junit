package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	public FileInputStream fi;
	public FileOutputStream fo;
	public XSSFWorkbook workbook;
	public XSSFSheet sheet;
	public XSSFRow row;
	public XSSFCell cell;
	public CellStyle style;
	String path;
	
	public ExcelUtility(String path) {
		
		this.path=path;// to invoke the path
		
	}
	
	public int getRowCount(String sheetName) throws IOException {
		fi=new FileInputStream(path);
		workbook=new XSSFWorkbook(fi);
		sheet=workbook.getSheet(sheetName);
		int rowcount=sheet.getLastRowNum();
		workbook.close();
		fi.close();
		return rowcount;
		
	}
	public int getCellcount(String sheetName, int Rownum) throws IOException {
		fi=new FileInputStream(path);
		workbook=new XSSFWorkbook(fi);
		sheet=workbook.getSheet(sheetName);
		row =sheet.getRow(Rownum);
		int Cellcount=row.getLastCellNum();
		workbook.close();
		fi.close();
		return Cellcount;
		
	}
	
	public String getCellData(String sheetName, int Rownum,int column) throws IOException {
		fi=new FileInputStream(path);
		workbook=new XSSFWorkbook(fi);
		sheet=workbook.getSheet(sheetName);
		row =sheet.getRow(Rownum);
		cell=row.getCell(column);
		
		DataFormatter formatter=new DataFormatter();
		String data;
		try {
			data=formatter.formatCellValue(cell);
		}
		catch(Exception e) {
			data=" ";
		}
		
		workbook.close();
		fi.close();
		return data;
	}
	
	public int getCellcount(String sheetName, int Rownum,int column,String data) throws IOException {
		File xlfile=new File(path);
//		If file not Exist Create new File 
		if(!xlfile.exists()) {
			workbook=new XSSFWorkbook(fi);
			fo=new FileOutputStream(path);
			workbook.write(fo);
		}
		
		
		fi=new FileInputStream(path);
		workbook=new XSSFWorkbook(fi);
		
//		If sheet not Exist Create new sheet
		if(workbook.getSheetIndex(sheetName)==-1)
		workbook.createSheet(sheetName);
		sheet=workbook.getSheet(sheetName);
		
//		If Row not Exist Create new Row
		if(sheet.getRow(Rownum)==null)
		sheet.createRow(Rownum);
		row=sheet.getRow(Rownum);
			
			
		cell=row.createCell(column);
		cell.setCellValue(data);
		fo=new FileOutputStream(path);
		workbook.write(fo);
		workbook.close();
		fi.close();
		fo.close();
		return Rownum;
		
	}
}
