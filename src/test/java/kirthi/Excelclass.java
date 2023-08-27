package kirthi;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class Excelclass {

	public static void main(String[] args) {
		
		File location = new File 
		
		FileInputStream input = new FileInputStream(location);
		
		Workbook w = new XSSFWorkbook(input);
		
		Sheet s = w.getSheet("sheet1");
		
			Row r =	s.getRow(0);
			Cell c = r.getCell(0);
			System.out.println(c);
			
		// TODO Auto-generated method stub

	}

}
