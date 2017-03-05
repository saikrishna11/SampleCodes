package com.minnu.task1;

import java.io.*;
import java.util.*;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;

public class task1b {
	static XSSFRow row;
	   public static void main(String[] args) throws Exception 
	   {
		   FileInputStream fis = new FileInputStream(new File("task1a.xlsx"));
		   XSSFWorkbook workbook = new XSSFWorkbook(fis);
		   XSSFSheet spreadsheet = workbook.getSheetAt(0);
	      
	     Iterator < Row > rowIterator = spreadsheet.iterator();
	     Cell c1,c2,cell = null;
	      while (rowIterator.hasNext()) 
	      {
	         row = (XSSFRow) rowIterator.next();
	         Iterator < Cell > cellIterator = row.cellIterator();
	         while ( cellIterator.hasNext()) 
	         {
	            cell = cellIterator.next();
	            switch (cell.getCellType()) 
	            {
	               case Cell.CELL_TYPE_NUMERIC:
	               System.out.print(cell.getNumericCellValue() +"\t\t" );
	               break;
	               case Cell.CELL_TYPE_STRING:
	               System.out.print(cell.getStringCellValue() + " \t\t" );
	               break;           	   
	            }
	         }
	         System.out.println();
	      } //Cell cell = null; // declare a Cell object
	      
	      System.out.println("===============After Modification===============");
	      
	      for(int i=1;i<=cell.getRowIndex();i++)
	      {
	    	  c1 = spreadsheet.getRow(i).getCell(0);   
	          System.out.print(c1.getNumericCellValue()+"\t\t"); 
	          c2 = spreadsheet.getRow(i).createCell(1);
	          double p = perimeterofCircle(c1.getNumericCellValue());
	          c2.setCellValue(p);
	          System.out.println(p);
	          //c2.setCellType(cell.CELL_TYPE_NUMERIC);
	          //System.out.println(c2.setCellValue(p));
	          fis.close(); 
	          FileOutputStream output_file =new FileOutputStream(new File("task1b.xlsx"));  
	          workbook.write(output_file); 
	          output_file.close();
	      }
	      

	   }
	   
	private static double perimeterofCircle(double c1) {
		double pc =  2*Math.PI*c1;
		return pc;
	}
}
