package UtilitiesFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven22
{
	public static XSSFWorkbook wb;
	public static XSSFSheet ws;
	public static XSSFRow row;
	public static XSSFCell cl;
	public static FileInputStream fn;
  
	public static int getRowCount(String filename,String sheetname ) throws Exception 
	{
		fn=new FileInputStream(filename);
		wb=new XSSFWorkbook(fn);
		int totalrow=ws.getLastRowNum()+1;
		wb.close();
		return totalrow;
	}
	public static int getColCount(String filename,String sheetname ) throws Exception 
	{
		fn=new FileInputStream(filename);
		wb=new XSSFWorkbook(fn);
		int totalcol=ws.getRow(0).getLastCellNum();
		wb.close();
		return totalcol;
		
	}
	public static String getCellvalue(String filename,String sheetname ,int r,int c) throws Exception 
	{
		fn=new FileInputStream(filename);
		wb=new XSSFWorkbook(fn);
		ws=wb.getSheet(sheetname);
		cl=wb.getSheet(sheetname).getRow(r).getCell(c);
		wb.close();
		return cl.getStringCellValue();
	}
}
