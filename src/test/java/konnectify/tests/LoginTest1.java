package konnectify.tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import konnectify.utils.Kwrapper;
import konnectify.utils.Reports;
import konnectify.utils.SeWrappers;



public class LoginTest1 extends SeWrappers
{
	Kwrapper k = new Kwrapper();
	Reports report = new Reports();
	
	
	@Parameters({"browser","url"})
	@Test
	public void LoginTest(String browserName, String url)
	{
		try {
			report.setTCDesc("Validating the Login Page with Incorrect Data");
			launchCrossBrowser(browserName,url);
			
			k.Login1("124vky#@gmail.com","@vickyKofy12345");	
	      }
		
	
	catch(Exception ex)
	{
		System.out.println("Problem while validating Signup");
		ex.printStackTrace();
	}
		
		
	
}
	

	
}

