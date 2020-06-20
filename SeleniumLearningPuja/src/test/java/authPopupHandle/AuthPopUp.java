package authPopupHandle;

import org.testng.annotations.Test;

import lib.BaseClass;

public class AuthPopUp extends BaseClass 
{

	@Test
	public void authPopupTest()
	{
		String username="admin";
		String password="admin";
		driver.get("http://"+username+":"+password+"@"+"the-internet.herokuapp.com/basic_auth");
	}
}
