package openNotepadInMydesktop;

import java.awt.Desktop;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class OpenDesktopTextFile
{
	public static void main(String[] args) throws Exception
	{
		Desktop d = Desktop.getDesktop();
		try
		{
			String path="C:\\Users\\PUJA\\Desktop\\New folder\\java\\language.docx";
			d.open(new File(path));
			PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(path, true)));
			out.println("Selenium");
			//out.flush();
			Thread.sleep(2000);
			out.close();
		} 
		catch (IOException e)
		{
			// e.printStackTrace();
			System.out.println(e);
		}
		Thread.sleep(2000);
		Runtime.getRuntime().exec("taskkill /IM WINWORD.exe");
	}

}
