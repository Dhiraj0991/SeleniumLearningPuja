package demoSendEmail;

import org.testng.annotations.Test;

import lib.SendTestReportInEmail;

public class SendEmail
{

	SendTestReportInEmail email=new SendTestReportInEmail();
	
	@Test
	public void emailSendTest() throws Exception
	{
		String to[] =
			{ "pujamaths9@gmail.com" ,"dheeru.nmishra@gmail.com"};
		
		email.send("deo.umishra0991@gmail.com", to, "Automation Test Report", "Check the attachment.");
	}
}
