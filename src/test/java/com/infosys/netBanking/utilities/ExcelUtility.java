package com.infosys.netBanking.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelUtility {
	FileInputStream fis;
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	public void openExcel(String SheetName) {
		
		try {
			 fis= new FileInputStream("C:\\Users\\Pranitha Regalla\\Desktop\\TestData.xlsx");
		
			 workbook= new XSSFWorkbook(fis);
		
		 sheet= workbook.getSheet(SheetName);
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getCellData(int row,int col) {
		if(sheet.getRow(row).getCell(col)!=null) {
			return sheet.getRow(row).getCell(col).toString();	
		}
		else {
			return "";
		}
		
		
	}
	
	public int getRowNum() {
		return sheet.getPhysicalNumberOfRows();
	}
	
	public int getcolNum(int rowIndex) {
		return sheet.getRow(rowIndex).getLastCellNum();
	}
	
	public void closeExcel() {
		try {
			workbook.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@DataProvider(name="Login Details")
    public Object[][] getLoginData(){
		ExcelUtility ex= new ExcelUtility();
		ex.openExcel("TestData");
	int totalRows=	  ex.getRowNum();
     int totalcols=    ex.getcolNum(0);
     Object[][] data=new  Object[totalRows-1][totalcols];
     for(int i=1;i<totalRows;i++) {
    	 for (int j=0;j<totalcols;j++) {
    		 data[i-1][j]=	  ex.getCellData(i, j);
    	 }
     }
		return data;
    	
    }
}
