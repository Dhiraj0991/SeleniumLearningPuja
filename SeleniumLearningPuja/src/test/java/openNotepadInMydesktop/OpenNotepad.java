package openNotepadInMydesktop;

import java.awt.Desktop;
import java.io.*;

public class OpenNotepad
{
	public static void main(String[] args)throws Exception 
	{
//		Runtime rs = Runtime.getRuntime();
//
//		try
//		{
//			rs.exec("notepad");
//		} 
//		catch (IOException e)
//		{
//			System.out.println(e);
//		}
//	}
	
		//text file, should be opening in default text editor
    File file = new File("C:\\Users\\PUJA\\Desktop\\New folder\\java\\note.txt");
    
  //first check if Desktop is supported by Platform or not
    if(!Desktop.isDesktopSupported()){
        System.out.println("Desktop is not supported");
        return;
    }
    
    Desktop desktop = Desktop.getDesktop();
    if(file.exists()) desktop.open(file);
    Thread.sleep(2000);
    Runtime.getRuntime().exec("taskkill /IM notepad.exe");
  
    
    
    
    
    
    //let's try to open PDF file
//    file = new File("/Users/pankaj/java.pdf");
//    if(file.exists()) desktop.open(file);
}
	
	
	
	
	
	
	
}
