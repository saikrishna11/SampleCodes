package com.minnu.task1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class task2b {
	static XSSFRow row;

	public static void main(String[] args) throws Exception{
		FileInputStream fis = new FileInputStream(new File("task2a.xlsx"));
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet spreadsheet = workbook.getSheetAt(0);
		Iterator < Row > rowIterator = spreadsheet.iterator();
	     Cell c1,c2,c3,cell = null;
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
	      }
	      
	      System.out.println("===============After Modification===============");
	      double max,min;
	      for(int i=1;i<=10;i++)
	      {
	    	  c1 = spreadsheet.getRow(i).getCell(0);  
	    	  double l = c1.getNumericCellValue();
	          
	          c2 = spreadsheet.getRow(i).getCell(1);
	    	  double b = c2.getNumericCellValue();
	    	  
	          c3 = spreadsheet.getRow(i).createCell(2);
	          if(l>b){
	        	  max = l;
	        	  min = b;
	          }
	          else{
	        	  max = b;
	        	  min = l;
	          }
	          System.out.print(max+"\t\t");
	          spreadsheet.getRow(i).createCell(0).setCellValue(max);     
	    	  System.out.print(min+"\t\t");
	    	  spreadsheet.getRow(i).createCell(1).setCellValue(min);
	          double p = perimeterofRectangle(l,b);
	          c3.setCellValue(p);
	          System.out.println(p);
	          //c2.setCellValue(p);
	          //System.out.println(p);
	          //c2.setCellType(cell.CELL_TYPE_NUMERIC);
	          //System.out.println(c2.setCellValue(p));
	          fis.close(); 
	          FileOutputStream output_file =new FileOutputStream(new File("task2b.xlsx"));  
	          workbook.write(output_file); 
	          output_file.close();
	      }

	}

	private static double perimeterofRectangle(double d,double e) 
	{
		
		double p=d*e;

		return p;
	}

}
