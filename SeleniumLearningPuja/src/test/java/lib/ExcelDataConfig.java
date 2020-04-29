package lib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelDataConfig
{
	File source;
	public static HSSFWorkbook wb;
	public static HSSFSheet sheet;
	
	
	public ExcelDataConfig(String excelPath)
	{
		try 
		{
			source=new File(excelPath);
			FileInputStream input=new FileInputStream(source);
			wb= new HSSFWorkbook(input);
			sheet= wb.getSheetAt(0);
			
		} 
		 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
	}
	
	public String getData(String Sheetname, int rownumber,int columnnumber)
	{
		
		sheet= wb.getSheet(Sheetname);
		//Sheet=wb.getSheet("Dhiraj");
		String data=sheet.getRow(rownumber).getCell(columnnumber).getStringCellValue();
		
		return data;
	}
	
	public void getExcelFullData(String excelPath, String sheetName) throws Exception
	{
		String data = null;
		sheet = wb.getSheet(sheetName);
		
		int rowCount=((sheet.getLastRowNum())+1);
		int colCount=sheet.getRow(0).getLastCellNum();
		
		System.out.println("Total number of row= "+((sheet.getLastRowNum())+1));
		 
		 System.out.println("Total number of columns= "+sheet.getRow(0).getLastCellNum()); 
		 System.out.println("The data from Excel is :\n" );
		 
		 
		 
		 for(int i=0;i<rowCount;i++) 
		 { 
			 for(int j=0;j<colCount;j++) 
			 {
				 data=sheet.getRow(i).getCell(j).getStringCellValue(); 
				 System.out.print(data +"    ");			 
			 } 
			 System.out.println();
		  }
		 

//		System.out.println("Success... !!");
	}
	
	public void writeToExcel(String excelPath,String sheetname) throws Exception
	{
		File source=new File(excelPath);
		HSSFWorkbook wb= new HSSFWorkbook();
		HSSFSheet Sheet= wb.createSheet(sheetname);
				
		
		
		Object[][] BagicTestingTeam=
			{
				{"Firstname","Surname"},
        		{"Gaurav","Dwivedy"},
                {"Puja","Das"},
                {"Dhiraj","Mishra"}
			};
		
		
		int rownum = 0;
		
		for(Object[] team : BagicTestingTeam)
		{
			HSSFRow Row= Sheet.createRow(rownum++);
			
			int colnum = 0;

			for(Object value : team)
			{
				HSSFCell Cell= Row.createCell(colnum++);
				if (value instanceof String)
                {
                    Cell.setCellValue((String) value);
                } 
                else if (value instanceof Integer) 
                {
                    Cell.setCellValue((Integer) value);
                }
			}
		}
		
		
		
		
		//Save the file
		
		wb.write(new FileOutputStream(source));
		
		wb.close();
	}
	
	
}
