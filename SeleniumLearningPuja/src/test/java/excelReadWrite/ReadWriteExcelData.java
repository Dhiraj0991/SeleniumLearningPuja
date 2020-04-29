package excelReadWrite;

import org.testng.annotations.Test;
import lib.ExcelDataConfig;

public class ReadWriteExcelData
{
	@Test
	public void readWriteExcel() throws Exception 
	{
	 
		String path="C:\\Users\\PUJA\\Desktop\\New folder\\java\\Testnew123.xls";
		ExcelDataConfig excel=new ExcelDataConfig(path);
//		System.out.println(excel.getData(0, 0, 0));
		excel.writeToExcel(path,"Dhiraj Testing Team");
		System.out.println("Data Written Successfully...");
		excel=new ExcelDataConfig(path);
//		System.out.println("The new Data Written is:"+excel.getData(0, 0, 0));
		excel.getExcelFullData(path,"Dhiraj Testing Team");

	}

}
