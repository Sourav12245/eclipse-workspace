package excelReader;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import configfiles.config;

/**
 * @author sourav.e.ghosh
 *
 */
public class Excelworks extends config{
	/*
	 * Read excel data
	 * Attribute:
	 * Sheetnumber: Give the sheet number
	 * rownumber: Provide the row number to retrive the data
	 * colnumber: Provide the column number to retrive the data
	 */
		
		public static String readexceldata(String fileloc,int Sheetnumber, int rownumber, int colnumber) throws Exception{
			File src = new File(fileloc);
			FileInputStream fis = new FileInputStream(src);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sheet = wb.getSheetAt(Sheetnumber);
			Cell s = sheet.getRow(rownumber).getCell(colnumber);
			s.setCellType(Cell.CELL_TYPE_STRING);
			String data = s.getStringCellValue();
			return data;
		}



}

