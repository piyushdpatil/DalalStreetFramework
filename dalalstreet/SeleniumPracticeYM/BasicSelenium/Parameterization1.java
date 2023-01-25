package com.BasicSelenium;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.useermodel.XSSFWorkbook;
import org.openqa.selenium.*;



public class Parameterization1 {
	public static void main (String []args) throws IOException{
		//Path of file 
		FileInputStream fs = new FileInputStream("E:\\Software\\ParamerTest.xlsx")
		
		//Workbook 
		XSSFWorkbook Workbook = new XSSFWorkbook(fs);
		
		// Sheet
		XSSfSheet Sheet = Workbook.getSheetAt(@)
}
