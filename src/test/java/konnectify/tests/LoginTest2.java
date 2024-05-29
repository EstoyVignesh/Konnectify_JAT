package konnectify.tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import konnectify.utils.Kwrapper;
import konnectify.utils.Reports;
import konnectify.utils.SeWrappers;



public class LoginTest2 extends SeWrappers
{
	Kwrapper k = new Kwrapper();
	Reports report = new Reports();
	
	
	@Parameters({"browser","url"})
	@Test
	public void LoginTest(String browserName, String url)
	{
		try {
			report.setTCDesc("Validating the Login Page with Correct Data");
			launchCrossBrowser(browserName,url);
			
			k.Login2("vignesh000vky@gmail.com","@vickyKofy123");	
	      }
		
	
	catch(Exception ex)
	{
		System.out.println("Problem while validating Signup");
		ex.printStackTrace();
	}
		
		
	
}
	

	
}

