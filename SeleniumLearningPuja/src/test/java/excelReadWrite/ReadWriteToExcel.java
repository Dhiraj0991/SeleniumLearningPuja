package excelReadWrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadWriteToExcel
{
	static XSSFWorkbook wb;
	static XSSFSheet sheet;

	public static void main(String[] args) throws Exception {

		String data = null;
		File source = new File("F:\\JAVA\\Selenium\\Test_Data.xlsx");
		FileInputStream input = new FileInputStream(source);
		XSSFWorkbook wb = new XSSFWorkbook(input);
//		XSSFSheet sheet = wb.getSheetAt(0);

//		// String data0=sheet.getRow(0).getCell(1).getStringCellValue();
//		// System.out.println("Data from Excel ="+data0);
//
//		// int rowcount=sheet.getLastRowNum();
//		// int columncount = sheet.getRow(0).getLastCellNum();
//
//		// System.out.println("Total number of row= "+((sheet.getLastRowNum())+1));
//
//		// The number of columns
//		/*
//		 * int numberOfCells = 0; Iterator<Row> rowIterator = sheet.rowIterator();
//		 * 
//		 * if (rowIterator.hasNext()) { Row headerRow = (Row) rowIterator.next(); //get
//		 * the number of cells in the header row numberOfCells =
//		 * headerRow.getPhysicalNumberOfCells(); }
//		 * System.out.println("number of cells "+numberOfCells);
//		 */
//
//		
//		 System.out.println("Total number of row= "+((sheet.getLastRowNum())+1));
//		 
//		 System.out.println("Total number of columns= "+sheet.getRow(0).getLastCellNum()); 
//		 System.out.println("The data from Excel is :\n" );
//		 
//		 for(int i=0;i<=sheet.getLastRowNum();i++) 
//		 { 
//			 for(int j=0;j<sheet.getRow(0).getLastCellNum();j++) 
//			 {
//				 data=sheet.getRow(i).getCell(j).getStringCellValue(); 
//				 System.out.print(data +"    "); 
//			 } 
//			 System.out.println();
//		  
//		  }
//		 

		

		sheet.getRow(0).createCell(1).setCellValue("Titan");

		FileOutputStream output = new FileOutputStream(source);
		wb.write(output);
		wb.close();

		System.out.println("Sucess... !!");

	}
}
