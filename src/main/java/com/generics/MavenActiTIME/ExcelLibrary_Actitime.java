package com.generics.MavenActiTIME;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelLibrary_Actitime implements AutoConstant_Actitime {
	public static String getcellvalue(String path,String sheet,int row,int cell) throws IOException {
		FileInputStream fis=new FileInputStream(excel_path);
	//	FileInputStream fis=new FileInputStream(excel_path);//paste path of excel file
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		String cellValue=wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		return cellValue;

}}


