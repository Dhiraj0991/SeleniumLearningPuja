package openNotepadInMydesktop;

import java.awt.Desktop;
import java.io.File;

public class DsktopFile
{
	public static void main(String[] args) throws Exception
	{
		 File file = new File("C:\\Users\\PUJA\\Desktop\\New folder\\java\\link.txt");
		    
		  //first check if Desktop is supported by Platform or not
		    if(!Desktop.isDesktopSupported()){
		        System.out.println("Desktop is not supported");
		        return;
		    }
		    
		    Desktop desktop = Desktop.getDesktop();
		    if(file.exists()) desktop.open(file);
		    Thread.sleep(2000);
		    Runtime.getRuntime().exec("taskkill /IM notepad.exe");
		  
		    
		    
	}
}
