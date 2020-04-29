package excelReadWrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.log.output.FileOutputLogTarget;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.testng.annotations.Test;

public class ReadWrite
{
	@Test
	public void readWriteDataFromExcel() throws Exception
	{
		String data="null";
		File sourceFile=new File("C:\\Users\\PUJA\\Desktop\\New folder\\java\\Testnew.xls");
		FileInputStream input = new FileInputStream(sourceFile);
		HSSFWorkbook wb=new HSSFWorkbook(input);
		HSSFSheet sheet= wb.getSheetAt(0);
		String data0=sheet.getRow(0).getCell(0).getStringCellValue();
		System.out.println(data0);
		int rowCount=sheet.getLastRowNum()+1;
		int colCount=sheet.getRow(0).getLastCellNum();
		System.out.println("Number of row :"+rowCount);
		System.out.println("Number of column : "+colCount);
		for (int i = 0; i < rowCount; i++)
		{
			for (int j = 0; j < colCount; j++)
			{
				data=sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(data+"  ");
				
			}
			System.out.println();
		}
		sheet.getRow(0).createCell(0).setCellValue("puja");
		FileOutputStream output=new FileOutputStream(sourceFile);
		wb.write(output);
		wb.close();
	}
}
