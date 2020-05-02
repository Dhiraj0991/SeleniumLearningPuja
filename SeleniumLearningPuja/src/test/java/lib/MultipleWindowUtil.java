package lib;

import java.util.Iterator;
import java.util.Set;

public class MultipleWindowUtil extends BaseClass
{

	public MultipleWindowUtil() throws Exception
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public static void switchToWindow(int index)
	{
		
		String windowID=null;
		Set<String> windowIds= driver.getWindowHandles();
		Iterator<String> iter=windowIds.iterator();
		
		for (int i = 1; i <=index; i++)
		{
			windowID=iter.next();
		}
		
		driver.switchTo().window(windowID);
	}
}
