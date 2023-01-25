package com.BasicSelenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.useermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
 

public class ReadingDataFromExcel {
	public static void main(String[]args) throws IOException {
		FileInputStream file = new FileInputStream("E:\\Software\\Selenium practice.xlsx");
		XSSFWorkbook SP = new XSSFWorkbook();
		XSSFSheet Book1 = SP.g
	}
}
